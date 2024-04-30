package com.xoj.xojbackendjudgeservice.judge;


import com.xoj.xojbackendmodel.model.entity.QuestionSubmit;

/**
 * @author xq
 * @create 2024/4/1 16:46
 */
public interface JudgeService {
     QuestionSubmit doJudge(long questionSubmitId);
}
