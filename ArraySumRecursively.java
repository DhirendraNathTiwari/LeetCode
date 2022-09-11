public class ArraySumRecursively {
    public static int sum(int input[], int startIndex){
        if(startIndex == input.length){
            return 0;
        }
        return input[startIndex] + sum(input,startIndex+1);
    }
    public static void main(String[] args) {
        int input[] = {1,2,3,4,5,6};
        System.out.println(sum(input,0));
    }
}
