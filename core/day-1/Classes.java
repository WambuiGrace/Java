class Student {
    String name;
    int age;

    void introduce(){
        System.out.println("My name is " + name);
    }
}

public class Classes{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Grace";
        student1.age = 24;
        student1.introduce();
    }
}