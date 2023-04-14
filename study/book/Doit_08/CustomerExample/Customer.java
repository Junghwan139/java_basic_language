package study.book.Doit_08.CustomerExample;

// 1-2)
class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;


    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer() 생성자 호출"); // 상위 클래스 생성할 때 콘솔 출력문
        // Customer인스턴스가 생성되면 이 호출문이 출력될 것임.

    }


    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        System.out.println("Customer(int,String)생성자 호출");
    }

    public int calPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }


    public String showCustomerInfor() {
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " +
                bonusPoint + "입니다.";
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
}
