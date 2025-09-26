package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {

       /* Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

//        System.out.println(set.contains("Notebook"));

        for(String p : set){
            System.out.println(p);
        }

        System.out.println();
        System.out.println("===========================");
        System.out.println();

      *//*  set.removeIf(x -> x.length() >= 3);*//*
        set.removeIf(x -> x.charAt(0) == 'T');
//        set.remove("Tablet");

        for(String p : set){
            System.out.println(p);
        }*/

//        2ª DEMONSTRAÇÃO

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

//        UNIÃO
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

//        INTERSEÇÃO
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

//        DIFERENÇA
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
