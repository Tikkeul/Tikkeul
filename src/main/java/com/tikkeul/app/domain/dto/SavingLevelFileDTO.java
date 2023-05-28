package com.tikkeul.app.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class SavingLevelFileDTO {
    private Long id;
    private Long savinglevelId;
    private Long size;
    private String originName;
    private String uuid;
    private String path;
    private String fileType;
}
