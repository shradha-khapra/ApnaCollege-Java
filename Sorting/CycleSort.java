import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,1,3};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclesort(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i]==i+1){
                i++;
            }else{
                swap(arr,i,arr[i]-1);
            }
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
