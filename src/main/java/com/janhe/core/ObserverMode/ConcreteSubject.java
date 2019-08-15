package com.janhe.core.ObserverMode;

import java.util.LinkedList;
import java.util.List;

/**
 * @CLASSNAME ConcreteSubject
 * @Description
 * @Auther Jan  橙寂
 * @DATE 2019/8/15 0015 21:27
 */
public class ConcreteSubject implements Subject {

    List<Observer> observerList = new LinkedList<Observer>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObServer() {

        for (Observer temp : observerList) {
            temp.update();

        }
    }
}
