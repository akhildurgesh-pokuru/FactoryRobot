import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactoryRobotUC3Test {

    @Test
    void testCalculateHazardRisk() {

        double result =
                FactoryRobotUC3.calculateHazardRisk(
                        0.85,
                        10,
                        1.3
                );

        assertEquals(13.75, result, 0.001);
    }

    @Test
    void testCalculateHazardRiskWithZeroDensity() {

        double result =
                FactoryRobotUC3.calculateHazardRisk(
                        1.0,
                        0,
                        1.3
                );

        assertEquals(0.0, result, 0.001);
    }

    @Test
    void testCalculateHazardRiskWithCriticalFactor() {

        double result =
                FactoryRobotUC3.calculateHazardRisk(
                        0.5,
                        10,
                        3.0
                );

        assertEquals(37.5, result, 0.001);
    }
}