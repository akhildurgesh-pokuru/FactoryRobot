public class main {
    public static class FactoryRobotUC6 {

        public static double calculateHazardRisk(
                double precision,
                int density,
                double factor) throws RobotSafetyException {

            if (precision < 0 || precision > 1) {

                throw new RobotSafetyException(
                        "Arm precision must be between 0 and 1"
                );
            }

            if (density < 0) {

                throw new RobotSafetyException(
                        "Worker density cannot be negative"
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
                        1.3
                );

                System.out.println("Hazard Risk Score: " + risk);

            } catch (RobotSafetyException e) {

                System.out.println(
                        "Robot Safety Error: " + e.getMessage()
                );
            }
        }
    }
}
