package com.mengzhiayuan.naruto.dao;

import com.mengzhiayuan.naruto.entity.StudentsScore;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 梦致A远
 * @Date: 2022/6/3 22:22
 * @Description:
 */

@Mapper
@Repository
public interface GradeAndPredictMapper {

    List<StudentsScore> getGradeList(int studentId);

}
