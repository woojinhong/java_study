package 변수;
/*
1. Types of Variables

Primitive Data Types:
byte: Stores small integers from -128 to 127 (8-bit signed).
short: Stores integers from -32,768 to 32,767 (16-bit signed).
int: Stores integers from -2^31 to 2^31-1 (32-bit signed). This is the most commonly used integer type.
long: Stores large integers from -2^63 to 2^63-1 (64-bit signed).
float: Stores single-precision 32-bit floating point numbers (e.g., 3.14f). Used for saving memory in large arrays of floating-point numbers.
double: Stores double-precision 64-bit floating point numbers (e.g., 3.141592653589793). This is the default choice for decimal values.
char: Stores a single 16-bit Unicode character (e.g., 'A', '3').
boolean: Stores true or false values, typically used for conditional checks.

Reference Data Types:
String: A class that represents a sequence of characters, like "Hello, World!". Strings are immutable, meaning once created, their values cannot be changed.
Arrays: Stores multiple values of the same type in a single variable (e.g., int[] numbers = {1, 2, 3};).
Classes and Objects: Variables can be instances of classes, which can store complex data and provide methods for operations on that data.
*/


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
public class variable_types {
    public static void main(String[] args) {

        /**
         * 기본 데이터 타입
         */

        // byte: -128 ~ 127
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("byte 최소값: " + minByte);
        System.out.println("byte 최대값: " + maxByte);

        // short: -32,768 ~ 32,767
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("short 최소값: " + minShort);
        System.out.println("short 최대값: " + maxShort);

        // int: -2^31 ~ 2^31-1
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("int 최소값: " + minInt);
        System.out.println("int 최대값: " + maxInt);

        // long: -2^63 ~ 2^63-1
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("long 최소값: " + minLong);
        System.out.println("long 최대값: " + maxLong);

        // float: 1.4E-45 ~ 3.4028235E38 (가장 작은/가장 큰 양의 값)
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("float 최소값: " + minFloat);
        System.out.println("float 최대값: " + maxFloat);

        // double: 4.9E-324 ~ 1.7976931348623157E308 (가장 작은/가장 큰 양의 값)
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("double 최소값: " + minDouble);
        System.out.println("double 최대값: " + maxDouble);

        // char: 0 ~ 65535 (유니코드 값)
        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;
        System.out.println("char 최소값: " + (int)minChar);
        System.out.println("char 최대값: " + (int)maxChar);

        // boolean: true 또는 false (최소/최대 값의 개념은 없으므로 예시로 true/false 값을 출력)
        boolean boolTrue = true;
        boolean boolFalse = false;
        System.out.println("boolean 값: " + boolTrue);
        System.out.println("boolean 값: " + boolFalse);


        /**
         * 참조 데이터 타입
         */

        //String은 불변(immutable)하기 때문에 원본 문자열을 변경할 수 없습니다.
        //불변(immutable)이란 String은 객체로 다루어지기 때문에 한번 만들어지면 문자열 자체가 Heap 메모리에서 제거되기 전까지 남아있다는 것 
        // (자세한 내용은 java_study/java_cs/메모리영역.md)에서 확인
        ///자바의역사.md)
     
        String immutable = "immutable";
        System.out.println(immutable);
        String changeable = immutable;
        immutable = null;

        System.out.println("immutable = " + immutable);
        System.out.println("changeable = " + changeable);


    }
}
