package com.mengzhiayuan.naruto.service;

import com.mengzhiayuan.naruto.entity.StudentLearnAttitude;

import java.util.List;

/**
 * @Auther: 梦致A远
 * @Date: 2022/6/1 11:33
 * @Description:
 */

public interface LearnEnvironment {

    //教师查看学生的学习态度
    List<StudentLearnAttitude> getLearnAttitude();

}