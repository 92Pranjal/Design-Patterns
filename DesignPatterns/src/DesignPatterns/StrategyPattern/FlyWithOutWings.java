package DesignPatterns.StrategyPattern;

public class FlyWithOutWings implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Flying without wings!!");
    }
}
