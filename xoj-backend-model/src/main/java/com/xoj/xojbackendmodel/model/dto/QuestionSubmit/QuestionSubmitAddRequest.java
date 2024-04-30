package com.xoj.xojbackendmodel.model.dto.QuestionSubmit;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xq
 * @create 2024/2/24 15:41
 */
@Data
public class QuestionSubmitAddRequest implements Serializable {


    /**
     * 编程语言
     */
    private String language;

    /**
     * 用户代码
     */
    private String code;


    /**
     * 题目 id
     */
    private Long questionId;

    private static final long serialVersionUID = 1L;
}
