import java.util.*;
public class Q66 {

    public static int[] plusOne(int[] digits) {

        int l =digits[digits.length-1];

        if(l==9){

            if(digits.length==1){
                int []newarray=new int[2];
                newarray[0]=1;
                newarray[1]=0;
                return newarray;
            }else{

                digits[digits.length-1]=0;
                digits[digits.length-2]+=1;
            }

        }else{

            digits[digits.length-1]=l+1;
        }
       


        return digits;
    }
    public static void main(String[] args) {
        int []nums={9};
        int []result=plusOne(nums);
        for(int i:result){
            System.out.print(i);
        }
    }
}
