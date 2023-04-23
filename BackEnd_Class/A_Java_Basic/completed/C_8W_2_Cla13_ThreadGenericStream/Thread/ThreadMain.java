package BackEnd_Class.A_Java_Basic.completed.C_8W_2_Cla13_ThreadGenericStream.Thread;

public class ThreadMain {

    static int total = 100;
    static int thread_total = 100;


    public static void main(String[] args) throws InterruptedException {

//        1. 스레드 : 멀티 상황
//           프로세스 내에서 실제로 작업을 수행하는 주체를 의미한다. 모든 프로세스에는 한 개 이상의 스레드가 존재
//        1) 특징 : 멀티스레드는 ★★비동기적으로 동장 → 하나의 스레드가 작업을 할 때 다른 스레드가 별도의 작업을 할 수 있다(순서가 없음)
//        2) 생성방법 : Runnable(인터페이스), Thread 상속
//           (1) Runnable

        // ver1. Runnable을 구현한 클래스를 사용하여 선언
        Thread th1 = new Thread(new ThreadWithClassRunnable());
        th1.start();


        // ver2.
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("first Thread");
            }
        });
        th2.start();

        // ver3.
        Thread th2_1 = new Thread(() -> {
            System.out.println("Runnable with modify");
            System.out.println("Runnable with modify_2");
        });

        th2_1.start();

        // ver4.
        new Thread(() -> {
            System.out.println("Runnable with modify_3");
            System.out.println("Runnable with modify_4");
        }).start();


//        (2) Thread 상속
        Thread th3 = new ThreadWithClassThread();
        th3.start();


//        << Thread사용 예제>>

/*

        기본 사용
        for(int i = 0;i<1000; i++){
            if(total<=0){
                break;
            }

            System.out.println("대출완료");
            total -=1;
            System.out.println("현재 남은 책 수량은 : "+total);

        }

*/

        for(int i = 0;i<1000; i++){

            if(thread_total<=0){
                break;
            }

            Thread th = new Thread(() -> {
                System.out.println("대출완료");
                thread_total -=1;
                System.out.println("현재 책의 수량은 : "+thread_total);
            });
            th.start();
            th.join();

        }

        System.out.println("최종 남은 책의 수량은 : " +thread_total);

        // StringBuffer : Thread safe(syncronized, join)
        // StringBuilder : 성능이 더 좋다. Thread Safe하지 않다.























    }


}
