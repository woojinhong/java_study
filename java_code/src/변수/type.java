package 변수;
/*
1. 변수의 종류

기본 데이터 타입:
byte: -128에서 127까지의 작은 정수를 저장합니다 (8비트 부호 있는 정수).
short: -32,768에서 32,767까지의 정수를 저장합니다 (16비트 부호 있는 정수).
int: -2^31에서 2^31-1까지의 정수를 저장합니다 (32비트 부호 있는 정수). 가장 많이 사용하는 정수 타입입니다.
long: -2^63에서 2^63-1까지의 큰 정수를 저장합니다 (64비트 부호 있는 정수).
float: 32비트 단정밀도 부동소수점 숫자를 저장합니다 (예: 3.14f). 부동소수점 수의 대규모 배열에서 메모리를 절약하는 데 사용됩니다.
double: 64비트 배정밀도 부동소수점 숫자를 저장합니다 (예: 3.141592653589793). 소수 값을 위한 기본 선택입니다.
char: 단일 16비트 유니코드 문자를 저장합니다 (예: 'A', '3').
boolean: true 또는 false 값을 저장하며, 일반적으로 조건 검사를 위해 사용됩니다.

참조 데이터 타입:
String: 문자열을 나타내는 클래스입니다. "Hello, World!"와 같은 문자 시퀀스를 저장합니다. 문자열은 불변(immutable)이며, 한 번 생성되면 그 값을 변경할 수 없습니다.
배열: 동일한 타입의 여러 값을 하나의 변수에 저장합니다 (예: int[] numbers = {1, 2, 3};).
클래스와 객체: 변수는 클래스의 인스턴스일 수 있으며, 복잡한 데이터를 저장하고 그 데이터에 대한 작업을 수행하는 메서드를 제공합니다.
 */
public class type {
    public static void main(String[] args) {

        /**
         * 기본 데이터 타입 - 바이트 (Byte) 8비트
         */

        // byte: -128 ~ 127
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("byte 최소값: " + minByte);
        System.out.println("byte 최대값: " + maxByte);

        /**
         * 기본 데이터 타입 - 쇼트 (Short) 16비트
         */

        // short: -32,768 ~ 32,767
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("short 최소값: " + minShort);
        System.out.println("short 최대값: " + maxShort);

        /**
         * 기본 데이터 타입 - 정수 (int) 32비트
         */

        // int: -2^31 ~ 2^31-1
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("int 최소값: " + minInt);
        System.out.println("int 최대값: " + maxInt);

        /**
         * 기본 데이터 타입 - 롱 (Long) 64비트
         */

        // long: -2^63 ~ 2^63-1
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("long 최소값: " + minLong);
        System.out.println("long 최대값: " + maxLong);

        /**
         * 기본 데이터 타입 - 플로트 (float) 32비트
         */

        // float: 1.4E-45 ~ 3.4028235E38 (가장 작은/가장 큰 양의 값)
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("float 최소값: " + minFloat);
        System.out.println("float 최대값: " + maxFloat);

        /**
         * 기본 데이터 타입 - 더블 (Double) 64비트
         */

        // double: 4.9E-324 ~ 1.7976931348623157E308 (가장 작은/가장 큰 양의 값)
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("double 최소값: " + minDouble);
        System.out.println("double 최대값: " + maxDouble);

        /**
         * 기본 데이터 타입 - 캐릭터 (Char) 단일 16비트
         */

        // char: 0 ~ 65535 (유니코드 값)
        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;
        System.out.println("char 최소값: " + (int)minChar);
        System.out.println("char 최대값: " + (int)maxChar);

        /**
         * 기본 데이터 타입 - 논리형 (Boolean) 명시된 크기는 없지만, 내부적으로 JVM에 따라 한 비트 또는 한 바이트로 구현될 수 있음
         */

        // boolean: true 또는 false (최소/최대 값의 개념은 없으므로 예시로 true/false 값을 출력)
        boolean boolTrue = true;
        boolean boolFalse = false;
        System.out.println("boolean 값: " + boolTrue);
        System.out.println("boolean 값: " + boolFalse);


        /**
         * 참조 데이터 타입 - 문자열 (String)
         */

        //String은 불변(immutable)하기 때문에 원본 문자열을 변경할 수 없습니다.
        //불변이란 String Pool object에 메모리가 제거되지 않는 한 문자열 리터럴(String Literal) 그 자체의 변경이 불가 하다는 것 입니다.
        //자세한 내용은 "java_study/java_cs/변수와메모리.md" 에서 확인

        //immutable 변수는 스택(Stack) 메모리에 저장되고, String Pool에 있는 "immutable" 문자열 객체를 참조합니다.
        String immutable = "immutable";

        // 이제 immutable 변수는 "immutable" 문자열이 아닌 "changeable" 문자열 리터럴을 참조하게 됩니다.
        immutable = "changeable";


        System.out.println("immutable = " + immutable);



        /**
         * 참조 데이터 타입 - 배열 (Array)
         */

        // 배열은 가변(mutable)하기 때문에 배열의 속성은 변경 가능합니다.
        // int[] 배열은 동일한 타입(int)의 여러 값을 저장할 수 있는 컨테이너 역할을 합니다.
        // 배열은 힙(Heap) 메모리에 저장되며, 스택(Stack) 메모리의 변수는 이 배열을 참조합니다.

        int[] numbers = {1, 2, 3};  // numbers 변수는 스택에 저장되고, 실제 배열 객체는 힙에 저장됩니다.
        numbers[0] = 10;  // 배열의 첫 번째 요소를 10으로 변경. 배열 자체는 가변.

        // 배열 객체는 가변(mutable)하기 때문에, 배열 요소의 값을 변경할 수 있습니다.
        System.out.println("첫 번째 요소: " + numbers[0]);  // 10이 출력됩니다.

    }
}
