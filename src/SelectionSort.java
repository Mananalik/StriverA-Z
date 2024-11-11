import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 4, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int max = findMax(arr,0,last);
            swap(arr,max , last);
        }
    }
    static void swap (int []arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int findMax(int [] arr , int start , int last){
        int max = start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

}
