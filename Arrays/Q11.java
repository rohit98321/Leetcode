public class Q11 {

    public static int maxArea(int []arr){
        int maxArea=0;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int h1=arr[i];
            int h2=arr[j];
            int w=j-i;
            int minh=Math.min(h1,h2);
            int newArea=w*minh;
            if(newArea>maxArea){
                maxArea=newArea;
            }

            if(arr[i]<arr[j]){
                i++;
            }else j--;
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int []arr={1,1};
        int result=maxArea(arr);
        System.out.println(result);
        
    }
}
