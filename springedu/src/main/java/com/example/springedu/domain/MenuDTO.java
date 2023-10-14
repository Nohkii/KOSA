package com.example.springedu.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuDTO {
    private int menuId;
    private int storeId;
    private String menuName;
    private int price;
    private String menuDesc;
    private String dessertId;
    private byte[] image;
}
