package com.mengzhiayuan.naruto.service;

/**
 * @Auther: 梦致A远
 * @Date: 2022/6/1 11:24
 * @Description:
 */

public interface Question {

    //学生问问题
    void askQuestion(Integer studentId,String question);

    //教师回答问题
    void answerQuestion(Integer questionId,String answer);

}