public class Main {
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min =arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7}; // Example array
        int min = findMin(arr);
        System.out.println("Minimum value: " + min);
    }
}
