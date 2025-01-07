package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성

        double speed = car.gasPedal(100, 'D');

        boolean lights = car.onOffLights();
    }
}
