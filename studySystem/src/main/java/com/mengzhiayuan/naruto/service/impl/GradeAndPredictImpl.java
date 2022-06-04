package com.mengzhiayuan.naruto.service.impl;

import com.mengzhiayuan.naruto.dao.GradeAndPredictMapper;
import com.mengzhiayuan.naruto.entity.StudentsScore;
import com.mengzhiayuan.naruto.service.GradeAndPredict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 梦致A远
 * @Date: 2022/6/3 22:15
 * @Description:
 */

@Service
public class GradeAndPredictImpl implements GradeAndPredict {

    @Autowired
    private GradeAndPredictMapper gradeAndPredictMapper;

    @Override
    public List<StudentsScore> getGrades(int studentId) {
        return gradeAndPredictMapper.getGradeList(studentId);
    }

    @Override
    public StudentsScore getPredictGrade(int studentId) {
        List<StudentsScore> lastGrade =  getGrades(studentId);
        int numTotal = 0;
        int chineseTotal = 0;
        int mathTotal = 0;
        int englishTotal = 0;
        int physicalTotal = 0;
        int chemistryTotal = 0;
        int biologyTotal = 0;
        int sum = 0;
        for(StudentsScore grade : lastGrade){
            sum++;
            numTotal += grade.getNum();
            chineseTotal += grade.getChinese();
            mathTotal += grade.getMath();
            englishTotal += grade.getEnglish();
            physicalTotal += grade.getPhysical();
            chemistryTotal += grade.getChemistry();
            biologyTotal += grade.getBiology();
        }
        return new StudentsScore(studentId,numTotal/sum,chineseTotal/sum,mathTotal/sum,englishTotal/sum,physicalTotal/sum,chemistryTotal/sum,biologyTotal/sum);
    }
}
