package com.heflat.utils.entity;

import lombok.*;

import java.util.Date;

/**
 * User
 *
 * @author heflat
 * @date 2018-04-19 22:26
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String username;

    private String password;

    private Integer age;

    private Date createTime;

    private Date updateTime;
}
