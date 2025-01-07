package week02.array;
import java.util.Arrays;

public class Arr03 {
    public static void main(String[] args) {
        // 얕은 복사

        int[] a = { 1, 2, 3, 4 };
        int[] b = a; // 얕은 복사

        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

        System.out.println(a[0]); // 출력 3  <- a 배열의 0번째 순번값도 3으로 조회됩니다.

        // 깊은 복사

        int[] deepA = { 1, 2, 3, 4 };
        int[] deepB = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            deepB[i] = a[i]; // 깊은 복사
        }

        deepB[0] = 3; // deepB 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

        System.out.println(a[0]); // 출력 1 <- 깊은 복사를 했기때문에 deepA 배열은 그대로 입니다
    }
}
