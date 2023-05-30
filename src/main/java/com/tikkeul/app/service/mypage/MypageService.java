package com.tikkeul.app.service.mypage;

import com.tikkeul.app.domain.dto.*;
import com.tikkeul.app.domain.vo.ReviewVO;
import com.tikkeul.app.domain.vo.SavingVO;
import com.tikkeul.app.domain.vo.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

public interface MypageService {

    public Optional<MypageDTO> getMypage(Long id);

    public void modifyUserVO(String status, Long id);

    public Optional<UserVO> modifycheckpassword(Long id, String password);

    public List<MyjumoonDTO> getmyjumoon(Long id);

    public List<MyjjimDTO> getallmyjjim(Long id);

    //찜 다시 삽입
    public void setrejjim(Long id, Long itemId);

    //찜 삭제
    public void dropjjim(Long id, Long itemId);

    public List<MyjumoonDTO> getallmyjumoonstatus(String status,Long id);

    public void inserthugi(Long id, String content);

    public Optional<MyhugiDTO> getmyhugi(Long id);

    //비밀번호 변경 동찬
    public void modifypassword(String password, Long id);

    //후기수정 동찬
    public void modifyhugisujung(Long id,String content);


    // 주문상세 동찬
    public Optional<MyjumooncancelDTO> getjumoonsangse(Long id);

    // 주문취소 후 취소로 변경
    public void insertcancel(Long id, String status);

    // 주문취소 동찬
    public Optional<MyjumooncancelDTO> getcancelfinish(Long id);

    //도란방 조회
    public List<DoranbangDTO> getdoranbang(Long id);

    // 구매후기 조회
    public List<GumaehugiDTO> getgumaehugi(Long id);

    // 구매후기상세 조회
    public List<GumaehugiDTO> gethugisangse(Long id);

    // 동찬 구매후기 리뷰 찾고수정
    public Optional<HugisujungDTO> getmyhugisujung(Long id);

    // 캘린더 조회
    public List<SavingVO> getmytikkle(Long userId);

    // 캘린더 아이디값으로 조회 동찬
    public Long getmytikkleid(Long userId,String date);

    //캘린더 인서트
    public void settikkle(SavingVO savingVO);

    //캘린더 수정
    public void modifymytikkle(Long id);

}
