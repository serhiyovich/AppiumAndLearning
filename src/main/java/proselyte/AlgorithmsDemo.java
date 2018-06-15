package proselyte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        List arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(454);
        arrayList.add(3543);
        arrayList.add(-24343);
        arrayList.add(-2);
        arrayList.add(-2);
        arrayList.add(-3);
        arrayList.add(54);
        arrayList.add(6344);
        arrayList.add(10);
        arrayList.add(-23);
        arrayList.add(432);
        arrayList.add(23);
        arrayList.add(5);
        arrayList.add(0);
        System.out.println("Initial arrayList");
        System.out.println(arrayList);
        System.out.println("\n-------------------------------------\n");
        System.out.println("Sorting arrayList...");

        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("\n-------------------------------------\n");
        System.out.println("Inverting collections");
        Comparator comparator = Collections.reverseOrder();
        Collections.sort(arrayList, comparator);
        System.out.println(arrayList);
        System.out.println("\n-------------------------------------\n");
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
