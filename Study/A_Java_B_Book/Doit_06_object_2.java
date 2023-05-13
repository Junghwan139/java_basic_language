package Study.A_Java_B_Book;

public class Doit_06_object_2 {
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

//        2) 객체 간 협력
        Student st1 = new Student("James", 5000);
        Student st2 = new Student("Tomas",10000);

        Bus bus100 = new Bus(100);
        st1.takeBus(bus100);
        st1.showInfo();
        bus100.showInfor();

        Subway subwayGreen = new Subway("2호선");
        st2.takeSubway(subwayGreen);
        st2.showInfo();
        subwayGreen.showInfo();

//        3) static 변수 : 변수를 여러 클래스에서 공통으로 사용하려면?
//          (1) static 변수, 정적 변수, 클래스 변수 ↔ 멤버변수, 인스턴스 변수
//          (2) 클래스 메서드

//        4) 변수 유효 범위
        
        
//        5) static 응용 - 싱글톤 패턴 : 객체 지향 프로그램에서 인스턴스를 단 하나만 생성하는 디자인패턴













    }


    public static int serialNum = 1000;
    public int studentID;
    public String studentNames;
    public int grade;
    public String address;

    public String getStudentName(){
        return studentNames;
    }

    public void setStudentNames(String name){
        studentNames = name;

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

class Student {

    String studentName;
    int grade;
    int money;

    // 학생 이름과 가진 돈을 매개변수로 받는 생성자
    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    // 디폴트 생성자
    public Student(){}

    // 학생이 버스를 타면 1,000원을 지불하는 기능을 구현한 메서드
    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -=1000;
    }

    // 학생이 지하철을 타면 1,500원을 지불하는 기능을 구현한 메서드
    public void takeSubway(Subway subway){
        subway.take(1500);
        this.money -=1500;
    }

    public void showInfo(){
        System.out.println(studentName+"님의 남은 돈은"+money+"입니다.");
    }

}

class Bus{
    int busNumber;
    int passengerCount;
    int money;

    // 버스 번호를 매개변수로 받는 생성자
    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    // 승객이 버스에 탄 경우를 구현한 메서드
    public void take(int money){
        this.money +=money;  // 버스 수입 증가
        passengerCount++;  // 승객 수 증가
    }

    // 버스 정보를 출력하는 메서드
    public void showInfor(){
        System.out.println("버스"+busNumber+"번의 승객은 " + passengerCount+"명이고, 수입은 "+money+"입니다.");
    }

}

class Subway{
    String lineNumber;
    int passengerCount;
    int money;

    // 지하철 노선 번호를 매개변수로 받는 생성자
    public Subway(String lineNumber){
        this.lineNumber = lineNumber;
    }

    // 승객이 지하철에 탄 경우를 구현한 메서드
    public void take(int money){
        this.money +=money;
        passengerCount++;
    }

    // 지하철 정보 출력하는 메서드
    public void showInfo(){
        System.out.println(lineNumber+"의 승객은"+passengerCount+"명이고, 수입은"+money+"입니다.");
    }

}