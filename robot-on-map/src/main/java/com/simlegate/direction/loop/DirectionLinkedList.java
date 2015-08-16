package com.simlegate.direction.loop;

import com.simlegate.direction.DirectionEnum;

public class DirectionLinkedList {

    public final CustomLinkedList<String> directions = new CustomLinkedList<String>();

    public DirectionLinkedList() {
        directions.add(DirectionEnum.E.getValue());
        directions.add(DirectionEnum.S.getValue());
        directions.add(DirectionEnum.W.getValue());
        directions.add(DirectionEnum.N.getValue());
    }

    public String next(String current) {
        return directions.get(current).next.element;
    }

    public String previous(String current) {
        return directions.get(current).previous.element;
    }
}
