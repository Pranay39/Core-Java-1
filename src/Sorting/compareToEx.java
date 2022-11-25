package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class compareToEx {
    public static void main(String[] args) {
        String a = "panay";
        String b = "oanay";

        // Find lenght of the string a
        String c = "";
        int length = a.compareTo(c);

        // System.out.println(a.compareTo(b));
        // System.out.println(length);

        ComparableEx1[] arr = new ComparableEx1[5];
        arr[0] = new ComparableEx1(1, "a", "a", 12);
        System.out.println("arr = "+Arrays.toString(arr));
       
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        System.out.println(l);

        
    }

   
}
