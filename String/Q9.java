public class Q9 {

    public static boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        String rev=new StringBuilder(s).reverse().toString();   

        return s.equals(rev);
    }
    public static void main(String[] args) {
        boolean res=isPalindrome(10);
        System.out.println(res);
    }
}
