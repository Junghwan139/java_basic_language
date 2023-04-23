package ByMyself.A_Java_Book.Doit_08.CustomerExample;

public class CustomerTest2 {

    public static void main(String[] args) {

        VIPCustomer customerKim = new VIPCustomer(10020,"김유신",1111);
//        customerKim.setCustomerID(10020);
//        customerKim.setCustomerName("김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfor());


    }

}
