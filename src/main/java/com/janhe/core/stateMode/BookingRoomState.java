package com.janhe.core.stateMode;

/**
 * @CLASSNAME BookingRoomState
 * @Description
 * @Auther Jan  橙寂
 * @DATE 2019/8/22 0022 14:30
 */

public class BookingRoomState implements State {

    @Override
    public void handle(Room room) {

        System.out.println("房间处于空闲状态");
    }

}
