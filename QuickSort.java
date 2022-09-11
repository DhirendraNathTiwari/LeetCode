public class QuickSort {
    public static int partition(int[] input, int si, int ei){
        int pivot = input[si];
        int count = 0;
        for(int j = si+1; j<=ei; j++){
            if(input[j]<= pivot){
                count++;
            }
        }
        int pindx = si+count;
        input[si] = input[pindx];
        input[pindx] = pivot;

        int i = si;
        int j = ei;
        while(i<pindx && j>pindx){
            if(input[i]<=pivot){
                i++;
            }
            else if(input[j] >pivot){
                j--;
            }
            else{
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
        return pindx;
    }
    public static void quicksort(int[] input, int si, int ei){
        if(si>=ei){
            return;
        }
        int pivot = partition(input, si, ei);
        quicksort(input, si, pivot-1);
        quicksort(input, pivot+1, ei);
    }
    public static void main(String[] args) {
        int[] input = {2,4,6,3,5};
        quicksort(input, 0, 4);
        for(int i=0; i<5; i++){
            System.out.print(input[i]+ " ");
        }
        System.out.println();
    }
}
