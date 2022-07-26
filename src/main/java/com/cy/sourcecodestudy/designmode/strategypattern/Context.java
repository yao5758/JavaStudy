package com.cy.sourcecodestudy.designmode.strategypattern;

/**
 * @author chenyao
 * @version 1.0
 * @Description //TODO $
 * @date 2022/7/26 20:00
 */
/** 策略上下文*/
public class Context {
    private Strategy strategy;

    public Double calRecharge(Double charge, Integer type) {
        strategy = StrategyFactory.getInstance().creator(type);
        return strategy.calRecharge(charge, RechargeTypeEnum.valueOf(type));
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
