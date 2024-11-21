public class TestRandom {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int countAbove = 0;
        int countBelow = 0;

        for (int i = 0; i < N; i++) {
            if (Math.random() > 0.5) {
                countAbove++;
            } else {
                countBelow++;
            }
        }

        double ratio = (countBelow == 0) ? Double.POSITIVE_INFINITY : (double) countAbove / countBelow;

        // Output results using string concatenation
        System.out.println("> 0.5: " + countAbove + " times");
        System.out.println("<= 0.5: " + countBelow + " times");
        if (countBelow > 0) {
            System.out.println("Ratio: " + ratio);
        } else {
            System.out.println("Ratio: Infinite (No values <= 0.5)");
        }
    }
}
