package com.mengzhiayuan.naruto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: 梦致A远
 * @Date: 2022/6/1 11:45
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentLearnAttitude {

    private String username;
    private Integer attitude;//0~5依次递增表示学习态度越好

}