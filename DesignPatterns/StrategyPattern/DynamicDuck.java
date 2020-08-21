package DesignPatterns.StrategyPattern;

public class DynamicDuck extends Duck{
    DynamicDuck(){
        flyBehaviour=new FlyWithOutWings();
        quackBehaviour=new RubberQuack();
    }
    public void display(){
        System.out.println("Strategy Pattern Dynamic Duck Behaviour");
    }

}
