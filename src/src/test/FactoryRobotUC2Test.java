
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FactoryRobotUC2Test {

    @Test
    void testAcceptRobotInputs() {

        String input = "0.85\n10\nWorn\n";

        System.setIn(
                new ByteArrayInputStream(input.getBytes())
        );

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        System.setOut(new PrintStream(output));

        FactoryRobotUC2.main(new String[]{});

        String result = output.toString();

        assertTrue(result.contains("0.85"));
        assertTrue(result.contains("10"));
        assertTrue(result.contains("Worn"));
    }
}