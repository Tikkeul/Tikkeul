package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.vo.SavingLevelVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class SavingLevelMapperTests {

    @Autowired
    private SavingLevelMapper savingLevelMapper;

    @Test
    public void insertSavingLevelTest(){
//        SavingLevelVO savingLevelVO = new SavingLevelVO();
//        savingLevelVO.setName("씨앗");
//        savingLevelVO.setGoalMoney(100000);
//        savingLevelVO.setDailyMoney(1000);
//        savingLevelMapper.insertSavingLevel(savingLevelVO);
    }

    @Test
    public void selectSavingLevelAllTest(){
//        log.info(savingLevelMapper.admminSelectSavingLevelAll().toString());
    }


}
