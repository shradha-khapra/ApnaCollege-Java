import java.util.Arrays;

public class BubbleSortImproved {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        int[] ans = bubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] bubbleSort(int[] arr){
        int flag = 0;
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            flag=0;
            for(int j = 1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                        int temp = arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        flag = 1;
                }
            }
            if(flag==0) return arr;
        }
        return arr;
    }

}
