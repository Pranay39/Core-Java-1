package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Main_Comparator {
    public static void main(String[] args) {
        // ComparatorEx1[] arr = new ComparatorEx1[5];
        // arr[0].getName() = "Pranay";

        ArrayList<ComparatorEx1> list2 = new ArrayList<>();
        list2.add(new ComparatorEx1("Pranay", 103, 22));
        list2.add(new ComparatorEx1("Akshay", 101, 24));
        list2.add(new ComparatorEx1("Rahul", 102, 18));
        list2.add(new ComparatorEx1("Akshay", 105, 25));

        System.out.println(list2);
        Collections.sort(list2, new NameComparator());
        System.out.println(list2);
    }
}
