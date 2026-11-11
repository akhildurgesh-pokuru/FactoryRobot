
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryRobotUC5Test {

    @Test
    void testValidHazardCalculation() {

        double result =
                FactoryRobotUC5.calculateHazardRisk(
                        0.85, 10, "Worn", 1.3
                );

        assertEquals(15.25, result, 0.001);
    }

    @Test
    void testInvalidPrecision() {

        assertThrows(
                IllegalArgumentException.class,
                () -> FactoryRobotUC5.calculateHazardRisk(
                        1.5, 10, "Worn", 1.3
                )
        );
    }

    @Test
    void testInvalidDensity() {

        assertThrows(
                IllegalArgumentException.class,
                () -> FactoryRobotUC5.calculateHazardRisk(
                        0.85, -5, "Worn", 1.3
                )
        );
    }

    @Test
    void testInvalidState() {

        assertThrows(
                IllegalArgumentException.class,
                () -> FactoryRobotUC5.calculateHazardRisk(
                        0.85, 10, "Broken", 1.3
                )
        );
    }
}