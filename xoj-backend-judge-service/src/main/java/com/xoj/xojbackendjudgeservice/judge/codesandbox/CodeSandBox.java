package com.xoj.xojbackendjudgeservice.judge.codesandbox;

import com.xoj.xojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.xoj.xojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * @author xq
 * @create 2024/3/31 11:39
 */
public interface CodeSandBox {

    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
