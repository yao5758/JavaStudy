package com.cy.sourcecodestudy.designmode.strategypattern;

import com.cy.sourcecodestudy.designmode.ReplaceIfElse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenyao
 * @version 1.0
 * @Description //TODO $
 * @date 2022/7/26 19:52
 */
/** StrategyFactory工厂 **/
public class StrategyFactory {

    private static StrategyFactory factory = new StrategyFactory();

    private StrategyFactory(){

    }

    private static Map strategyMap = new HashMap<>();

    static{
        strategyMap.put(RechargeTypeEnum.E_BANK.getValue(), new EBankStrategy());
        strategyMap.put(RechargeTypeEnum.BUSI_ACCOUNTS.getValue(), new BusiAcctStrategy());
    }

    public Strategy creator(Integer type){
        return (Strategy) strategyMap.get(type);
    }

    public static StrategyFactory getInstance(){
        return factory;
    }
}
