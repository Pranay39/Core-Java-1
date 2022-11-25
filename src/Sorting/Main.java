package Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<ComparableEx1> list1 = new ArrayList<>();
        list1.add(new ComparableEx1(101, "Pranay", "Patil", 22));
        list1.add(new ComparableEx1(104, "Zayn", "Bl", 18));
        list1.add(new ComparableEx1(103, "Akshay","Patil", 21));
        list1.add(new ComparableEx1(102, "Zayn", "Al", 18));
        

        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        // ComparableEx1 obj1 = new ComparableEx1();
        
    }
}
