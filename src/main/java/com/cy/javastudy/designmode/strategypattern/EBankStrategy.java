package com.cy.javastudy.designmode.strategypattern;

/**
 * @author chenyao
 * @version 1.0
 * @Description //TODO $
 * @date 2022/7/26 20:21
 */
/** 策略A  网银充值 **/
public class EBankStrategy implements Strategy{
    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge*0.85;
    }
}
