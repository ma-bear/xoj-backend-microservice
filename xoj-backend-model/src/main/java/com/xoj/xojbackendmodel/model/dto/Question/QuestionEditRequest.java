package com.xoj.xojbackendmodel.model.dto.Question;

import lombok.Data;

import java.util.List;

/**
 * @author xq
 * @create 2024/2/24 13:48
 */
@Data
public class QuestionEditRequest {
    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表
     */
    private List<String> tags;

    /**
     * 题目答案
     */
    private String answer;

    /**
     * 判题用例
     */
    private List<JudgeCase> judgeCase;

    /**
     * 判题配置
     */
    private JudgeConfig judgeConfig;

    private static final long serialVersionUID = 1L;

}
