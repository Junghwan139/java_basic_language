package study.book.Doit_08.CustomerExample;

class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    /*

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호생");

    }

    */

    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID,customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.01;
        this.agentID = agentID;
        System.out.println("VIPCustomer(int, String) 생성자 호출");


    }


    public int getAgentID()
    {
        return agentID;
    }

}
