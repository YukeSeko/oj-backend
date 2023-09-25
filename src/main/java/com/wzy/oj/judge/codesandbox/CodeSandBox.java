package com.wzy.oj.judge.codesandbox;

import com.wzy.oj.judge.codesandbox.model.ExecuteCodeRequest;
import com.wzy.oj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 * @author 王灼宇
 * @Since 2023/9/25 15:37
 */
public interface CodeSandBox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

}
