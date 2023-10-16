package com.wzy.question.controller.inner;

import com.wzy.common.feign.QuestionFeignClient;
import com.wzy.common.model.entity.Question;
import com.wzy.common.model.entity.QuestionSubmit;
import com.wzy.question.service.QuestionService;
import com.wzy.question.service.QuestionSubmitService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 王灼宇
 * @Since 2023/10/9 14:55
 */
@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {
    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;

    @GetMapping("/get/id")
    @Override
    public Question getQuestionById(@RequestParam("questionId") long questionId) {
        return questionService.getById(questionId);
    }

    @GetMapping("/question_submit/get/id")
    @Override
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionId") long questionSubmitId) {
        return questionSubmitService.getById(questionSubmitId);
    }

    @PostMapping("/question_submit/update")
    @Override
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit) {
        return questionSubmitService.updateById(questionSubmit);
    }


}
