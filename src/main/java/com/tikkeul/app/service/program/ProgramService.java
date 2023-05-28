package com.tikkeul.app.service.program;


import com.tikkeul.app.domain.dto.SavingLevelDTO;
import com.tikkeul.app.domain.dto.SavingLevelFileDTO;
import com.tikkeul.app.domain.vo.FileVO;
import com.tikkeul.app.domain.vo.SavingLevelVO;

import java.util.List;

public interface ProgramService {

//    프로그램 추가 ( 관리자 )
    public void writeSavingLevel(SavingLevelDTO savingLevelDTO);

//    프로그램 조회 ( 관리자 )
    public List<SavingLevelVO> getSavingLevelAll();

    default SavingLevelDTO toDTO(SavingLevelVO savingLevelVO){
        SavingLevelDTO savingLevelDTO = new SavingLevelDTO();
        savingLevelDTO.setId(savingLevelVO.getId());
        savingLevelDTO.setName(savingLevelVO.getName());
        savingLevelDTO.setGoalMoney(savingLevelVO.getGoalMoney());
        savingLevelDTO.setDailyMoney(savingLevelVO.getDailyMoney());
        return savingLevelDTO;
    }

    default SavingLevelFileDTO toDTO(FileVO fileVO){
        SavingLevelFileDTO savingLevelFileDTO = new SavingLevelFileDTO();
        savingLevelFileDTO.setId(fileVO.getId());
        savingLevelFileDTO.setOriginName(fileVO.getOriginName());
        savingLevelFileDTO.setPath(fileVO.getPath());
        savingLevelFileDTO.setUuid(fileVO.getUuid());
        savingLevelFileDTO.setSize(fileVO.getSize());
        return savingLevelFileDTO;
    }

}
