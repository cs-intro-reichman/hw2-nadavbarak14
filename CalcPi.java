public class CalcPi {
    public static void main(String[] args) {
        int terms = Integer.parseInt(args[0]);
        double sum = 0.0;

        for (int i = 0; i < terms; i++) {
            // Calculate each term of the Gregory-Leibnitz series
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 0) {
                sum += term;  // Add even index terms
            } else {
                sum -= term;  // Subtract odd index terms
            }
        }

        double piApprox = sum * 4; // Multiply by 4 to approximate Pi

        // Output the constant value of Pi
        System.out.println("pi according to Java: " + Math.PI);

        // Determine the formatting of the approximated pi based on the number of terms
        String piApproxFormatted;
        if (terms == 1) {
            piApproxFormatted = String.format("%.1f", piApprox); // Specific format when terms is 1
        } else {
            piApproxFormatted = Double.toString(piApprox); // Default conversion to string
        }

        // Print the formatted approximated Pi with the exact spacing needed
        System.out.println("pi, approximated:     " + piApproxFormatted);
    }
}
