package classforjava.typing.Cla13_ThreadGeneriStream.Thread;

public class MainClass {

    static int total = 100;

    public static void main(String[] args) throws InterruptedException {

//        << 스레드 공부 >>
//        스레드란 프로세스 내에서 실제로 작업을 수행하는 주체를 위미
//        모든 프로세스에는 한 개 이상의 스레드가 존재
//        멀티스레드는 비동기적으로 동작 : 하나의 스레드가 작업을 할 때 다른 스레드가 별도의 작업을 할 수 있는(순서가 없음)
//          - 스레드 생성 : Runnable 인터페이스 구현한 객체, Thread 클래스 객체
//        멀티스레드 문맥교환 발생

//        thread 생성 방법 2가지
//        1. Runnable 구현방식

/*

        Thread th1 = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("First Thread");
            }
        });
        th1.start();


        // 2. Thread 상속방식
        Thread th2 = new ThreadwithClass();
        th2.start();

        // ★Runnable을 화살표 방식으로
        Thread th3 = new Thread(() -> {
            System.out.println("third thread");
            System.out.println("thrid_2");
        }
        );
        th3.start();

        new Thread(() -> System.out.println("fourth thread")).start();

        // 스레드 실행 순서 보장이 안됨.

*/

/*

        //동기적 도서 대출 방식

        for(int i =0; i<1000; i++){

            if(total <=0){
                break;
            }
            System.out.println("대출완료");
            total -=1;
            System.out.println("현재 남아 있는 책수량 " + total);
        }
        System.out.println("최종적으로 남아 있는 책 수량 " +total);

*/

        // 비동기적 도서 대출 방식(멀티쓰레드 방식), 성능은 비동기적 실행이 우세하다
/*

        for(int i =0; i<1000; i++){

            if(total <=0){
                break;
            }

            new Thread( () -> {

                System.out.println("대출완료");
                total -=1;
                System.out.println("현재 남아 있는 책수량 " + total);

            } ).start();

        }

        System.out.println("최종적으로 남아 있는 책 수량 " +total);

*/

        // 비동기적 도서대출 방식 (멀리티스레드 방식) - 별도의 클래스로 구현
        // 멀티스레드 상황에서 동기적 코딩을 하는 방법 : join, syncronized
        for(int i =0; i<1000; i++){

//            if(LibraryMultiThread.book_total <=0){
//                break;
//            }

           Thread th = new Thread(new LibraryMultiThread());
           th.start();
//           th.join();   // 방법1.join

        }

        System.out.println("최종적으로 남아 있는 책 수량 " +LibraryMultiThread.book_total);


//        제넬릭 <> 왜 <>을 사용하는가 자유도를 높이기 위해서




    }

}
