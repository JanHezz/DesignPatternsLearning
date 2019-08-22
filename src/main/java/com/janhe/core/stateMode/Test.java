package com.janhe.core.stateMode;

/**
 * @CLASSNAME Test
 * @Description
 * @Auther Jan  橙寂
 * @DATE 2019/8/22 0022 14:43
 */

public class Test {
    public static void main(String[] args) {
        Room room=new ConcreteRoom();

        room.changeState(1);
        room.changeState(2);
        room.changeState(3);

    }
}
