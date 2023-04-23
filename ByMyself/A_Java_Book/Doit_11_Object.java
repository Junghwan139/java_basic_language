package ByMyself.A_Java_Book;

public class Doit_11_Object {

    public static void main(String[] args) {

//        1.Object 클래스
//        1) java.lang 패키지(String, Integer 등 포함한 패키지 -> String원래 이름은 java.lang.Stsring)
//        2) 모든 클래스의 최상위 클래스 Object
//        3) toString() 메서드
//        Object 클래스에서 기본으로 제공하는 toString()메서드는 이름처럼 객체 정보를 문자열로 바꾸어 줍니다.
//        Object 클래스를 상속받은 모든 클래스는 toString()을 재정의할 수 있습니다. String이나 Integer등
//        여러 JDK 클래스에는 toString()메서드가 이미 재정의 되어 있습니다.
//        - Object클래스의 toString() 메서
        Book book1 = new Book(200, "개미");
        System.out.println(book1.bookNumber+book1.bookTitle);
        System.out.println(book1.toString());
//        4) equals() 메서드
//        두 인스턴스의 주소 값을 비교하여 boolean값을 반환. 주소 값이 같다면 당연히 같은 인스턴스. 그런데
//        그런데 서로 다른 주소 값을 가질 때도 같은 인스턴스라고 정의하는 경우 있음. 따라서 물리적 동일성
//        (인스턴스의 메모리 주소가 같음)뿐 아니라 논리적 동일성(논리적으로 두 인스턴스가 같음)을 구현할 때도
//        equals() 메서드를 재정의하여 사용

//        5) hashCode()
//        6) clone()

//        2. String 클래스
//        1) String을 선언하는 두 가지 방법
//        2) String 클래스의 final char[] 변수
//        3) StringBuffer와 StringBuilder클래스 활용하기

        String s_1 = "abcd";
        StringBuffer stb = new StringBuffer();
        System.out.println(stb);
        stb.append(s_1);
        System.out.println(stb);
        stb.append(1);
        System.out.println(stb);
        String a = stb.toString();

//        3. Wrapper 클래스
//        1) 기본 자료형을 위한 클래스
//        2) Integer 클래스 사용하기
//           - intValue() : Integer → int
//           - Integer.valueOf() : 문자열 → Integer
//           - Integer.parseInt() : 문자열 → int
//        3) 오토박싱과 언박싱

//        4. Class 클래스
//        1) Class 클래스란?
//        여러 클래스 중에 상황에 따라 다른 클래스를 사용해야할 때도 있고, 반환받는 클래스가 정확히 어떤 자료형인지 모를
//        때도 있습니다. 이렇게 모르는 클래스의 정보를 사요할 경우에 우리가 클래스 정보를 직접 찾아야 합니다.
//        이때 class클래스를 활용합니다.
//        2) Class 클래스를 활용해 클래스 정보 알아보기
//        3) newInstance()를 사용해 클래스 생성하기













    }
}

// 1-1)
class Book {

    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle) {  // 책 번호와 제목을 매개변수로 입력받는 생성자
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return bookTitle+" , "+bookNumber;
    }
}

class Person_11 {

    private String name;
    private int age;

    public Person_11(){}

    public Person_11(String name){
        this.name = name;
    }

    public Person_11(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


}