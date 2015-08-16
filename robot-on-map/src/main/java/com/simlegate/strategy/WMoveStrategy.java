package com.simlegate.strategy;

public class WMoveStrategy implements MoveStrategy {

    @Override
    public Long[] move(Long x, Long y, Long size) {
        Long site[] = {x - size, y};
        return site;
    }

    @Override
    public Long[] move(Long x, Long y) {
        return move(x, y, 1L);
    }
}
