package com.xoj.xojbackendmodel.model.dto.Question;

import lombok.Data;

import java.util.List;

/**
 * @author xq
 * @create 2024/2/24 13:28
 */
@Data
public class QuestionAddRequest {


    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表（json 数组）
     */
    private List<String> tags;

    /**
     * 题目答案
     */
    private String answer;

    /**
     * 判题用例（json数组）
     */
    private List<JudgeCase> judgeCase;

    /**
     * 判题配置（json对象）
     */
    private JudgeConfig judgeConfig;

    private static final long serialVersionUID = 1L;
}
