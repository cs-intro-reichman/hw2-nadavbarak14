public class CalcPi {
    public static void main(String[] args) {
        int terms = Integer.parseInt(args[0]);
        double pi = 0.0;
        for (int i = 0; i < terms; i++) {
            pi += (i % 2 == 0 ? 1 : -1) * (1.0 / (2 * i + 1));
        }
        pi *= 4;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + pi);
    }
}
