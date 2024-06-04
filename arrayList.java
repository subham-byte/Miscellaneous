package Miscellaneous;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(15);
        System.out.println(list.size());
        System.err.println(list.isEmpty());
        list.remove(1);
        System.out.println(list.size());

        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = 10;
        }
        System.out.println(arr[9]);
    }
}
