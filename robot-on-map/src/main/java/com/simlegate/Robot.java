package com.simlegate;

import com.simlegate.commods.Command;

public class Robot {

    private Long x;

    private Long y;

    private String d;

    public Robot(Long x, Long y, String d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }

    public void executeCommand(Command command) {
        command.execute(this);
    }

    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public Long getY() {
        return y;
    }

    public void setY(Long y) {
        this.y = y;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getLocation() {
        return String.format("[%s %s %s]", x, y, d);
    }
}
