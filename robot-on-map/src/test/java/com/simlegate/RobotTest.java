package com.simlegate;

import com.simlegate.commods.Command;
import com.simlegate.commods.SimpleCommandFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotTest {

    private Robot robot;

    @Before
    public void initTest() {
        robot = new Robot(0L, 0L, "N");
    }

    @Test
    public void testExecuteCommandIsR() throws Exception {
        Command command = SimpleCommandFactory.factory("R");
        robot.executeCommand(command);
        assertEquals("0", robot.getX().toString());
        assertEquals("0", robot.getY().toString());
        assertEquals("E", robot.getD());
    }

    @Test
    public void testExecuteCommandIsM() throws Exception {
        Command commandR = SimpleCommandFactory.factory("R");
        Command commandM = SimpleCommandFactory.factory("M");
        robot.executeCommand(commandR);
        robot.executeCommand(commandM);
        assertEquals("1", robot.getX().toString());
        assertEquals("0", robot.getY().toString());
        assertEquals("E", robot.getD());
    }

    @Test
    public void testExecuteCommandIsL() throws Exception {
        Command commandR = SimpleCommandFactory.factory("R");
        Command commandM = SimpleCommandFactory.factory("M");
        Command commandL = SimpleCommandFactory.factory("L");
        robot.executeCommand(commandR);
        robot.executeCommand(commandM);
        robot.executeCommand(commandL);
        assertEquals("1", robot.getX().toString());
        assertEquals("0", robot.getY().toString());
        assertEquals("N", robot.getD());
    }

    @Test
    public void testExecuteCommandIsM1() throws Exception {
        Command commandR = SimpleCommandFactory.factory("R");
        Command commandM = SimpleCommandFactory.factory("M");
        Command commandL = SimpleCommandFactory.factory("L");
        Command commandM1 = SimpleCommandFactory.factory("M");
        robot.executeCommand(commandR);
        robot.executeCommand(commandM);
        robot.executeCommand(commandL);
        robot.executeCommand(commandM1);
        assertEquals("1", robot.getX().toString());
        assertEquals("1", robot.getY().toString());
        assertEquals("N", robot.getD());
    }
}