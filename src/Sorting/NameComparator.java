package Sorting;

import java.util.Comparator;

public class NameComparator implements Comparator<ComparatorEx1>{

    @Override
    public int compare(ComparatorEx1 o1, ComparatorEx1 o2) {
        int nameC =  o1.getName().compareTo(o2.getName());
        
        //If name is same then compare by age
        int ageC = o1.getAge() - o2.getAge();

        if(nameC == 0){
            return ageC;
        }
        return nameC;
    }
    
}
