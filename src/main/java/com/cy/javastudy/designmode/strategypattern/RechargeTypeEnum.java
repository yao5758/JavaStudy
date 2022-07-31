package com.cy.javastudy.designmode.strategypattern;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum RechargeTypeEnum {

    E_BANK(1),
    BUSI_ACCOUNTS( 2);

    private Integer value;


    RechargeTypeEnum(Integer value) {

        this.value = value;
    }

    public static RechargeTypeEnum valueOf(Integer type) {
        RechargeTypeEnum o = idNameMap.get(type);
        return o;
    }

    private static Map<Integer, RechargeTypeEnum> idNameMap;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    static {
        idNameMap = Arrays.stream(RechargeTypeEnum.values()).collect(Collectors.toMap(RechargeTypeEnum::getValue, k1->k1,(k1, k2) -> (RechargeTypeEnum) k2));
    }

    static {
        RechargeTypeEnum[] values = RechargeTypeEnum.values();
        for (RechargeTypeEnum value : values) {
            idNameMap.put(value.getValue(),value);
        }
    }

}
