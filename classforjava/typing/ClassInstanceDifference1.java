package classforjava.typing;

public class ClassInstanceDifference1 {
//    static int total =0;
//   // int instance_total = 0;
//
//    public static int add(int a){
//        total +=a;
//        return total;
//    }

    // static이 붙으면 클래스 변수라 부른다.
    // static이 붙어 있는 변수와 함수는 메모리상에 항상 떠있는 형태이다.

    // static이 붙으면 메서드가 아니라, 클래스 함수라 부른다.
    // void는 비어있다라는 의미로서, 여기서는 return값이 없다는 뜻이다.
    static int static_total = 0;
//    메서드밖에서 static없이 선언된 변수는 instance(객체) 변수라 부른다.
    int instance_total =0;

    public static int  static_add(int a) {
//        메서드 안에서 선언된 변수는 지역변수라 부른다.
        static_total +=a;
        return static_total;
    }

    public void  instance_add(int a) {
//        메서드 안에서 선언된 변수는 지역변수라 부른다.
        this.instance_total +=a;  // 리턴이 되어도 되고 안되고 상관없음 instance변수 니까 → 메모리상에 항상 떠 있음 (지역변수 였으면 리턴해야함)
        // instance변수 또한 클래스 변수 처럼 메모리상에 상시적으로 저장된다. 그래서 return을 해도 되고 안해도 되는 선택적 사항이다.
        // static변수와의 메모리상의 차이점은 garbage컬렉터를 통해 인스턴스변수는 관리된다는 것.
        // garbage컬렉터란 jvm안에 내장된 불필요한 데이터를 자동삭제관리 해주는 기능이다.
        // this를 붙이는 이유는 매개변수명(input)과 구분을 짓기 위함이다.






    }
        }


