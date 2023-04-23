package BackEnd_Class.A_Java_Basic.completed;

public class C_6W_Cla10_ReCursiveCall {

    public static void main(String[] args) {

//        << 재귀함수 >>

//        1. 숫자 n이 있을때 1~n까지의 합계를 구하라
        int n = 10;
        int total = 0;
        // 1-1
        int total1 = sum(n);
        System.out.println(total1);

        //1-2
        sum1(n,total);

        


    }
    
    
    // 1-1
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    // 1-2
    public static void sum1(int n, int total) {
        total += n;
        if (n == 1) {
            System.out.println(total);
            return;
        }
        sum1(n-1,total);
    }

    
    
    
    
}
