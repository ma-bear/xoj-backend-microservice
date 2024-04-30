package com.xoj.xojbackendjudgeservice.judge.stratege;


import com.xoj.xojbackendmodel.model.codesandbox.JudgeInfo;

/**
 * @author xq
 * @create 2024/4/1 19:52
 */
public interface JudgeStrategy {
    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
