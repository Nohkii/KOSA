package com.example.springedu.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StoreDTO {
    private String storeId;
    private String storeName;
    private String address;
    private String phoneNumber;
    private String storeDesc;
    private float latitude;
    private float longitude;
    private byte[] image; // 변경
    private List<MenuDTO> menus; // 추가
    private String userId; // 추가
}
