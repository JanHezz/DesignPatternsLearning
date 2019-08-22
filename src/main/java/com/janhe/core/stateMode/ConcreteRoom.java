package com.janhe.core.stateMode;


/**
 * @CLASSNAME ConcreteRoom
 * @Description
 * @Auther Jan  橙寂
 * @DATE 2019/8/22 0022 13:58
 */

public class ConcreteRoom extends Room {

    private State currentState,freeRoomState,bookingState,checkInState;

    public ConcreteRoom()
    {
        freeRoomState=new FreeRoomState();
        bookingState=new BookingRoomState();
        checkInState=new CheckInRoomState();
        this.currentState=freeRoomState;
    }

    @Override
    public void request() {
        currentState.handle(this);
    }

    @Override
    public void changeState(int state) {
        if(state==1)
        {
            this.currentState=freeRoomState;
            this.request();
        }
        else if (state==2)
        {
            this.currentState=bookingState;
            this.request();
        }
        else if(state==3)
        {
            this.currentState=checkInState;
            this.request();
        }
        else
        {
            System.out.printf("类型为"+state+"错误");
        }
    }


}
