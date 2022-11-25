package Sorting;



public class ComparatorEx1 {
    private String name;
    private int rollno;
    private int age;

    public ComparatorEx1(String name, int rollno, int age){
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollno;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "ComparatorEx1 [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
    }
}
 