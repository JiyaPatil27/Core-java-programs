public class PrintArray {
    public static void main(String[] args) {
        // Test on empty array
        int[] emptyArray = {};
        System.out.print("Empty Array: ");
        printArray(emptyArray);

        // Test on one-element array
        int[] oneElementArray = {5};
        System.out.print("One-Element Array: ");
        printArray(oneElementArray);

        // Test on n-element array
        int[] nElementArray = {1, 2, 3, 4, 5};
        System.out.print("n-Element Array: ");
        printArray(nElementArray);
    }

    // Method to print int array
    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    // Overloaded method to print double array
    public static void printArray(double[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    // Overloaded method to print float array
    public static void printArray(float[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}

