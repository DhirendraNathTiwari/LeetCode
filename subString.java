public class subString {
    public static void substring(String str){
        for(int len=1; len<=str.length(); len++){
            for(int start=0; start<str.length()-len; start++){
                int end = len+start;
                System.out.println(str.substring(start,end+1));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // String str="pqrs";
        // substring(str);
        int [][]arr = new int[4][5];
        for(int i=0; i<4; i++){
            arr[i][0]=2;
        } 
        System.out.println(arr[3][0]);

    }
}
