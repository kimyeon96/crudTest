package com.example.crudtest.mapper;

import com.example.crudtest.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    // 유저 등록하기 : create 로직에 사용
    int insertUser(UserDto userDto) throws Exception;
    
    // 유저 아이디 종료 여부 체크 : create 로직에 사용
    int checkUserId(UserDto userDto) throws Exception;

    // 모든 유저 ID 조회하기 : read 로직에 사용
    List<UserDto> readUser() throws Exception; //파라미터가 없으니 뭔가 값을 안 남기고 불러온다' 라는것.

    // UserId, UserPw 조회 : update 로직에 사용
    List<UserDto> readAllUser() throws Exception;

    // User 삭제 : 아이디 기준
    int deleteUser(UserDto userDto) throws Exception; //딜리트인데 userDto 값을 넘김 //예외처리는 여기서 던지겠다 인터페이스에서 처리할 수 없으니, 서비스든 다른 곳에서

    // User 수정 : 아이디 기준 비밀번호 변경 * update foreach, Multi foreach (쓸려면 맵구조, 리스트 구조로 써야됨)
    int updateUser(UserDto userDto) throws Exception;
}

