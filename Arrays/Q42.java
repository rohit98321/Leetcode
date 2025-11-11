import java.util.*;

public class Q42 {
    public static int maxLeft(int arr[], int index) {

        int max = 0;
        for (int i = index; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }


    public static int maxRight(int arr[],int index){

        int max=0;
        for(int i=index;i<arr.length;i++){
            
            if(arr[i] > max){
                max=arr[i];
            }
        }



        return max;
    }

    public static int trap(int[] arr) {

            int sum=0;

        for (int i = 0; i < arr.length; i++) {

            int width=1;
            int height=arr[i];

            int min =Math.min(maxRight(arr, i),maxLeft(arr, i))-height;
            System.out.println("min --> "+min);
            sum+=min;
            


        }

        return sum;
    }

    public static void main(String args[]) {
        int[] buildings = {0,1,0,2,1,0,1,3,2,1,2,1};
        
        // System.out.println( "left --> "+maxLeft(buildings, 1));
        // System.out.println( "right --> "+maxRight(buildings, 1));
        

       int result=trap(buildings);
       System.out.println(result);

    }
}
