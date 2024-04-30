package com.xoj.xojbackendjudgeservice.judge.codesandbox.Impl;


import com.xoj.xojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.xoj.xojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.xoj.xojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * @author xq
 * @create 2024/3/31 11:53
 */
public class RemoteCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        return null;
    }
}
