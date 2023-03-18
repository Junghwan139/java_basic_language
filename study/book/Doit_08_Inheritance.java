package study.book;

public class Doit_08_Inheritance {

    public static void main(String[] args) {

//        1. 상속이란?
//        1) 클래스의 상속 : class B extends A {  } → B클래스가 A클래스를 상속 받는다
//        2) 상속을 사용하여 고객 관리 프록램 구현하기
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