package com.xoj.xojbackendmodel.model.dto.Question;

import lombok.Data;

/**
 * @author xq
 * @create 2024/2/24 13:35
 */
@Data
public class JudgeConfig {

    /**
     * 时间限制（ms）
     */
    private Long timeLimit;

    /**
     * 内存限制（KB）
     */
    private Long memoryLimit;

    /**
     * 堆栈限制（KB）
     */
    private Long stackLimit;


}
