
import java.util.Scanner;

/*
 * Factory Robot Hazard Analyzer - UC2
 * Accepts and displays robot hazard input values.
 */

public class FactoryRobotUC2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter arm precision: ");
        double precision = scanner.nextDouble();

        System.out.print("Enter worker density: ");
        int density = scanner.nextInt();

        System.out.print("Enter machinery state: ");
        String state = scanner.next();

        System.out.println("\nRobot Hazard Inputs");

        System.out.println("Arm Precision: " + precision);
        System.out.println("Worker Density: " + density);
        System.out.println("Machinery State: " + state);

        scanner.close();
    }
}