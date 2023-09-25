package com.wzy.oj.judge.codesandbox.impl;

import com.wzy.oj.judge.codesandbox.CodeSandBox;
import com.wzy.oj.judge.codesandbox.model.ExecuteCodeRequest;
import com.wzy.oj.judge.codesandbox.model.ExecuteCodeResponse;
import com.wzy.oj.model.entity.JudgeInfo;
import com.wzy.oj.model.enums.JudgeInfoMessageEnum;
import com.wzy.oj.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * 示例代码沙箱（仅为了跑通业务流程）
 * @author 王灼宇
 * @Since 2023/9/25 15:47
 */
public class ExampleCodeSandbox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;

    }
}
