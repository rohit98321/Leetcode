import java.util.*;

public class Q15 {

     public static void Display(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
     }
     public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result=new ArrayList<>();
        List<Integer> row=new ArrayList<>();
        Arrays.sort(nums);

        
       Display(nums);

        for(int i=0;i<nums.length;i++){
                if(i > 0 && nums[i] == nums[i-1]) continue;

                int n1=nums[i];
                int n2=i+1;
                int n3=nums.length-1;
                int target =-n1;
                System.out.println("target --> " +target);

                while(n2<n3){
                    if(nums[n2] == nums[n2+1]){
                        n2++;
                    }

                    if(nums[n3]==nums[n3-1]){
                        n3--;
                    }

                    if(nums[n2] + nums[n3] == target){
                        row.add(n1);
                        row.add(nums[n2]);
                        row.add(nums[n3]);
                        result.add(new ArrayList<>(row));
                        row.clear();
                        n2++;
                        n3--;
                        
                    }else if(nums[n2] + nums[n3] < target){
                            n2++;
                    }else{
                        n3--;
                    }
                    


                }

                
        }
        



        return result;

    }

    public static void main(String[] args) {
        int []arr={2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10};


        List<List<Integer>> result=new ArrayList<>();
        result=threeSum(arr);

        System.out.println(result);
    }
}

//output
// [[-10,5,5],[-5,0,5],[-4,2,2],[-3,-2,5],[-3,1,2],[-2,0,2]] 