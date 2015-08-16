package com.simlegate.commods;

import com.simlegate.Robot;
import com.simlegate.direction.loop.DirectionLinkedList;

// 向左旋转90度
public class LCommand implements Command {

    public void execute(Robot robot) {
        DirectionLinkedList directions = new DirectionLinkedList();
        robot.setD(directions.previous(robot.getD()));
    }
}
