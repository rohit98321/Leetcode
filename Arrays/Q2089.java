import java.util.*;

class Q2089{

    public static ArrayList<Integer> targetIndices(int []arr,int target){

        Arrays.sort(arr);
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                result.add(i);
            }
        }

        return result;

    }
    public static void main(String args[]){

        int []arr={1,2,3,4,2,6,10};
        ArrayList<Integer> result =targetIndices(arr, 6);
        System.out.println(result);

    }
}