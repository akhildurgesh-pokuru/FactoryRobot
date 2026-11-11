
/*
 * Factory Robot Hazard Analyzer - UC3
 * Calculates hazard risk without input validation.
 */

public class FactoryRobotUC3 {

    public static double calculateHazardRisk(
            double precision,
            int density,
            double factor) {

        return ((1.0 - precision) * 15.0)
                + (density * factor);
    }

    public static void main(String[] args) {

        double precision = 0.85;
        int density = 10;
        double factor = 1.3;

        double risk = calculateHazardRisk(
                precision,
                density,
                factor
        );

        System.out.println("Hazard Risk Score: " + risk);
    }
}