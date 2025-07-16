package DSA_Advance;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queues { //fifo,lilo

       public static Queue<Integer> q = new ArrayDeque<>();
       public static Queue<Integer> q2 = new ArrayDeque<>();
    public static void printQueue() {
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        for (int i : q) {
            q2.add(i);
            System.out.println(q.remove());
        }
        System.out.println("q2 : " + q2);
    }

    public static void main(String[] args) {
        printQueue();
        System.out.println(q2);
        System.out.println(q);
    }
}
