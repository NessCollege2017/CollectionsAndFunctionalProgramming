package edu.tomer;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {


       Map<String, Contact> map = new HashMap<>();





       map.put("Moe", new Contact("Moe", "green", "050710231"));//android Sharepref, Bundle, Intent(Bundle)


        Map<String, Contact> tree = new TreeMap<>(); //
        tree.put("A", new Contact("Dave", "D", "D"));
        tree.put("C", new Contact("Gil", "D", "D"));
        tree.put("B", new Contact("Aba", "D", "D"));

        for (String s : tree.keySet()) {
            System.out.println(s);
            System.out.println(tree.get(s));
        }
    }

    //Must implement comparable
    public static void treeSetDemo(){
        //set Methods:
        //add, remove
        Set<String> names = new TreeSet<>();

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println(names.add("Codee"));//true
        System.out.println(names.add("Codee"));//false
        System.out.println(names.add("Codee"));//false
        System.out.println(names.add("Mike"));//true
        System.out.println(names.add("Dave"));//true
        System.out.println(names.add("Moe")); //true
        System.out.println(names.add("Moana"));//true

        names.forEach(System.out::println);
    }
    public static void hashSetDemo(){
        //set Methods:
        //add, remove
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Codee"));//true
        System.out.println(names.add("Codee"));//false
        System.out.println(names.add("Codee"));//false
        System.out.println(names.add("Mike"));//true
        System.out.println(names.add("Dave"));//true
        System.out.println(names.add("Moe")); //true
        System.out.println(names.add("Moana"));//true
        names.forEach(System.out::println);

    }
    //consumer example:
    public static void print(String s){
        System.out.println(s);
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
