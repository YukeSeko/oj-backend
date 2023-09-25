package com.wzy.oj.judge.codesandbox.impl;

import com.wzy.oj.judge.codesandbox.CodeSandBox;
import com.wzy.oj.judge.codesandbox.model.ExecuteCodeRequest;
import com.wzy.oj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 远程代码沙箱（实际调用接口的沙箱）
 * @author 王灼宇
 * @Since 2023/9/25 15:48
 */
public class RemoteCodeSandbox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return null;
    }
}
