package com.tikkeul.app;

import com.tikkeul.app.domain.dto.MypageDTO;
import com.tikkeul.app.domain.vo.UserVO;
import com.tikkeul.app.mapper.UserMapper;
import com.tikkeul.app.service.mypage.MypageService;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
public class UserMapperTests {
//  관리자페이지가 만듬

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MypageService mypageService;

//  관리자페이지가 만듬(어드민단위 테스트)
    @Test
    public void adminselectTest(){
      assertThat(userMapper.adminSelectUserAll()).hasSize(0);

    }


//  회원가입
    @Test
    public void joinTest(){
        UserVO userVO = new UserVO();
        userVO.setIdentification("a");
        userVO.setPassword("b");
        userVO.setName("홍홍홍");
        userVO.setRoll("normal");
        userVO.setPhoneNumber("010-1231-1123");
        userVO.setProfileImageName("A");
        userVO.setProfileImageUuid("a");
        userVO.setProfileImagePath("a");
        userVO.setLevelId(2L);
        userMapper.insert(userVO);

    }

    @Test
    public void mypageTest() {
        Assertions.assertThat(mypageService.getMypage(0L)).toString();
    }

    @Test
    public void jjimTest(){

    }
}
