package com.example.springedu.dao;

import com.example.springedu.domain.DessertDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DessertDAO {
    @Insert("insert into dessert (dessert_id, dessert_desc) values (#{dessertId}, #{dessertDesc})")
    public boolean createDessert(DessertDTO dto);

    @Select("select dessert_id, dessert_desc from dessert")
    public List<DessertDTO> readDessert();

    @Update("update dessert set dessert_desc = #{dessertDesc} where dessert_id = #{dessertId}")
    public boolean updateDessert(DessertDTO dto);

    @Delete("delete from dessert where dessert_id = #{dessertId}")
    public boolean deleteDessert(int dessertId);

    @Select("select dessert_id, dessert_desc from dessert where ${cn} = #{v}")
    public List<DessertDTO> readDessertBy(@Param("cn") String columnName, @Param("v") String value);
}
