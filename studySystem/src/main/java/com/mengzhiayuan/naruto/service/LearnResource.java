package com.mengzhiayuan.naruto.service;

import java.util.List;

/**
 * @Auther: 梦致A远
 * @Date: 2022/6/1 11:26
 * @Description:
 */

public interface LearnResource {
    //教师获得系统推荐的习题
    public List<String> getLearnResource();
}
