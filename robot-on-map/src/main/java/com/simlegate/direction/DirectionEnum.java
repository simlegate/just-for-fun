package com.simlegate.direction;

public enum DirectionEnum {

    E("E", "东"),

    W("W", "西"),

    S("S", "南"),

    N("N", "北");

    private String value;

    private String message;

    DirectionEnum(String value, String message) {
        this.value = value;
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }
}
