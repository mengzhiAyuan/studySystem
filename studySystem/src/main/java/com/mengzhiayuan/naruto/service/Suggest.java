package com.mengzhiayuan.naruto.service;

import java.util.List;

/**
 * @Auther: 梦致A远
 * @Date: 2022/6/1 11:23
 * @Description:
 */

public interface Suggest {

    //获取所有学生错误的题目，且该错题有超过四分之一的人做错
    List<String> getAllStudentsMistakes();

    //获取教师的教学建议，返回应该加强的部分/知识点
    List<String> getTeachSuggest(Integer teacherId);

    //获取所有学生错误的题目，且该错题有超过四分之一的人做错
    List<String> getStudentsMistakes(Integer studentId);

    //获取学生的学习建议,返回应该加强的部分/知识点
    List<String> getLearnSuggest(Integer studentId);

}