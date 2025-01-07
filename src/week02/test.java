package week02;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();

        Person person = new Person(name, age);

        person.walk();
    }
}
