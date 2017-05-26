package edu.tomer;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getNames();
        Queue<Runnable> runnables = new LinkedList<>();
        runnables.add(()->{});


        ExecutorService service = Executors.newSingleThreadExecutor();

        service.submit(()->{});

    }

    public static Queue<String> getNames(){
        //Very bad for random access
        Deque<String> names = new LinkedList<>();

        names.add("Codee");
        names.add("Mike");
        names.add("Dave");
        names.add("Moe");
        names.add("Moana");
        names.offer("Moana");

        //Only a peek or null
        System.out.println(names.peek());//codee

        //retrieve but does not remove Or exception
        System.out.println(names.element());//codee


        //remove Or Null
        System.out.println(names.poll());//codee
        //remove Or exception
        System.out.println(names.remove());//Mike


        //Deque
        names.pop(); // remove element or throw
        names.push("Mira");//push

        return names;
    }
}
