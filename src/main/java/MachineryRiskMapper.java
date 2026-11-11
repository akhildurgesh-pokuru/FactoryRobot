
/*
 * Factory Robot Hazard Analyzer - UC7
 * Maps machinery states to their corresponding risk factors.
 */

public class MachineryRiskMapper {

    public static double getRiskFactor(String state) {

        switch (state) {

            case "Worn":
                return 1.3;

            case "Faulty":
                return 2.0;

            case "Critical":
                return 3.0;

            default:
                throw new IllegalArgumentException(
                        "Unsupported machinery state: " + state
                );
        }
    }
}