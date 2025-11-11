//direction --> 0: left to right
//direction --> 1: top to down
//direction --> 0: right to left
//direction --> 0: down to top




import java.util.*;

public class Q54 {

    public static List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> result = new ArrayList<>();
        int top=0;
        int down=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        int dir=0;

       

        int n=(down+1)*(right+1);
        System.out.println("n --> "+n);
        int j=0;

        while(dir < 4 && j<n){

          if(dir==0){

            for(int i=left;i<=right;i++){
              result.add(matrix[top][i]);
            }
            top++;
            j++;

          }

          if(dir==1){
            for(int i=top;i<=down;i++){
              result.add(matrix[i][right]);
            }
            right--;
            j++;
          }

          if(dir==2){
            for(int i=right;i>=left;i--){
              result.add(matrix[down][i]);
            }
            down--;
            j++;
          }

          if(dir==3){

            for(int i=down;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;
            j++;
          }


          dir++;
          j++;

          if(dir==4)dir=0;


        }


        return result;

    }

    public static void main(String args[]) {
            // int [][]arr=
            // { {1,2,3},
            //   {4,5,6},
            //   {7,8,9}
            // };

            // int [][]arr=
            // { {1,2,3,4},
            //   {5,6,7,8},
            //   {9,10,11,12},
            //   {13,14,15,16}
            // };

            int [][]arr=
            { {1,2,3,4},
              {5,6,7,8},
              {9,10,11,12}
            };


            System.out.println(arr[0].length);
            System.out.println(arr.length);

            List<Integer> result=spiralOrder(arr);
            System.out.println(result);
    }
}
