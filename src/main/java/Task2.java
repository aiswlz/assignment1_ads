public class Task2 {
    public static float findAvg(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int avg = arr[0];
        for (int i = 1; i < arr.length; i++) {
            avg = avg + arr[i];
        }
        float result = (float) avg / arr.length;
        return (float) result;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,1};
        float avg = findAvg(arr);
        System.out.println(avg);
    }
}
