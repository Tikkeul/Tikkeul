package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.dto.*;
import com.tikkeul.app.domain.vo.ReviewVO;
import com.tikkeul.app.domain.vo.SavingVO;
import com.tikkeul.app.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {


//  관리자페이지에서 회원 리스트 조회

    //  관리자페이지에서 회원 리스트 조회


//  관리자페이지에서 회원 리스트 조회

    public List<UserVO> adminSelectUserAll();

    //    아이디 중복검사
    public Optional<UserVO> selectById(String identification);

//        회원가입
    public void insert(UserVO userVO);


    //ㅁㅏ이페이지 동찬
    public Optional<MypageDTO> select(Long id);

    //회원탈퇴 동찬
    public void update(String status, Long id);

    //비밀번호 변경 동찬
    public void updatepassword(String password, Long id);

    //후기수정 동찬
    public void updatehugisujung(Long id,String content);

    //비밀번호 재설정 동찬
    public Optional<UserVO> selectcheckpassword(Long id, String password);

    //나의 구매 목록 동찬
    public List<MyjumoonDTO> selectallmyjumoon(Long id);

    //나의 구매 목록 상태 에이작스 동찬
    public List<MyjumoonDTO> selectmyjumoonstatus(String status, Long id);

    //나의 찜 목록 동찬
    public List<MyjjimDTO> selectallmyjjim(Long id);

    // 구매후기 상품 찾기 동찬
    public Optional<MyhugiDTO> selectmyhugi(Long id);

    // 구매후기 리뷰 찾고수정 동찬
    public Optional<HugisujungDTO> selectmyhugisujung(Long id);

    // 구매후기 동찬
    public void inserthugi(Long id, String content);

    //찜 다시 삽입 동찬
    public void insertrejjim(Long id, Long itemId);

    //찜 삭제 동찬
    public void deletejjim(Long id, Long itemId);

    // 주문상세 동찬
    public Optional<MyjumooncancelDTO> selectjumoonsangse(Long id);

    // 주문취소 후 취소로 변경 동찬
    public void jumooncancel(Long id, String status);

    // 주문취소 동찬
    public Optional<MyjumooncancelDTO> selectcancelfinish(Long id);

    //도란방 조회 동찬
    public List<DoranbangDTO> selectdoranbang(Long id);

    // 구매후기 조회 동찬
    public List<GumaehugiDTO> gumaehugimukruk(Long id);

    // 구매후기상세 조회 동찬
    public List<GumaehugiDTO> selecthugisangse(Long id);

    // 캘린더 조회 동찬
    public List<SavingVO> selectmytikkle(Long userId);

    // 캘린더 아이디값으로 조회 동찬
    public Long selectmytikkleid(@Param("userId") Long userId, @Param("date") String date);

    //캘린더 인서트
    public void inserttikkle(SavingVO savingVO);

    //캘린더 수정
    public void updatemytikkle(Long id);


//        로그인
    @Select("SELECT ID, STATUS, ROLL FROM USERS WHERE IDENTIFICATION = #{identification} AND PASSWORD = #{password}")
    public  Optional<UserVO> selectByUserIdAndUserPassword(@Param("identification") String id,@Param("password") String password);

//  카카오 회원 업데이트
    public void updatekakao(UserVO kakaoUser);

    public void updateNaver(UserVO userVO);

    @Update("UPDATE USERS SET PASSWORD = #{password} WHERE IDENTIFICATION = #{identification}")
    public void updatepassword(@Param("identification") String id,@Param("password") String password);

    public String selectpassword(String identification, String password);

}
