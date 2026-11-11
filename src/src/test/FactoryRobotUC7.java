
/*
 * Factory Robot Hazard Analyzer - UC7
 * Calculates hazard risk using mapped machinery risk factors.
 */

public class FactoryRobotUC7 {

    public static double calculateHazardRisk(
            double precision,
            int density,
            String state) {

        if (precision < 0 || precision > 1) {

            throw new IllegalArgumentException(
                    "Invalid arm precision"
            );
        }

        if (density < 0) {

            throw new IllegalArgumentException(
                    "Invalid worker density"
            );
        }

        double factor =
                MachineryRiskMapper.getRiskFactor(state);

        return ((1.0 - precision) * 15.0)
                + (density * factor);
    }

    public static void main(String[] args) {

        try {

            double risk = calculateHazardRisk(
                    0.85,
                    10,
                    "Critical"
            );

            System.out.println("Hazard Risk Score: " + risk);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }
}