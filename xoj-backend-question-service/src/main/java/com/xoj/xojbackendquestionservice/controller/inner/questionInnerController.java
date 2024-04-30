package com.xoj.xojbackendquestionservice.controller.inner;

import com.xoj.xojbackendmodel.model.entity.Question;
import com.xoj.xojbackendmodel.model.entity.QuestionSubmit;
import com.xoj.xojbackendquestionservice.service.QuestionService;
import com.xoj.xojbackendquestionservice.service.QuestionSubmitService;
import com.xoj.xojbackendserviceclient.service.QuestionOpenFeign;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author xq
 * @create 2024/4/26 23:15
 */
@RestController
@RequestMapping("/inner")
public class questionInnerController implements QuestionOpenFeign {

    @Resource
    private QuestionService questionService;
    @Resource
    private QuestionSubmitService questionSubmitService;

    @Override
    @GetMapping("/get/id")
    public Question getQuestionById(@RequestParam("questionId") long questionId){
        return questionService.getById(questionId);
    }

    @Override
    @GetMapping("/question_submit/get/id")
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionSubmitId") long questionSubmitId){
        return questionSubmitService.getById(questionSubmitId);
    }

    @Override
    @PostMapping("/question_submit/update")
    public boolean updateQuestionSubmitById(@RequestParam("questionSubmit") QuestionSubmit questionSubmit){
        return questionSubmitService.updateById(questionSubmit);
    }

}
