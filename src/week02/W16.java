package week02;

public class W16 {
    public static void main(String[] args) {
//        int number = 0;
//        while(number < 3) {
//            number++;
//            System.out.println(number + "출력");
//        }

//        int number = 4;
//        do {
//            System.out.println(number + "출력");
//        } while(number < 3); // 연산을 한번 수행 후 조건문 체크

//        int number = 0;
//        while(number < 3) {
//            number++;
//            if (number == 2) {
//                break;  // 2일때 반복 중단
//            }
//            System.out.println(number + "출력");
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("i: " + i);
//            if (i == 2) {
//                break; // i 가 2일때 가장 바깥 반복문이 종료됩니다.
//            }
//            for (int j = 0; j < 10; j++) {
//                System.out.println("j: " + j);
//                if (j == 2) {
//                    break; // j 가 2일때 가장 안쪽 반복문이 종료됩니다.
//                }
//            }
//        }

        int number = 0;
        while(number < 3) {
            number++;
            if (number == 2) {
                continue;  // 2일때 반복 패스
            }
            System.out.println(number + "출력");
        }
    }
}
