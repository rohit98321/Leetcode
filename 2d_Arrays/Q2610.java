import java.util.*;

public class Q2610 {
    public static ArrayList<ArrayList<Integer>> findMatrix(int[] nums) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();

        int l=nums.length;
        System.out.println(l);
        int current=0;

        if(l>=4){
            current=4;
        } 
        else if(l>=2){
            current=2;
        }else {
            current=1;
        }

        for(int i =0;i<nums.length;i++){
            
        }
        

        






        return list;
    }

    public static void main(String args[]) {

        int[] arr = { 1, 3, 4, 1, 2, 3, 1 };
        ArrayList<ArrayList<Integer>> result = findMatrix(arr);


    }
}
