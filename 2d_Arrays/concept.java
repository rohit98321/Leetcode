import java.util.*;
public class concept {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> temp =new ArrayList<>();

        temp.add(10);
        temp.add(20);
        temp.add(30);
        list.add(new ArrayList<>(temp));
        temp.clear();
        temp.add(40);
        temp.add(50);
        temp.add(60);
        list.add(new ArrayList<>(temp));
        System.out.println(list);
       

        
    }
}
