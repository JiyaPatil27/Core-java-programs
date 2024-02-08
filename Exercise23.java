import java.util.Arrays;

public class Exercise23 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int key1 = 9;
        int key2 = 10;

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Key 1: " + key1 + ", Index: " + search(array, key1));
        System.out.println("Key 2: " + key2 + ", Index: " + search(array, key2));
    }

    // Method to search for the key in the array using binary search
    public static int search(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the key is present at mid
            if (array[mid] == key) {
                return mid;
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

        // Key not found in the array
        return -1;
    }
}

