import java.util.*;

public class Q561 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;

        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int []arr={5,4,2,42,4,1};
        int result=arrayPairSum(arr);
        System.out.println(result);
        
    }
}
