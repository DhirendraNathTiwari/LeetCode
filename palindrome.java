public class palindrome {
    public static boolean palindrome(String str) {
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            else
              i++;
              j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abba";
        // palindrome(str);
        System.out.println(palindrome(str));
    }
    
}
