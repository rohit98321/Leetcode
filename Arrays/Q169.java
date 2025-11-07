class Q169{

    public static int majorityElement(int[] nums) {
       
        int result=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            result=nums[i];
                for(int j=0;j<nums.length;j++){
                        if(result==nums[j]){
                            count++;
                        }
                }

                if(count>(nums.length)/2){
                    return result;
                }else count=0;

        }
           
        

  return -1;
            
}


    public static void main(String[] args){

        int []arr={6,5,5};

        System.out.println((arr.length)/2);

       int result= majorityElement(arr);
       System.out.println(result);

    }
}