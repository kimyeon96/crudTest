package com.example.crudtest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//임포트 하는게 롬복 라이브러리를 쓴다는 것
// 롬복이 라이브러리, 워낙 양이 많아서 안에 어떤 자료를 쓰는지 알지는 못함.
// 롬복에 있는 기능을 쓰려고 임포트 해서 쓰는것
//userDto.setuser 을 쓰면 userDto클래스 안에 .이 안에꺼를 골라쓰는것, userDto안에 함수를
// .이 앞에는 클래스명 뒤에는 함수명 느낌
//.이 상위 객체, 하위 객체
//this는 this를 쓰면

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {


    private String userId;
    private String userPw;

    public UserDto(String userId) {
        this.userId = userId;
    }
}
