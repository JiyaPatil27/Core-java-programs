import java.util.Arrays;

public class Exercise22 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int key1 = 9;
        int key2 = 10;

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Key 1: " + key1 + ", Contains? " + contains(array, key1));
        System.out.println("Key 2: " + key2 + ", Contains? " + contains(array, key2));
    }
    // Method to check if array contains the given key using binary search
    public static boolean contains(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if key is present at mid
            if (array[mid] == key) {
                return true;
            }

            // If key greater, ignore left half
            if (array[mid] < key) {
                left = mid + 1;
            }
            // If key is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Key not found
        return false;
    }
}


