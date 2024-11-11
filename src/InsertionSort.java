import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 4, 1, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; ++i) {
            for(int j = i + 1; j > 0 && arr[j] < arr[j - 1]; --j) {
                swap(arr, j, j - 1);
            }
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
