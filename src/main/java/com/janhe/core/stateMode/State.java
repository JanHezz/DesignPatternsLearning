package com.janhe.core.stateMode;

/**
 * @CLASSNAME State
 * @Description 状态接口
 * @Auther Jan  橙寂
 * @DATE 2019/8/22 0022 13:51
 */
public interface State {

    void  handle(Room room);
}
