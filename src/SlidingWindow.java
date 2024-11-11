public class SlidingWindow {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(max(arr, n, k));
    }
    static int max(int arr[] , int n , int k){
        if(n<=k){
            System.out.println("Invalid");
            return -1;
        }
        int max_sum =0;
        for(int i=0;i<k;i++){
            max_sum+=arr[i];
        }
        int window_sum = max_sum;
        for(int i=k;i<n;i++){
            window_sum+=arr[i]-arr[i-k];
            max_sum = Math.max(window_sum,max_sum);
        }
        return max_sum;
    }

}
