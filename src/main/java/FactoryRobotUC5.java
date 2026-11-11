
/*
 * Factory Robot Hazard Analyzer - UC5
 * Separates validation and hazard calculation into a method.
 */

public class FactoryRobotUC5 {

    public static double calculateHazardRisk(
            double precision,
            int density,
            String state,
            double factor) {

        if (precision < 0 || precision > 1) {
            throw new IllegalArgumentException(
                    "Arm precision must be between 0 and 1"
            );
        }

        if (density < 0) {
            throw new IllegalArgumentException(
                    "Worker density cannot be negative"
            );
        }

        if (!state.equals("Worn")
                && !state.equals("Faulty")
                && !state.equals("Critical")) {

            throw new IllegalArgumentException(
                    "Invalid machinery state"
            );
        }

        return ((1.0 - precision) * 15.0)
                + (density * factor);
    }

    public static void main(String[] args) {

        try {

            double risk = calculateHazardRisk(
                    0.85,
                    10,
                    "Worn",
                    1.3
            );

            System.out.println("Hazard Risk Score: " + risk);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }
}