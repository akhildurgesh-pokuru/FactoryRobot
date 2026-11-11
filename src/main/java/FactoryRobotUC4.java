
/*
 * Factory Robot Hazard Analyzer - UC4
 * Validates robot hazard inputs using conditional statements.
 */

public class FactoryRobotUC4 {

    public static void main(String[] args) {

        double precision = 0.85;
        int density = 10;
        String state = "Worn";

        double factor = 1.3;

        if (precision < 0 || precision > 1) {

            System.out.println("Invalid arm precision");

        } else if (density < 0) {

            System.out.println("Invalid worker density");

        } else if (!state.equals("Worn")
                && !state.equals("Faulty")
                && !state.equals("Critical")) {

            System.out.println("Invalid machinery state");

        } else {

            double risk =
                    ((1.0 - precision) * 15.0)
                            + (density * factor);

            System.out.println("Hazard Risk Score: " + risk);
        }
    }
}