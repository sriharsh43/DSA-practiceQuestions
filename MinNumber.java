package Questions;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,7,8,11,14,18,544};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public  static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

}

