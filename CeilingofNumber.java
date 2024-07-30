package Questions;

public class CeilingofNumber {
    public static void main(String[] args) {
        //It will return the target or > target number
        //while (s<=e) condition breaks s = e + 1 s is next big number
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr,target);
        System.out.println(ans);

    }
    static int ceiling(int[] arr, int target) {
        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //Find the middle value
            int mid = start + (end - start) / 2; //5 s+e/2
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;

            }
        }
        return start;
    }
}
