import java.util.Scanner;

public class Factorial {
    public static int Fact(int n){
        if(n==1) return 1;
        return n*Fact(n-1);
    }
    public static int Pow(int n, int m){
        if(m==1) return n;
            return n*Pow(n,--m);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int ans = Fact(n);
        int ans = Pow(5,3);
        System.out.println(ans);
    }
}
