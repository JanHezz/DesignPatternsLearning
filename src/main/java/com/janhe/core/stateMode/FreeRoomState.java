package com.janhe.core.stateMode;

/**
 * @CLASSNAME FreeRoomState
 * @Description
 * @Auther Jan  橙寂
 * @DATE 2019/8/22 0022 14:02
 */

public class FreeRoomState implements  State {


    @Override
    public void handle(Room room) {
        System.out.println("房间正处于空闲状态可以预约");
        room.setState(new BookingRoomState());
        room.request();
    }
}
