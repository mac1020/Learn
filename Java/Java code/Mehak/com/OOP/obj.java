package Mehak.com.OOP;

public class obj {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        s1.roll = 20;
        s1.name = "Mehak Kushwaha";
        s1.marks = 89.25F;
        s1.greeting();
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        System.out.println(s1);
        s1.changename("Gauri Kushwaha");
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        Student s2 = new Student(12,"Mac",90F);
        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.marks);
    }
}

class Student{
    int roll;
    String name;
    float marks = 90F;
    
    void greeting()
    {
        System.out.println("Hi! My name is "+name);
    }
    void changename(String newname)
    {
        this.name = newname;
    }
    Student ()
    {
        this.roll = 20;
        this.name = "Mehak Kushwaha";
        this.marks = 88.5F;
    }
    Student(int roll,String name,float marks) //either change variable name or put this
    {
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    
}