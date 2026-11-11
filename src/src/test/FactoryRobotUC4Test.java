
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FactoryRobotUC4Test {

    @Test
    void testValidInputs() {

        double precision = 0.85;
        int density = 10;

        double risk =
                ((1 - precision) * 15) + (density * 1.3);

        assertTrue(risk > 0);
    }

    @Test
    void testInvalidPrecision() {

        double precision = 1.5;

        assertTrue(precision < 0 || precision > 1);
    }

    @Test
    void testInvalidDensity() {

        int density = -5;

        assertTrue(density < 0);
    }

    @Test
    void testInvalidMachineryState() {

        String state = "Broken";

        assertTrue(
                !state.equals("Worn")
                        && !state.equals("Faulty")
                        && !state.equals("Critical")
        );
    }
}