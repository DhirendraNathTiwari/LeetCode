import java.util.Scanner;

public class NoOfDigits {
    public static int count(int n){
        if(n==0) return 0;
        return count(n/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n)+ " : " + "No of digits");
    }
}
