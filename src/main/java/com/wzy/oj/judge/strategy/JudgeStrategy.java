package com.wzy.oj.judge.strategy;

import com.wzy.oj.model.entity.JudgeInfo;

/**
 * 判题策略接口：使用策略模式
 */
public interface JudgeStrategy {
    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);

}
