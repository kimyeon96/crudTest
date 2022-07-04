package com.example.crudtest.dto;

import lombok.Data;

import java.util.List;

@Data
public class UpdateUserDto {

    private List<UserDto> updateUserList;
    //리스트는 그냥 리스트 형태, 정보형태 (int형이나 그런 느낌) <>안에 들어간 애는 앞에 있는 애랑 똑같음 List안에 넣을 형태는 userDto다 updateUserList는 그냥 변수명
    /*arrayList할때 해쉬맵 넣어잖음? 해쉬맵*/
}
