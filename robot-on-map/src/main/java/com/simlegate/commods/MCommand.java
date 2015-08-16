package com.simlegate.commods;

import com.simlegate.Robot;
import com.simlegate.strategy.MoveStrategy;
import com.simlegate.strategy.MoveStrategyFactory;

// 前进一个方格
public class MCommand implements Command {

    public void execute(Robot robot) {
        MoveStrategy strategy = MoveStrategyFactory.factory(robot.getD());
        Long currentSite[] = strategy.move(robot.getX(), robot.getY());
        robot.setX(currentSite[0]);
        robot.setY(currentSite[1]);
    }
}
