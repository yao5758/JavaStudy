package com.cy.javastudy.designmode.strategypattern;

/**
 * @author chenyao
 * @version 1.0
 * @Description //TODO $
 * @date 2022/7/26 20:22
 */
/** 策略B 商户账户 **/
public class BusiAcctStrategy implements Strategy{
    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge*0.90;
    }
}
