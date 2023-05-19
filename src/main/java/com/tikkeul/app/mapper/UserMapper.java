package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.vo.UserVO;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    //  관리자페이지에서 회원 리스트 조회
    public List<UserVO> adminSelectUserAll();

    //    아이디 중복검사
    public Optional<UserVO> selectByUserId(String identification);

    //    회원가입
    public void insert(UserVO userVO);

    //    로그인
    @Select("SELECT ID FROM USERS WHERE ID = #{id} AND PASSWORD = #{password}")
    public Optional<Long> selectByUserIdAndUserPassword(@Param("id") String id, @Param("password") String password);

}
