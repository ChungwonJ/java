package week02;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void walk(){
        System.out.println("이름 : " + name + "나이 : " + age);
    }
}
