package classforjava.typing.Thread;

public class MainClass {

    static int total = 100;

    public static void main(String[] args) {

        // main 스레드는 단일 스레드
//        for(int i = 0;i<100; i++){
//            System.out.println(total);
//            total -=1;
//
//        }

        // th1 이라는 쓰레드 생성
        Thread th1 = new Thread((() -> {
            total -=1;
            System.out.println(total);
        }));

/*

        // th2 이라는 쓰레드 생성
        Thread th2 = new Thread((new Runnable() {
            @Override
            public void run() {
                total -=1;
                System.out.println(total);
            }
        }));

*/



    }

}
