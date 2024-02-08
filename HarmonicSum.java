public class HarmonicSum {
    public static void main(String[] args) {
        int n = 50000;

        double sumLeftToRight = 0.0;
        double sumRightToLeft = 0.0;

        // Computing sum from left to right
        for (int i = 1; i <= n; i++) {
            sumLeftToRight += 1.0 / i;
        }

        // Computing sum from right to left
        for (int i = n; i >= 1; i--) {
            sumRightToLeft += 1.0 / i;
        }

        // Calculating the difference
        double difference = Math.abs(sumLeftToRight - sumRightToLeft);

        // Outputting the results
        System.out.println("Sum from left to right: " + sumLeftToRight);
        System.out.println("Sum from right to left: " + sumRightToLeft);
        System.out.println("Difference: " + difference);
    }
}

