package com.xoj.xojbackendmodel.model.dto.Question;

import lombok.Data;

/**
 * @author xq
 * @create 2024/2/24 13:37
 */
@Data
public class JudgeCase {
    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;
}
