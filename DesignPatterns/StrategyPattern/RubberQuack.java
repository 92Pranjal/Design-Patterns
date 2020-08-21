package DesignPatterns.StrategyPattern;

public class RubberQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("No Quack for Rubber Duck");
    }
}
