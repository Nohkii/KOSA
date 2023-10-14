package com.example.springedu.dao;

import com.example.springedu.domain.StoreDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StoreDAO {
    //R 다 불러 오는 거
    // user_id 추가??
    @Select("select store_id, store_name, address, phone_number, store_desc, latitude, longitude, image  from store")
    @Results({
            @Result(property = "storeName", column = "store_name"),
            @Result(property = "phoneNumber", column = "phone_number"),
            @Result(property = "storeDesc", column = "store_desc"),
            @Result(property = "image", column = "image")
    })
    public List<StoreDTO> readStore();

    //R 유동적 불러오기 (wherlt re절 컬럼명 = 값)
    @Select("select store_id, store_name, address, phone_number, store_desc, latitude, longitude, image from store where ${cn} = #{v}")
    public List<StoreDTO> readStoreBy(@Param("cn") String columnName, @Param("v") String value);

    //U id 기준으로 가게 정보 수정 (가게이름, 주소, 전화번호, 가게상세설명, 위도, 경도, 사진)
    @Update("update store set store_name = #{storeName}, address= #{address}, phone_number = #{phoneNumber}, store_desc = #{storeDesc}, latitude = #{latitude}, longitude = #{longitude}, image = #{image} where store_id = #{storeId}")
    public boolean updateStore(StoreDTO store);

    //C 가게정보 생성 (가게이름, 주소, 전화번호, 가게상세설명, 위도, 경도, 사진)
    @Insert("insert into store (store_name, address, phone_number, store_desc, latitude, longitude, image) values (#{storeName}, #{address}, #{phoneNumber}, #{storeDesc}, #{latitude}, #{longitude}, #{image})")
    public boolean createStore(StoreDTO store);

    //D id 기준으로 가게 정보 삭제
    @Delete("delete from store where store_id = ${storeId}")
    public boolean deleteStore(String storeId);
}
