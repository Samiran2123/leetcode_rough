import java.util.Scanner;
public class le1688 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of mathces");
        int n = sc.nextInt();
        int matches = 0;
        int sum = 0;
        while(n>=2){
            if(n%2==0){
                matches=n/2;
                n=n-matches;
                sum = sum+matches;
            }else {
               matches=(n-1)/2 ;
               n=n-matches;
               sum = sum+matches;
            }
         }
         System.out.println(sum);
    }
}
