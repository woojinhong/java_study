package 변수;

public class array{
    public static void main(String[] args) {
        // 크기가 5인 고정된 정수형 배열 생성
        // int = 4 byte * 5 = 20 byte
        int[] numbers = new int[5];

        // 배열에 값 할당
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // 배열의 크기 출력
        System.out.println("Array length: " + numbers.length);
    }
}
