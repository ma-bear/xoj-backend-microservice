package com.xoj.xojbackendjudgeservice.judge.codesandbox;



/**
 * @author xq
 * @create 2024/3/31 12:16
 */

import com.xoj.xojbackendjudgeservice.judge.codesandbox.Impl.ExampleCodeSandBox;
import com.xoj.xojbackendjudgeservice.judge.codesandbox.Impl.RemoteCodeSandBox;
import com.xoj.xojbackendjudgeservice.judge.codesandbox.Impl.ThirdPartyCodeSandBox;

/**
 * 代码沙箱工厂（根据字符串参数创建指定的代码沙箱实例）
 */
public class CodeSandBoxFactory {
    /**
     * 创建代码沙箱示例
     *
     * @param type 沙箱类型
     * @return
     */
    public static CodeSandBox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandBox();
            case "remote":
                return new RemoteCodeSandBox();
            case "thirdParty":
                return new ThirdPartyCodeSandBox();
            default:
                return new ExampleCodeSandBox();
        }
    }
}
