package com.xoj.xojbackendjudgeservice.judge;

/**
 * @author xq
 * @create 2024/4/1 20:07
 */

import com.xoj.xojbackendjudgeservice.judge.stratege.DefaultJudgeStrategy;
import com.xoj.xojbackendjudgeservice.judge.stratege.JavaLanguageJudgeStrategy;
import com.xoj.xojbackendjudgeservice.judge.stratege.JudgeContext;
import com.xoj.xojbackendjudgeservice.judge.stratege.JudgeStrategy;
import com.xoj.xojbackendmodel.model.entity.QuestionSubmit;
import com.xoj.xojbackendmodel.model.codesandbox.JudgeInfo;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {
    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
