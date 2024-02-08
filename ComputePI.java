public class ComputePI {
    public static void main(String[] args) {
        double estimatedPI = computePI();
        double errorPercentage = computeErrorPercentage(estimatedPI);

        System.out.println("Estimated value of pi: " + estimatedPI);
        System.out.println("Error percentage compared to Math.PI: " + errorPercentage + "%");
    }

    public static double computePI() {
        int terms = 1000; // Number of terms to use in the series expansion
        double pi = 0.0;

        for (int i = 0; i < terms; i++) {
            int sign = (i % 2 == 0) ? 1 : -1;
            double term = 1.0 / (2 * i + 1);
            pi += sign * term;
        }

        return 4 * pi;
    }

    public static double computeErrorPercentage(double estimatedPI) {
        double actualPI = Math.PI;
        return Math.abs((estimatedPI - actualPI) / actualPI) * 100;
    }
}
