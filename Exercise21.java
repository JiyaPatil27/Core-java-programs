public class Exercise21 {
    public static void main(String[] args) {
        // Test on empty array
        int[] emptyArray = {};
        System.out.println("Empty Array: " + arrayToString(emptyArray));

        // Test on one-element array
        int[] oneElementArray = {5};
        System.out.println("One-Element Array: " + arrayToString(oneElementArray));

        // Test on n-element array
        int[] nElementArray = {1, 2, 3, 4, 5};
        System.out.println("n-Element Array: " + arrayToString(nElementArray));
    }

    // Method to convert int array to string
    public static StringBuilder arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb;
    }
}

