package com.janhe.core.stateMode;

/**
 * @CLASSNAME CheckInRoomState
 * @Description
 * @Auther Jan  橙寂
 * @DATE 2019/8/22 0022 14:33
 */

public class CheckInRoomState implements State {

    @Override
    public void handle(Room room) {
        System.out.println("客人入住了");
    }
}
