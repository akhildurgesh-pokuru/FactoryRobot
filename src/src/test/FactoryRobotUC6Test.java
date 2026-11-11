package com.factoryrobot.uc6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryRobotUC6Test {

    @Test
    void testValidHazardCalculation() throws RobotSafetyException {

        double result =
                FactoryRobotUC6.calculateHazardRisk(
                        0.85, 10, 1.3
                );

        assertEquals(15.25, result, 0.001);
    }

    @Test
    void testInvalidPrecision() {

        RobotSafetyException exception = assertThrows(
                RobotSafetyException.class,
                () -> FactoryRobotUC6.calculateHazardRisk(
                        1.5, 10, 1.3
                )
        );

        assertEquals(
                "Arm precision must be between 0 and 1",
                exception.getMessage()
        );
    }

    @Test
    void testInvalidDensity() {

        RobotSafetyException exception = assertThrows(
                RobotSafetyException.class,
                () -> FactoryRobotUC6.calculateHazardRisk(
                        0.85, -5, 1.3
                )
        );

        assertEquals(
                "Worker density cannot be negative",
                exception.getMessage()
        );
    }
}