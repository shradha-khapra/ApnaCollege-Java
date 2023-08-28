import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,9,1,7,3,4,0,2};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksort(int[] arr,int lb,int ub){
        if(lb>=ub) return;

        int start = lb;
        int end = ub;
        int mid = lb + (ub-lb)/2;
        int pivot = arr[mid];

        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }

            if(start<=end){
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        quicksort(arr,lb,end);
        quicksort(arr,start,ub);

    }

}
