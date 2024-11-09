import java.util.ArrayList;
import java.util.Arrays;

public class RecursionEasy {
    public static void main(String[] args) {
//        rec(5,1);
//        System.out.println(sumSeries(7,1));
//        System.out.println(fact(2,1,1));
//        int arr[] = {1,2,3,4,5,6};
//
//        reverse(arr,0,arr.length-1);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
        String s = "A man, a plan, a canal: Panama";
//        s = s.replaceAll("[^A-Za-z]+", "").toUpperCase();
        s = s.toLowerCase();
        int start =0;
        int end = s.length()-1;
        System.out.println(palin(s,start,end));
        }

//    static void rec(int n,int i){
//        if(i==n){
//            System.out.print(i);
//            return;
//        }
//        System.out.print(i);
//        rec(n,i+1);
//    }
//static void rec(int n,int i){
//    if(i==n){
//        System.out.print("GFG"+" ");
//        return;
//    }
//    System.out.print("GFG"+" ");
//    rec(n,i+1);
//}
//    static long sum = 0;
//static long sumSeries(long n,long i){
//    if(i==n){
//        sum = (long) (sum+Math.pow(i,3));
//        return sum;
//    }
//    sum = (long)(sum + Math.pow(i,3));
//    return sumSeries(n,i+1);
//}
//static ArrayList<Long> fac = new ArrayList<Long>();
//    static ArrayList<Long> fact(long n,long i , long factorial){
//        if(factorial>n){
//            return fac;
//        }
//        fac.add(factorial);
//        return fact(n,i+1 , factorial*i);
//    }
//    static void reverse(int [] arr , int start , int end){
//        if(start<end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            reverse(arr,start+1,end-1);
//        }
//    }
//    static long factorial (long n){
//        if(n==0){
//            return 1;
//        }
//        return n*factorial(n-1);
//    }
//    String s = "MYnamescds jbcw";
//    System.out.println(s[0]);
static boolean palin(String s,int start , int end){
    if(start>=end){
        return true;
    }
    char f = s.charAt(start);
    char l = s.charAt(end);
    if(!Character.isLetterOrDigit(f)){
        start++;
    }
    else if(!Character.isLetterOrDigit(l)){
        end--;
    }else{
        if(f!=l) {
        return false;
    }
        start++;
        end--;
    }
    return palin(s,start,end);
    }

}
