import java.util.*;

public class Q42 {
    class Solution {

        public static int maxLeft(int arr[], int index) {
            int max = 0;
            for (int i = index - 1; i >= 0; i--) {
                max = Math.max(max, arr[i]);
            }
            return max;
        }
    
        public static int maxRight(int arr[], int index) {
            int max = 0;
            for (int i = index + 1; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
            }
            return max;
        }
    
        public static int trap(int[] arr) {
    
            int sum = 0;
    
            for (int i = 0; i < arr.length; i++) {
    
                int left = maxLeft(arr, i);
                int right = maxRight(arr, i);
    
                int min = Math.min(left, right);
    
                if (min > arr[i]) {
                    sum += min - arr[i];
                }
            }
    
            return sum;
        }
    }
    

    public static void main(String args[]) {
        int[] buildings = {6,5,4,3,2,1};
        
        // System.out.println( "left --> "+maxLeft(buildings, 1));
        // System.out.println( "right --> "+maxRight(buildings, 1));
        

       int result=trap(buildings);
       System.out.println(result);

    }
}

