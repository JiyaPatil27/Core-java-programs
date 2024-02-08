public class TimeTable {
    public static void main(String[] args) {
        int n = 12; // Size of the multiplication table
        System.out.print(" * | ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%3d ", i);
        }
        System.out.println("\n------------------------------------------------------");

        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d | ", i);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%3d ", i * j);
            }
            System.out.println();
        }
    }
}

