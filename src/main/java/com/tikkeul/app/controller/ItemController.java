package com.tikkeul.app.controller;

import com.tikkeul.app.domain.dto.ItemDTO;
import com.tikkeul.app.domain.type.CategoryType;
import com.tikkeul.app.service.item.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/item/*")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    //    김보령 작업공간
//    열매샵 제품 목록 가져오기 : list.html
    @GetMapping("list")
    public void list(){
    }

    //    열매샵 제품 상세 보기 : readDetail.html
    @GetMapping("readDetail")
    public void readDetail(Long id, Model model){
        model.addAttribute("item", itemService.readDetail(id).get());
        model.addAttribute("calcReview", itemService.readScoreAndCountOfReview(id).get());
    }

    @ResponseBody
    @GetMapping("getList")
    public List<ItemDTO> getList(CategoryType categoryType){
        log.info(categoryType.toString());
        itemService.getList(categoryType).stream().forEach(itemDTO -> log.info(itemDTO.toString()));
        return itemService.getList(categoryType);
    }
}