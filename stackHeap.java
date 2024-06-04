package Miscellaneous;
import java.util.*;

public class stackHeap {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s.size());

        s.pop();
        System.out.println(s.size());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }
        System.out.println(q.size());
        q.remove();
        q.add(87);
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
    }
}
