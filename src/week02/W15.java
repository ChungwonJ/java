package week02;

public class W15 {
    public static void main(String[] args) {
        for(int i =0; i<4; i++){
            System.out.println(i + "번째 출력");
        }

        // 향상된 for 문

        int[] numbers = {3,6,9,12,15};
        for(int number: numbers) {
            System.out.print(number + " ");
        }
        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
