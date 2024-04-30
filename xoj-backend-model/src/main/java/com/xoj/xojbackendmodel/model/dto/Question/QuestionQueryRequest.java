package com.xoj.xojbackendmodel.model.dto.Question;


import com.xoj.xojbackendcommon.common.PageRequest;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author xq
 * @create 2024/2/24 13:46
 */
@Data
public class QuestionQueryRequest extends PageRequest implements Serializable {

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
     * 创建用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;

}
