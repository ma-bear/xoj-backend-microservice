package com.xoj.xojbackendserviceclient.service;


import com.xoj.xojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xq
 * @create 2024/4/1 16:46
 */
@FeignClient(name = "xoj-backend-judge-service", path = "/api/judge/inner")
public interface JudgeOpenFeign {

     /**
      * 判题
      * @param questionSubmitId
      * @return
      */
     @PostMapping("/do")
     QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId);
}
