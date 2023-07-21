package com.qimu.designpatterns.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 06:09:16
 * @Version: 1.0
 * @Description:
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -6545993291405757241L;
    private String name;
    private Integer age;
    private String password;
    private String loginType;
}
