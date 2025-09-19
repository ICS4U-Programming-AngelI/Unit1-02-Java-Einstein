import java.util.Scanner;

/**
 * The program asks the user for the mass of an object
 * and tells them how much energy would be released
 * if that mass were converted to energy using E = mc^2.
 *
 * @author Angel
 * @version 1.0
 * @since 2025-09-18
 */

public final class Einstein {

    /** Constant for speed of light. */
    static final double SPEED_OF_LIGHT = 2.998e8; // speed of light in m/s

    private Einstein() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Main method that runs the program.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {

            System.out.print("Enter the mass of the object in kilograms: ");

            // Using Scanner for input
            Scanner scanner = new Scanner(System.in);
            final String userMassString  = scanner.nextLine();

            try {
                // Convert input to float
                final float userMass = Float.parseFloat(userMassString);

            if (userMass < 0) {
                System.out.println("Mass cannot be negative.");
            } else {
                double energy = userMass * SPEED_OF_LIGHT * SPEED_OF_LIGHT;
                System.out.printf("The energy released is");
                System.out.printf(" %.3e Joules.%n", energy);
            }
        } catch (Exception e) {
            System.out.println("Invalid input.");
            System.out.printf("Please enter a numeric value for mass.");
        } finally {
            scanner.close();
        }
    }
}
