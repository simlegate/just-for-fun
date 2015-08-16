package com.simlegate.commods;

public class SimpleCommandFactory {

    public static Command factory(String cmd) {
        if (cmd.equals(CommandEnum.L.getValue())) {
            return new LCommand();
        } else if (cmd.equals(CommandEnum.R.getValue())) {
            return new RCommand();
        } else if (cmd.equals(CommandEnum.M.getValue())) {
            return new MCommand();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
