package co;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {

    public static void main (String args[]){
        Queue<String> queue  = new LinkedList<>();

        queue.add("hola");
        queue.add("hola");
        queue.add("hola2");

        for (String q : queue){
            System.out.println(q);
        }

        System.out.println(queue.poll());

        for (String q : queue){
            System.out.println(q);
        }
    }
}
