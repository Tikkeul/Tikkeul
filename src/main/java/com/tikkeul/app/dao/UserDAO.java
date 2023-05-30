package com.tikkeul.app.dao;

import com.tikkeul.app.domain.dto.*;
import com.tikkeul.app.domain.vo.ReviewVO;
import com.tikkeul.app.domain.vo.SavingVO;
import com.tikkeul.app.domain.vo.UserVO;
import com.tikkeul.app.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserDAO {

    private final UserMapper userMapper;

//    홍윤기의 작업공간

//  아이디 중복검사
    public Optional<UserVO> findById(String identification){
        return userMapper.selectById(identification);

    };

//  회원가입
    public RedirectView save(UserVO userVO){
        userVO.setLevelId(0L);
        userMapper.insert(userVO);
        return new RedirectView("/login");
    };
//  카카오계정 업데이트
    public void updatekakao(Optional<UserVO> kakaoUser){
        userMapper.updatekakao(kakaoUser.get());
    }

    //    로그인
    public Optional<UserVO> findByUserIdAndUserPassword( String identification, String password){
        return userMapper.selectByUserIdAndUserPassword(identification,password);
    };

    // 동찬 마이페이지

    public Optional<MypageDTO> findMypage(Long id) {
        return userMapper.select(id);
    }

    //동찬 휴면계정전환
    public void setUserVO(String status, Long id){
        userMapper.update(status,id);
    };


    //비밀번호 변경 동찬
    public void updatepassword(String password, Long id){
        userMapper.updatepassword(password,id);
    };

    //찜 다시 삽입
    public void insertrejjim(Long id, Long itemId){
        userMapper.insertrejjim(id,itemId);
    };

    //찜 삭제
    public void deletejjim(Long id, Long itemId){
        userMapper.deletejjim(id,itemId);
    };

    //후기수정 동찬
    public void sethugisujung(Long id,String content){
        userMapper.updatehugisujung(id,content);
    };

    // 동찬 비밀번호 체크
    public Optional<UserVO> setcheckpassword(Long id, String password){
        return userMapper.selectcheckpassword(id,password);
    };

    //동찬 나의 구매
    public List<MyjumoonDTO> findmyjumoon(Long id){
        return userMapper.selectallmyjumoon(id);
    };


    public List<MyjumoonDTO> findmyjumoonstatus(String status,Long id){
        return userMapper.selectmyjumoonstatus(status,id);
    };

    // 동찬 구매후기 찾기
    public Optional<MyhugiDTO> findmyhugi(Long id){
        return userMapper.selectmyhugi(id);
    };

    // 동찬 구매후기 리뷰 찾고수정
    public Optional<HugisujungDTO> findmyhugisujung(Long id){
        return userMapper.selectmyhugisujung(id);
    };


    // 동찬 구매후기 삽입
    public void inserthugi(Long id, String content){
         userMapper.inserthugi(id,content);
    };

    public List<MyjjimDTO> findallmyjjim(Long id){
        return userMapper.selectallmyjjim(id);
    };

    // 주문상세 동찬
    public Optional<MyjumooncancelDTO> findjumoonsangse(Long id){
        return userMapper.selectjumoonsangse(id);
    };

    // 주문취소 후 취소로 변경
    public void jumooncancel(Long id, String status){
       userMapper.jumooncancel(id,status);
    };

    // 주문취소 동찬
    public Optional<MyjumooncancelDTO> findcancelfinish(Long id){
        return userMapper.selectcancelfinish(id);
    };

    //도란방 조회
    public List<DoranbangDTO> finddoranbang(Long id){
        return userMapper.selectdoranbang(id);
    };

    // 구매후기 조회
    public List<GumaehugiDTO> findgumaehugi(Long id){
        return userMapper.gumaehugimukruk(id);
    };

    // 구매후기 조회
    public List<GumaehugiDTO> findhugisangse(Long id){
        return userMapper.selecthugisangse(id);
    };

    // 캘린더 조회
    public List<SavingVO> findmytikkle(Long userId){
        return userMapper.selectmytikkle(userId);
    };

    // 캘린더 아이디값으로 조회 동찬
    public Long findmytikkleid(Long userId,String date){
        return userMapper.selectmytikkleid(userId,date);
    };

    //캘린더 수정
    public void updatemytikkle(Long id){
        userMapper.updatemytikkle(id);
    };

    //캘린더 인서트
    public void updatetikkle(SavingVO savingVO){
        userMapper.inserttikkle(savingVO);
    };

//    네이버 회원 업데이트

    public void updateNaver(UserVO userVO) {
        userMapper.updateNaver(userVO);
    }
//  비밀번호 업데이트
    public void updatepassword(String identification, String password) {
        userMapper.updatepassword(identification, password);
    }
//    비밀번호 조회
    public String selectpassword(String identification, String password) {
       return userMapper.selectpassword(identification,password);
    }
}

