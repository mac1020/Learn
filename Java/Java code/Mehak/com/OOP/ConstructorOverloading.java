package Mehak.com.OOP;

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student1 s = new Student1(20,"Mehak Kushwaha",90F);
        System.out.println(s.roll);
        System.out.println(s.name);
        System.out.println(s.marks);

        Student1 s1 = new Student1(s);
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        Student1 s2 = new Student1();
        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.marks);

        Student1 one = new Student1();
        Student1 two = one;
        System.out.println(one.name);
        System.out.println(two.name);
        one.name="Something Something";
        System.out.println(one.name);
        System.out.println(two.name);
    }
}
class Student1
{
    int roll;
    String name;
    float marks;

    Student1 (int roll,String name,float marks)
    {
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }

    Student1 (Student1 other)
    {
        this.roll=other.roll;
        this.name=other.name;
        this.marks=other.marks;
    }

    // constructor from another constructor
    Student1()
    {
        this (13,"Default Person",100.0F);
    }
}
