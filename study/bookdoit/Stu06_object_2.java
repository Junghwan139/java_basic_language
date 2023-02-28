package study.bookdoit;

public class Stu06_object_2 {
    public static void main(String[] args) {

//        1. 클래스와 객체(2)

//        1) this 예약어 : 생성된 인스턴스 스스로를 가리키는 예약어
//         (1) 자신의 메모리를 가리키는 this //class BirthDay
        BirthDay bDay = new BirthDay();
        bDay.setYear(2000);
        System.out.println(bDay);
        bDay.printThis();

//         (2) 생성자에서 다른 생성자를 호출하는 this // class Person
        Person noName = new Person();
        System.out.println(noName.name);
        System.out.println(noName.age);


//         (3) 자신의 주소를 반환하는 this



    }

}


class BirthDay {
    int day;
    int month;
    int year;

    public void setYear(int year){
        this.year = year;
    }

    public void printThis(){
        System.out.println(this);
    }

}

class Person {
    String name;
    int age;

    Person(){  // 생성자(1)
        this("이름없음",1);

    }

    Person(String name, int age){   // 생성자(2)
        this.name = name;
        this.age = age;

    }

}