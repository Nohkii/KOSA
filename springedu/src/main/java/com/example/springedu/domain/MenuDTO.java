package com.example.springedu.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuDTO {
    private int menuId;
    private String menuName;
    private int price;
    private String menuDesc;
    private int storeId; // store 참조
    // private String dessertId; dessert 참조
    private String menuImagePath;
    //private String menuImageFilename; 파일 이름 추가
    // private String menuImageFilePath; 파일 이름 추가
    // private byte[] image; 삭제
}
