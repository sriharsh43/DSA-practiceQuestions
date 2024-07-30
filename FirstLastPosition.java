package Questions;

public class FirstLastPosition {
    public static void main(String[] args) {
    }
    public int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1}; // if the positions not found
        ans[0] = Search(nums,target,true);
        if (ans[0] != -1 ){
            ans[1] = Search(nums,target,false);
        }
        return ans;

    }
    static int Search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            //Find the middle value
            int mid = start + (end - start) / 2; //5 s+e/2
            if (target < nums[mid]) {
                end = mid - 1;

            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential ans
                ans =  mid;
            }
            if (findStartIndex){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
