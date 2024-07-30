package Questions;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(findRange(arr, target));
    }
    static int findRange(int[] arr,int target){
        /*
        Find the range start with the box of 2 and double it
        */
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            int newStart = end + 1;
            //double the box value = end = previousEnd + sizeofBox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        //the start and end is not known because it is an infinite array.
       while (start<= end){
           //find the middle element
           int mid = start + (end - start) / 2;
           if (target < arr[mid]){
               end = mid - 1;
           }else if(target > arr[mid]){
               start = mid + 1;
           }else{
               return mid;
           }

       }
       return -1;
    }
}
