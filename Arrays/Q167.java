import java.util.*;
public class Q167 {

    public static int[] twoSum(int[] numbers, int target) {
        
        int i=0;
        int j=(numbers.length)-1;
        int []arr=new int[2];

        while(i<j){
            if((numbers[i]+numbers[j])>target){
                j--;
            }
            else if((numbers[i]+numbers[j]) < target){
                i++;
            }else{
                arr[0]=i+1;
                arr[1]=j+1;
                break;
                
            }
        }

        return arr;

    } 
    public static void main(String[] args) {
        int []arr={2,7,11,15};
        int []result=new int[2];
        result=twoSum(arr,9);
        System.out.println(result[0]+" "+result[1]);
        
    }
}