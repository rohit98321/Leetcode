public class Q31 {

    public static int[] nextPermutation(int[] arr) {
 
           // 1,3,2
           // 0 1 2
           //   i           

        int i = arr.length - 1;
        int decValIndex;
        int temp;
        while (i!=0 && arr[i] <= arr[i - 1] ) {

            i--;
        }
        i--;
        
        decValIndex = i;

        if (decValIndex >= 0) {

            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j] > arr[decValIndex]) {
                    temp = arr[j];
                    arr[j] = arr[decValIndex];
                    arr[decValIndex] = temp;
                    break;
                }
            }

        }

        int first = decValIndex + 1;
        
        int last = arr.length - 1;

        while (first <= last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;

        }

        return arr;
    }

    public static void main(String args[]) {
        int[] arr = {1,3,2};
        int[] result = nextPermutation(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
