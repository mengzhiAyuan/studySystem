package com.mengzhiayuan.naruto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: 梦致A远
 * @Date: 2022/6/1 11:36
 * @Description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private int status;
    private String password;
}
