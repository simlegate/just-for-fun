package com.simlegate.strategy;

public interface MoveStrategy {

    public Long[] move(Long x, Long y, Long size);

    public Long[] move(Long x, Long y);

}
