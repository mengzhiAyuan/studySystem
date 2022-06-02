package com.mengzhiayuan.naruto.service;

import com.mengzhiayuan.naruto.entity.StudentsScore;

import java.util.List;

/**
 * @Auther: 梦致A远
 * @Date: 2022/6/1 11:21
 * @Description:
 */
public interface GradeAndPredict {

    //学生查看以往成绩
    List<StudentsScore> getGrades(Integer student);
    //学生查看预测的成绩
    StudentsScore getPredictGrade(Integer studentId);

}
