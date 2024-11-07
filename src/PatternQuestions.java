public class PatternQuestions {
    public static void main(String[] args) {
        int n = 4;

//        // pattern 1
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//        // pattern 2
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//        // pattern 3
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        // pattern 4
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=n-i-1;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//        // pattern 5
//        for(int i=0;i<n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            for(int x=0;x<n-i-1;x++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n;i>0;i--){
//            for(int x=0;x<n-i;x++){
//                System.out.print(" ");
//            }
//            for(int j=2*i-1;j>0;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//
//                for(int x=n-i-1;x>0;x--){
//                    System.out.print(" ");
//                }
//                for(int j=0;j<(2*i+1);j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//        }
//        for(int i=0;i<n;i++) {
//            for (int x = 0; x < i; x++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < (2*n)-(2*i+1); j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<2*n-1;i++){
//            int totalcols=0;
//            if(i>=n){
//                totalcols = 2*n-i-1;
//            }else{
//                totalcols = i+1;
//            }
//            for(int j=0;j<totalcols;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int spaces = 2*(n-1);
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            for(int j=0;j<spaces;j++){
//                System.out.print(" ");
//            }
//            for(int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//            spaces-=2;
//        }
//        int start = 1;
//        int end = 1;
//        for(int i=1;i<=n;i++){
//            for(int j=start;j<=end;j++){
//                System.out.print(j+" ");
//            }
//            start = end+1;
//            end = start+i;
//            System.out.println();
//        }\
//        System.out.print("A"+1);
//        for(int i=0;i<n;i++){
//            char ch = 'A';
//            int x = 1;
//            for(int j=i;j>0;j--){
//                System.out.print(ch+x +" ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            for(char ch='A';ch<=(n-i-1);ch++){
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            char ch = 'A';
//            for(int j=0;j<=i;j++){
//                System.out.print((char)(ch+i) +" ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            char ch = 'A';
//            int totalcol=2*i+1;
//            for(int x= 0;x<n-i-1;x++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=(2*i+1);j++){
//                System.out.print(ch);
//                if(j<=(totalcol)/2){
//                    ch++;
//                }else{
//                    ch--;
//                }
//            }
//          System.out.println();
//
//        }
//        for(int i=0;i<n;i++) {
//            char ch = 'A';
//            for (int j = 0; j <= i; j++) {
//                System.out.print((char) (ch + (n - j-1)) + " ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<2*i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<(2*n-i*2);j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<2*n-2*i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<2*i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            if(i==0 || i==n-1){
//                for(int j=0;j<n;j++){
//                    System.out.print("*");
//                }
//            }else{
//                System.out.print("*");
//                for(int j=0;j<n-2;j++){
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        } n=2*n-1;
//        for(int i=0;i<=n;i++){
//            for(int j=0;j<=n;j++){
//                int index = Math.max(Math.max(i,j),Math.max(n-i,n-j));
//                System.ou.ptint(index);
//            }
//            System.out.println();
//        }
        int temp = n;
        n=2*n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int index = temp - Math.min(Math.min(i,j),Math.min(n-i-1,n-j-1));
                System.out.print(index);
            }
            System.out.println();
        }

    }
}
