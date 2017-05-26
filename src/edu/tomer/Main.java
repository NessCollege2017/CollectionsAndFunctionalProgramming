package edu.tomer;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //Stream()...
        List<String> names = new ArrayList<>();
        names.add("Codee");
        names.add("Codee");
        names.add("Codee");
        names.add("Mike");
        names.add("Dave");
        names.add("Moe");
        names.add("Moana");

        //count all the names.length
        System.out.println(
                names.stream().
                        map(String::length).
                        reduce(0, new BinaryOperator<Integer>() {
                            @Override
                            public Integer apply(Integer s, Integer i) {
                                return s + i;
                            }
                        })
        );


        names.stream().
                map(name->new Contact(name, "", "")).
                forEach(System.out::println);


        //filter: filter(s->s.contains("M")
        //distinct, calls equals:
        names.
                stream().
                distinct().
                sorted((s1, s2)->s1.length()-s2.length()).
                forEach(System.out::println);

        //sum using a loop
        //int sum = 0 //identity
        //fori -> sum+=arr[i] //accumulator

        //terminal operations:
        Integer sums = Stream.of(1, 2, 3, 4, 5, 6).
                reduce(0, (sum, arri) -> sum + arri);

        Integer mult = Stream.of(1, 2, 3, 4, 5, 6).
                reduce(1, (m, arri) -> m * arri);

        //terminal operations:
        names.stream().
                distinct().
                filter(s->s.contains("c")).
                count();

        Stream.of(1, 2, 3, 4, 5, 6).max((n1, n2) -> n1 - n2);
        System.out.println(sums);


        Collections.sort(names, (name1, name2) -> {
            //return name1.compareTo(name2);//ordinal.
            return name1.length() - name2.length(); //by length
        });

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
