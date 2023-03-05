package classforjava.completed;

public class C_5W_Cla08to9 {

    public static void main(String[] args) {

//        1. 클래스 / 메소드 / 클래스 함수, 변수(static)
//        ★ static이 붙은 함수, 변수는 클래스 함수, 변수라고 부름 → 객체 생성 없이, 함수, 변수 사용 가능
//        ★ 객체를 사용해야 하는 이유? 누적..붕어빵 틀(class) - 붕어빵(갹체) / 자회사를 가진 회사 → 자회사별 누적 손익 필요 시

        // class 호출을 통한 메소드 사용
        Cal cl1 = new Cal();
        cl1.add(10, 20);
        System.out.println(cl1.total);  // 리턴값이 없지만, Cal 클래스內 total 변수에 함수 값 저장하고 이를 활용 함

        // static을 통한 클래스 변수 사용
        Cal.a = 20;
        Cal.a = 30;
        System.out.println(Cal.a);

    }
}

class Cal {
    int total = 0;
    public void add(int num1, int num2) {
        total = num1 + num2;
    }

    public static int a = 0;



}