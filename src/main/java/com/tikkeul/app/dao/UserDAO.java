package com.tikkeul.app.dao;

import com.tikkeul.app.domain.vo.UserVO;
import com.tikkeul.app.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;
//  정상수의 작업공간









//    홍윤기의 작업공간

    //    아이디 중복검사
    public Optional<UserVO> selectByUserId(String identification){
    return userMapper.selectByUserId(identification);
    };

    //    회원가입
    public void insert(UserVO userVO){
        userMapper.insert(userVO);
    };

    //    로그인
    public Optional<Long> selectByUserIdAndUserPassword(@Param("id") String id, @Param("password") String password){
        return userMapper.selectByUserIdAndUserPassword(id,password);
    };

}
