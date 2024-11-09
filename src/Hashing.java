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
        int arr[] = {2,3,2,3,5};
        int N = 5;
        int P = 5;
        int hash[] = new int[P+1];
        for(int i=0;i<P;i++){
            hash[arr[i]]+=1;
        }
        int arr1[] = new int [N];
        int x=1;
        int a =0;
        while(x<=N){
            arr1[a] = hash[x];
            x++;
            a++;
        }


        System.out.println(Arrays.toString(arr1));
    }
}
