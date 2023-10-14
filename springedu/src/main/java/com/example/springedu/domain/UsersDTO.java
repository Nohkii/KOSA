package com.example.springedu.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsersDTO {
    private String userId;
    private String userPassword;
    private String userName;
    private String nickname;
    private String email;
    private byte[] image;
}
