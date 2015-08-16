package com.simlegate.strategy;

public class SMoveStrategy implements MoveStrategy {

    @Override
    public Long[] move(Long x, Long y, Long size) {
        Long site[] = {x, y - size};
        return site;
    }

    @Override
    public Long[] move(Long x, Long y) {
        return move(x, y, 1L);
    }
}
