package study.book.Doit_08.CustomerExample;

// 1-2)
class Customer {

    private int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }


    public String showCustomerInfor() {
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " +
                bonusPoint + "입니다.";
    }

}
