package 변수;
class scope_var {
    int instance_var = 60; // 인스턴스 변수
    static int class_var = 20; // 클래스 변수

    void method(int parameter) {  // 매개변수
        int local_var = 0; // 지역 변수

        System.out.println(parameter);  //매개변수 호출
    }

}
public class scope {
    public static void main(String[] args) {

    }
}