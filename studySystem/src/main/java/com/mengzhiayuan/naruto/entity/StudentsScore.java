package com.mengzhiayuan.naruto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: 梦致A远
 * @Date: 2022/6/1 11:38
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentsScore {

    private int studentId;
    private int num;//第几次考试
    private int chinese;
    private int math;
    private int english;
    private int physical;
    private int chemistry;
    private int biology;

}
