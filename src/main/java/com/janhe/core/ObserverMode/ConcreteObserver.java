package com.janhe.core.ObserverMode;

/**
 * @CLASSNAME ConcreteObserver 观察者
 * @Description
 * @Auther Jan  橙寂
 * @DATE 2019/8/15 0015 22:02
 */
public class ConcreteObserver implements Observer
{

    private  String name;

    public ConcreteObserver() {
    }

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("老板来了"+name+"赶紧收起手机来");
    }
}
