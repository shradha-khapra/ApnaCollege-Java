import java.util.Arrays;
import java.util.Stack;

public class HistoGram {

    public static void Next_Small_Right(int[] arr, int[] nmr) {
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nmr[i] = arr.length;
            } else {
                nmr[i] = s.peek();
            }
            s.push(i);
        }
    }

    public static void Next_Small_Left(int[] arr, int[] nml) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nml[i] = -1;
            } else {
                nml[i] = s.peek();
            }
            s.push(i);
        }
    }

    public static int Max_Area(int[] arr, int[] nsl, int[] nsr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int ht = arr[i];
            int width = (nsr[i] - nsl[i] - 1);
            int area = ht * width;
            max = Math.max(max, area);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 6 };
        int[] nsl = new int[heights.length];
        int[] nsr = new int[heights.length];
        Next_Small_Right(heights, nsr);
        System.out.println(Arrays.toString(nsr));
        Next_Small_Left(heights, nsl);
        System.out.println(Arrays.toString(nsl));
        System.out.println("max Area of Rectangle : " + Max_Area(heights, nsl, nsr));
    }
}
