package com.simlegate.strategy;

import com.simlegate.direction.DirectionEnum;

public class MoveStrategyFactory {

    public static MoveStrategy factory(String d) {
        if(d.equals(DirectionEnum.E.getValue())){
            return new EMoveStrategy();
        }else if(d.equals(DirectionEnum.N.getValue())) {
            return new NMoveStrategy();
        }else if(d.equals(DirectionEnum.S.getValue())) {
            return new SMoveStrategy();
        }else if(d.equals(DirectionEnum.W.getValue())) {
            return new WMoveStrategy();
        }else {
            throw new IllegalArgumentException();
        }
    }
}
