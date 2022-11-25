package Sorting;

import java.util.Comparator;

public class AgeComparator implements Comparator<ComparatorEx1> {

    @Override
    public int compare(ComparatorEx1 o1, ComparatorEx1 o2) {
        return o1.getAge() - o2.getAge();
    }
    
}

   
