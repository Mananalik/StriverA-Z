import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
public class Hashing {
    public static void main(String[] args) {
        // character hashing case 1
//        Scanner sc = new Scanner(System.in);
//
//        String s;
//        s = sc.next();
//
//        //precompute:
//        int[] hash = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            hash[s.charAt(i) - 'a']++;
//        }
//
//        int q;
//        q = sc.nextInt();
//        while (q-- > 0) {
//            char c;
//            c = sc.next().charAt(0);
//            // fetch:
//            System.out.println(hash[c - 'a']);
//        }
//      Scanner sc = new Scanner(System.in);
//      String s;
//      s = sc.next();
//      int hash[] = new int [256];
//      for(int i=0;i<s.length();i++){
//          hash[s.charAt(i)]++;
//      }
//      int q;
//      q = sc.nextInt();
//      while(q-- >0){
//          char c;
//          c = sc.next().charAt(0);
//          System.out.println(hash[c]);
//      }

        // Number Hashing
//        Scanner sc = new Scanner(System.in);
//
//        int n;
//        n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        //precompute:
//        int[] hash = new int[13];
//        for (int i = 0; i < n; i++) {
//            hash[arr[i]] += 1;
//        }
//
//        int q;
//        q = sc.nextInt();
//        while (q-- != 0) {
//            int number;
//            number = sc.nextInt();
//            // fetching:
//            System.out.println(hash[number]);
//        }
        int arr[] = {8,9};
        int N = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int freq =  0;
            if(map.containsKey(key)){
                freq = map.get(key);
            }
            freq++;
            map.put(key,freq);
        }
        while(N >=1){
            int number;
            number = N;
            if(map.containsKey(number)){
                arr[N-1] = map.get(number);
            }else{
                arr[N-1]=0;
            }
            N--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
