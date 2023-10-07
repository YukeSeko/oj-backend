package com.wzy.common.model.dto.user;

import lombok.Data;

/**
 * @author 王灼宇
 * @Since 2023/9/19 17:12
 */
@Data
public class UserLoginByMailRequest {

    private String mail;

    private String mailCode;
}
