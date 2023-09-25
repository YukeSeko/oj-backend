package com.wzy.oj.judge.codesandbox;

import com.wzy.oj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.wzy.oj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.wzy.oj.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * 代码沙箱工厂（根据字符串参数创建指定的代码沙箱实例）
 * 单例+工厂模式
 * @author 王灼宇
 * @Since 2023/9/25 16:00
 */
public class CodeSandboxFactory {

    // 私有静态成员变量保存实例
    private static CodeSandBox instance;

    // 私有构造函数
    private CodeSandboxFactory() {
    }


    /**
     * 创建代码沙箱实例
     *
     * @param type 沙箱类型
     * @return
     */
    public static CodeSandBox newInstance(String type) {
        synchronized (CodeSandboxFactory.class) {
            if (instance == null) {
                switch (type) {
                    case "example":
                        instance = new ExampleCodeSandbox();
                    case "remote":
                        instance = new RemoteCodeSandbox();
                    case "thirdParty":
                        instance = new ThirdPartyCodeSandbox();
                    default:
                        instance = new ExampleCodeSandbox();
                }
            }
        }
        return instance;
    }
}
