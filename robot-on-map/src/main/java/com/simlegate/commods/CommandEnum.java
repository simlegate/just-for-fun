package com.simlegate.commods;

public enum CommandEnum {

    L("L", "向左"),

    R("R", "向右"),

    M("M", "前进");

    private String value;

    private String message;

    CommandEnum(String value, String message) {
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
