package com.janhe.core.stateMode;

/**
 * @CLASSNAME Room
 * @Description
 * @Auther Jan  橙寂
 * @DATE 2019/8/22 0022 13:53
 */
public  abstract class Room {

    State state = null;


 public  void request()
 {
     state.handle(this);
 }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 改变状态
     */
    public abstract void changeState(int state);

}
