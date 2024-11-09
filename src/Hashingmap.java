import java.util.HashMap;
import java.util.Scanner;
public class Hashingmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1 ,2, 3, 1 ,3 ,2 ,1,2};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int freq = 0;
            if(mp.containsKey(key)){
                freq = mp.get(key);
            }
            freq++;
            mp.put(key,freq);
        }
        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int number;
            number = sc.nextInt();
            // fetch:
            if (mp.containsKey(number)) System.out.println(mp.get(number));
            else System.out.println(0);
        }
    }

}
