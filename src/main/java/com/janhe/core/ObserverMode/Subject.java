package com.janhe.core.ObserverMode;

/**
 * @auther: Jan 橙寂
 * @Date: 2019-8-15 11:12
 * @Description:
 * @Version: 1.0
 */
public interface Subject {

    /**
     * 添加观察者
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
       void detach(Observer observer);

    /**
     * 通知
     */
      void notifyObServer();
}
