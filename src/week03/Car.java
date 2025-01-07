package week03;

public class Car {
    String company; // 자동차 회사
    String model = "Gv80"; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격
    double speed;  // 자동차 속도 , km/h
    char gear; // 기어의 상태, P,R,N,D
    boolean lights = true; // 자동차 조명의 상태
    Tire tire = new Tire();
    Door door;
    Handle handle;

    public Car() {} // 기본 생성자

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵");
    }

    void carSpeeds(double ...speeds){
        for (double v : speeds){
            System.out.println("v = " + v);
        }
    }
}
