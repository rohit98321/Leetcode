public class Q35 {

    public static int searchInsert(int[] nums, int target) {
        int k =0;
        for(int i=0;i<nums.length;i++){
            if(target > nums[i]){
                k=i+1;
            }

            if(target ==nums[i]){
                return i;
            }
        }

        return k;


    }
    public static void main(String[] args) {
        int []nums = {1,3,5,6};
        int  target = 2;
        int result =searchInsert(nums,target);
        System.out.println(result);

    }
}
