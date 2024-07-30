package Questions;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,11,13,14,19,17,20};
        int target = 3;
        int ans = binSearch(arr,target);
        System.out.println(ans);
    }

    static int binSearch(int[] arr, int target) {
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
        return -1;
    }

}
