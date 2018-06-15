package proselyte;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List arrayList = new ArrayList<>();
        arrayList.add(234);
        arrayList.add(234);
        arrayList.add(234);
        arrayList.add(342);
        arrayList.add(564);
        arrayList.add(78);
        arrayList.add(89);
        arrayList.add(98);
        arrayList.add(234);
        arrayList.add(6);
        arrayList.add(3);


        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n========================\n");
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            Integer element = (Integer) listIterator.next();
            listIterator.set(element * 10);
        }
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n========================\n");

        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
    }
}
