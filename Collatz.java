public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int seed = 1; seed <= N; seed++) {
            int steps = 0;
            int value = seed;
            String sequence = value + " ";
            while (value != 1) {
                if (value % 2 == 0) {
                    value /= 2;
                } else {
                    value = 3 * value + 1;
                }
                sequence += value + " ";
                steps++;
            }
            if ("v".equals(mode)) {
                System.out.println(sequence.trim() + "(" + steps + ")");
            }
        }
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
