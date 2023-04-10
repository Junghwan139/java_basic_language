package study.book.Doit_08.CustomerExample;

class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer() {

        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호출");
    }

    public int getAgentID() {
        return agentID;
    }

}
