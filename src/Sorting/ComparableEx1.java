package Sorting;

public class ComparableEx1 implements Comparable<ComparableEx1>{
    private int empId;
    private String name;
    private String lastName;
    private int age;

    

   public ComparableEx1(int empId, String name, String lastName, int age){
    this.empId = empId;
    this.name = name;
    this.lastName = lastName;
    this.age = age;
   }

public int getEmpId() {
    return empId;
}

public String getName() {
    return name;
}

public String getlastName(){
    return lastName;
}

public int getAge() {
    return age;
}


@Override
public int compareTo(ComparableEx1 o) {
    // Sort based on last name if name is same
    if(this.name.compareTo(o.name) == 0){
        return this.lastName.compareTo(o.lastName);
    }
    else{
        return this.name.compareTo(o.name);
    }

    
    // return  this.empId - o.empId;     // Ascending Order
    // return  o.empId - this.empId;     // Descending Order
}

@Override
public String toString() {
    return "ComparableEx1 [empId=" + empId + ", name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
}





   
}
