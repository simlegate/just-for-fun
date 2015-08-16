package com.simlegate.commods;

import com.simlegate.Robot;
import com.simlegate.direction.loop.DirectionLinkedList;

// 向右旋转90度
public class RCommand implements Command {

    public void execute(Robot robot) {
        DirectionLinkedList directions = new DirectionLinkedList();
        robot.setD(directions.next(robot.getD()));
    }
}
