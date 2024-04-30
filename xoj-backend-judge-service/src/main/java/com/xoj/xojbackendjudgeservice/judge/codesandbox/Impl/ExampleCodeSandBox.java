package com.xoj.xojbackendjudgeservice.judge.codesandbox.Impl;


import com.xoj.xojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.xoj.xojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.xoj.xojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import com.xoj.xojbackendmodel.model.codesandbox.JudgeInfo;
import com.xoj.xojbackendmodel.model.enums.JudgeInfoMessageEnum;
import com.xoj.xojbackendmodel.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * @author xq
 * @create 2024/3/31 11:53
 */
public class ExampleCodeSandBox implements CodeSandBox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {

        List<String> inputList = executeCodeRequest.getInputList();

        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutPutList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
