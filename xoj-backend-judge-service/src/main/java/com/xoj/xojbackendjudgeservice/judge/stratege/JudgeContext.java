package com.xoj.xojbackendjudgeservice.judge.stratege;


import com.xoj.xojbackendmodel.model.codesandbox.JudgeInfo;
import com.xoj.xojbackendmodel.model.dto.Question.JudgeCase;
import com.xoj.xojbackendmodel.model.entity.QuestionSubmit;
import com.xoj.xojbackendmodel.model.entity.Question;
import lombok.Data;

import java.util.List;

/**
 * @author xq
 * @create 2024/4/1 19:47
 */
@Data
public class JudgeContext {
    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;


}
