package Questions;

public class targetElement {
    public static void main(String[] args) {
        int[] nums = new int[]{2,4,5,7,8,11,14,18};
        int target = 7;
        int ans = findElement(nums,target);
        System.out.println(ans);
        int ans2 = findElement2(nums,target);
        System.out.println(ans2);
    }
    static int findElement2(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
       for(int element : arr){
           if (element == target){
               return element;
           }
       }
        return -1;
    }

    static int findElement(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target){
                 return i;
            }
        }
        return -1;
    }
}
