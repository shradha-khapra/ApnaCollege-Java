import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void selectionsort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int lastindex = arr.length-i-1;
            int maxindex = max(arr,0,lastindex);
            swap(arr,lastindex,maxindex);
        }
    }

    static void swap(int[] arr,int last,int max){
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;
    }

    static int max(int[] arr,int start,int end){
        int max = start;
        for(int i = start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }


}
