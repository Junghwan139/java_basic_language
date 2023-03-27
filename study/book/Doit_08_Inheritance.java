package study.book;

public class Doit_08_Inheritance {

    public static void main(String[] args) {

//        1. 상속이란?
//        1) 클래스의 상속 : class B extends A {  } → B클래스가 A클래스를 상속 받는다
//        2) 상속을 사용하여 고객 관리 프록램 구현하기

//        2. 상속에서 클래스 생성과 형 변환★★★
//        1) 하위 클래스가 생성되는 과정 : 하위 클래스를 객체 생성하면 상위 클래스가 먼저 호출 되고, 이후에 하위 클래스가 호출됨
//           → 하위 클래스 생성자에서 super()자동으로 호출하기 때문
        VIPCustomer vips = new VIPCustomer();
//      - ★★★ 선언을 Customer cu = new VIPCustomoer()로 할경우 cu는 customer클래스로 형변환 된 것!!
//        따라서 VIPCustmoer()에서 만들어진 메소드는 사용할 수 없음(Customer 오버라이딩 메소드는 가능)

//        2) 부모를 부르는 예약어 super
//        3) 상위 클래스로 묵시적 클래스 형 변환 : Customer vs = new VIPCustomer();

//        3. 메서드 오버라이딩
//        1) 상위 클래스 메서드 재정의하기
//        2) 묵시적 클래스 형 변환과 메서드의 재정의
//        3) 가상 메서드
//           - 변수가 사용하는 메모리와 메서드가 사용하는 메모리는 다르다. 변수는 인스턴스가 생성될 때마다 새로 생성되지만,
//             메서드는 실행해야 할 명령 집합이기 때문에 인스턴스가 달라도 같은 로직을 수행합니다. 즉 같은 객체의 인스턴스를
//             여러개 생성한다고 해서 메서드도 여러 개 생성되지 않습니다.
//           - 메인함수가 실행되면 지역 변수는 스택 메모리에 위치. 각 참조 변수가 가리키는 인스턴스는 힙메모리.
//             메서드의 명령 집합은 메서드 영역(코드 영역)에 위치. 메서드를 호출하면 메서드 영역의 주소를 참조하여 명령이 실행
//             따라서 인스턴스가 달라도 동일한 메서드가 호출됨.
//           - 가상 메서드의 원리 : 메서드를 호출한다는 것은 그 메서드의 명령 집합이 있는 메모리 위치를 참조하여 명령을 실행하는 것
//             가상 메서드의 경우에는 '가상 메서드 테이블'이 만들어 집니다. 가상 메서드 테이블은 각 메서드 이름과 실제 메모리
//             주소가 짝을 이루고 있음. 메서드가 호출되면 이 테이블에서 주소 값을 찾아서 해당 메서드의 명령을 수행함.

//        4. 다형성 : 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
//        1) 다형성 이란
//        2) 다형성의 장점

//        5. 다형성 활용하기
//        1) 상속은 언제 사용할까?
//           - IS-A(상속o) / HAS-A (상속x)

//        6. 다운 캐스팅과 instanceof
//           - 다운캐스팅 : 상위 클래스로 형 변환되었던 하위 클래스를 다시 원래 자료형으로 형 변환하는 것
//










//



    }

}



// 1-2)
class Customer{

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer() 생성자 호출");
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public  int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfor(){
        return customerName + " 님의 등급은 "+ customerGrade + "이며, 보너스 포인트는 " +
                bonusPoint + "입니다.";
    }

}


class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;

    public VIPCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호출");
    }

    public int getAgentID(){
        return agentID;
    }

}



/*

class VIPCustomer{
    private int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;

    private int agentID;
    double saleRatio;

    public VIPCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price *saleRatio);
    }

    public int getAgentID(){
        return agentID;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 "+ bonusPoint
                +"입니다.";
    }

}

*/
