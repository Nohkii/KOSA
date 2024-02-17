package thymeleaf.exam;

import lombok.Data;
import lombok.NonNull;

@Data
public  class User {
    @NonNull
    private String userName;
    @NonNull // 변수에 값을 넣지 않았다,,?
    private int age;
}
