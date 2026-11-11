package TestFactoryRobot;

import org.junit.jupiter.api.Test;

import java.factoryRobot.FactoryRobotUC1;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactoryRobotUC1Test {

    @Test
    void testDisplayHazardMessage() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        PrintStream original = System.out;

        System.setOut(new PrintStream(output));

        FactoryRobotUC1.main(new String[]{});

        System.setOut(original);

        assertEquals(
                "Factory Robot Hazard Analyzer",
                output.toString().trim()
        );
    }
}