package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.dto.SavingLevelDTO;
import com.tikkeul.app.domain.vo.SavingLevelVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SavingLevelMapper {
    public void insertSavingLevel(SavingLevelDTO savingLevelDTO);

    public List<SavingLevelVO> admminSelectSavingLevelAll();

}
