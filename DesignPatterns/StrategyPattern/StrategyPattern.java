package DesignPatterns.StrategyPattern;

public class StrategyPattern {
    public static void main(String args[]){
        Duck dd=new DynamicDuck();
        dd.performFly();
        dd.performQuack();
        System.out.println("Setting up dynamic duck behaviour");
        dd.setFlyBehaviour(new FlyWithWings());
        dd.setQuackBehaviour(new DuckQuack());
        dd.performFly();
        dd.performQuack();

    }
}
