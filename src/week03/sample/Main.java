package week03.sample;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        // 메서드 호출 : main.getClass()
        System.out.println("main.getClass() = " + main.getNumber());
        System.out.println("main.getClass() = " + main.getNumber());
        System.out.println("main.getClass() = " + main.getNumber());
    }

    public int getNumber(){
        int number = 1;
        number += 1;
        return number;
    }
}
