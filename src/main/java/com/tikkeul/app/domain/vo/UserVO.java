package com.tikkeul.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class UserVO {
    private Long id;
    private String identification;
    private String name;
    private String password;
    private String phoneNumber;
    private String address;
    private String status;
    private String role;
    private String createDate;
    private String profileImageName;
    private String profileImageSize;
    private String profileImageUuid;
    private Long levelId;

}
