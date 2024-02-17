package com.example.springedu.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StoreDTO {
    private int storeId; // 변경
    private String storeName;
    private String address;
    private String phoneNumber;
    private String storeDesc;
    private String storeImagePath; // 파일 이름 추가
   // private String storeImageFilename; // 파일 이름 추가
    //private String storeImagePath; // 파일 경로 추가
    private float latitude;
    private float longitude;
    // private byte[] image;  삭제
    // private List<MenuDTO> menus; ..?
    private String userId; // 추가
}
