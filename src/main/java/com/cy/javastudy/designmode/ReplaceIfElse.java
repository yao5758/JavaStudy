package com.cy.javastudy.designmode;

/**
 * @author chenyao
 * @version 1.0
 * @Description 超过 3 层的 if-else 的逻辑判断代码可以使用卫语句、策略模式、状态模式等
 * @date 2022/7/26 19:48
 */
public class ReplaceIfElse {
    //1、卫语句
//    public void today() {
//        if (isBusy()) {
//            System.out.println("change time.");
//            return;
//        }
//        if (isFree()) {
//            System.out.println("go to travel.");
//            return;
//        }
//        System.out.println("stay at home to learn Alibaba Java Coding Guideline s .");
//        return;
//    }



    //2、策略模式
    public static void main(String[] args) {
//        Context context = new Context();
//        // 网银充值100 需要付多少
//        Double money = context.calRecharge(100D, RechargeTypeEnum.E_BANK.getValue());
//        System.out.println(money);
//        // 商户账户充值100 需要付多少
//        Double money2 = context.calRecharge(100D, RechargeTypeEnum.BUSI_ACCOUNTS.getValue());
//        System.out.println(money2);
    }


    //3、状态模式
    /** 功能接口 **/
    public interface Function {
        void drive();
        void run();
        void back();
    }

    /** 离线状态实现接口 **/
    public class OffLineState implements Function {

        @Override
        public void drive() {
            System.out.print("不在线的drive");
        }

        @Override
        public void run() {
            System.out.print("不在线的run");
        }

        @Override
        public void back() {
            System.out.print("不在线的back");
        }

    }

    /** 在线状态实现接口 **/
    public class OnLineState implements Function {

        @Override
        public void drive() {
            System.out.print("在线的drive");
        }

        @Override
        public void run() {
            System.out.print("在线的run");
        }

        @Override
        public void back() {
            System.out.print("在线的back");
        }

    }

    /** 状态接口 **/
    public interface State {
        void offLine();
        void onLine();
    }

    /** Controller **/
    public class StateController implements State {

        Function func;

        public void setState(Function c) {
            this.func = c;
        }


        @Override
        public void offLine() {
            //设置不同的状态
            setState(new OffLineState());
        }

        @Override
        public void onLine() {
            //设置不同的状态
            setState(new OnLineState());
        }

        public void drive() {
            func.drive();
        }

        public void run() {
            func.run();
        }

        public void back() {
            func.back();
        }

    }

    /** client调用 **/
    public void testState() {
        StateController controller = new StateController();
        //设置状态
        controller.onLine();
        //省去了很多if-else的结构
        controller.run();
        controller.drive();
        controller.back();
    }

}
