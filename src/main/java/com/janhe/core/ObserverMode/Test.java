package com.janhe.core.ObserverMode;

/**
 * @CLASSNAME Test
 * @Description
 * @Auther Jan  橙寂
 * @DATE 2019/8/15 0015 22:03
 */

public class Test {

    public static void main(String[] args) {
        ConcreteObserver MrLiu=new ConcreteObserver("小刘");
        ConcreteObserver MrHe=new ConcreteObserver("小何");

        ConcreteSubject boss=new ConcreteSubject();
        boss.attach(MrLiu);
        boss.attach(MrHe);

        boss.notifyObServer();
    }
}
