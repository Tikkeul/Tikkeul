package com.tikkeul.app.controller;
import com.tikkeul.app.domain.dto.*;
import com.tikkeul.app.domain.vo.ReviewVO;
import com.tikkeul.app.domain.vo.SavingVO;
import com.tikkeul.app.domain.vo.UserVO;
import com.tikkeul.app.service.mypage.MypageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
@Slf4j
@RequestMapping("/mypage/*")
@RequiredArgsConstructor
public class MypageController {

    private final MypageService mypageService;
    private final HttpSession session;

    @GetMapping("mypage")
    public void read(Model model)
    {
        model.addAttribute("k",mypageService.getMypage(0L).get());
    }

    @GetMapping("DropOutUser")
    public void goTodropuser(UserVO userVO){;}


    @PostMapping("drop")
    public RedirectView modify(UserVO userVO){
        log.info(userVO.getStatus());
        mypageService.modifyUserVO(userVO.getStatus(),0L);
        return new RedirectView("/mypage/mypage");
    }


    //    비밀번호 체크
    @GetMapping("check-password/{password}")
    @ResponseBody
    public boolean checkId(@PathVariable String password){
        return mypageService.modifycheckpassword(0L,password).isPresent();
    }

    @GetMapping("chagepassword")
    public void goTochagepass(UserVO userVO, HttpSession httpSession){

        ;}


   @PostMapping("passchangee")
    public RedirectView modifypassword(UserVO userVO){
        mypageService.modifypassword(userVO.getPassword(),0L);
        log.info(userVO.getPassword());
        return new RedirectView("/mypage/mypage") ;
    }

    @GetMapping("gumaehugi")
    public void hugilist(Model model,ReviewVO reviewVO){
        Long id = 0L;
        model.addAttribute("hugi",mypageService.getmyhugi(id).get());
    }

    @PostMapping("huhu")
    public RedirectView hugiwrite(ReviewVO reviewVO){
        Long id=0L;
        mypageService.inserthugi(0L,reviewVO.getContent());
        return new RedirectView("/mypage/mypage");
    }


    @GetMapping("gumaehugisujung")
    public void hugilistchange(Model model){
        Long id = 0L;
        model.addAttribute("hugi",mypageService.getmyhugi(id).get());
        model.addAttribute("hugisujung",mypageService.getmyhugisujung(id).get());
    }

    @PostMapping("huhuchange")
    public RedirectView hugiwritechange(HugisujungDTO hugisujungDTO){
        Long id=0L;
        mypageService.modifyhugisujung(id,hugisujungDTO.getContent());
        return new RedirectView("/mypage/mypage");
    }



    @GetMapping("jumoonneyuk")
    public void myjumoonlist(Model model){
        Long id = 0L;
        model.addAttribute("datas",mypageService.getmyjumoon(id));
    }


    @GetMapping("jjim")
    public void myjjim(Model model) {
        Long id = 0L;
        model.addAttribute("jjims", mypageService.getallmyjjim(id));
    }


    @GetMapping("nojjim/{itemId}")
    @ResponseBody
    public void nojjim(@PathVariable Long itemId){
        log.info("찜삭제");
        Long id = 0L;
        mypageService.dropjjim(id,itemId);
    }


    @GetMapping("jjimregogo/{itemId}")
    @ResponseBody
    public void jjimregogo(@PathVariable Long itemId){
        Long id = 0L;
        log.info("찜삽입");
        mypageService.setrejjim(id,itemId);
    }




    @GetMapping("status-id/{status}")
    @ResponseBody
    public List<MyjumoonDTO> myjumoonstatus(@PathVariable String status){

        Long id = 0L;
        log.info(status);
        log.info("전체");

            if(status.equals("전체")){
                return mypageService.getmyjumoon(id);
            }

            else {
                return mypageService.getallmyjumoonstatus(status, id);
            }

    }

    @GetMapping("jumoonsangse")
    public void jumoonsangse(Model model){
        Long id =0L;
        model.addAttribute("k",mypageService.getjumoonsangse(id).get())
        ;}

    @PostMapping("cancel")
    public RedirectView jumoonsangsecancel(){
        Long id =1L;
        String status = "주문취소";
        mypageService.insertcancel(id,status);
       return new RedirectView("/mypage/jumoonneyuk");
        }

    @GetMapping("jumooncancel")
    public void jumooncancel(Model model){
        Long id =0L;
        MyjumooncancelDTO op = new MyjumooncancelDTO();
        model.addAttribute("k2",mypageService.getjumoonsangse(id).get())
        ;}

    @GetMapping("mypage-doranbang")
    public void dorangbang(Model model){
        Long id =0L;
        model.addAttribute("datass",mypageService.getdoranbang(id))
        ;}


    @GetMapping("mypage-review")
    public void gumaehugimukruk(Model model){
        Long id = 0L;
        model.addAttribute("datass",mypageService.getgumaehugi(id))
        ;}


    @GetMapping("mypage-review-details")
    public void hugisangse(Model model){
        Long id = 0L;
        model.addAttribute("kkk",mypageService.gethugisangse(id))
        ;}

    @GetMapping("mytikkle")
    public void goTomytikkle(Model model){
        Long userId = 0L;
        model.addAttribute("ppoos",mypageService.getmytikkle(userId));

        ;}

    @ResponseBody
    @PostMapping("/mypage/insertmytikkle")
    public boolean mytikklePOST(@RequestBody SavingVO savingVO) throws Exception {

        mypageService.settikkle(savingVO);
        return true;
    }


     @GetMapping("/selectmytikkle/{date}")
     @ResponseBody
     public Long mytikklecheckid(@PathVariable String date){

         Long userId = 0L;
        return mypageService.getmytikkleid(userId,date);
     }



    @ResponseBody
    @PostMapping("/mypage/mytikklesujung/{k}")
    public boolean mytikklePOSTsujung(@RequestBody Long k) throws Exception {
        mypageService.modifymytikkle(k);
        log.info("1");
        return true;
    }


    @GetMapping("/mytikklesujung/{date}")
    @ResponseBody
    public Long mytikklecheckidsujung(@PathVariable String date){
        Long userId = 0L;
        log.info("2");
        return mypageService.getmytikkleid(userId,date);
    }


    @GetMapping("Updatebasicinfo")
    public void goTodjumoon233d(){;}


}

