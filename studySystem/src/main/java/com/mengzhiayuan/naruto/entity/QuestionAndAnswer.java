package com.mengzhiayuan.naruto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: 梦致A远
 * @Date: 2022/6/1 11:42
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionAndAnswer {
    int id;
    int studentId;
    int teacherId;
    String Question;
    String Answer;
}

