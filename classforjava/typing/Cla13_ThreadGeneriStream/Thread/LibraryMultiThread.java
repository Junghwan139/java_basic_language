package classforjava.typing.Cla13_ThreadGeneriStream.Thread;

public class LibraryMultiThread implements Runnable {
    static int book_total = 100;

    @Override
    public void run() {
        borrowBooks();
    }

    public synchronized static void borrowBooks(){

        if(book_total <= 0){
            return;
        }

        System.out.println("대출완료");
        book_total -=1;
        System.out.println("현재 남아 있는 책수량 " + book_total);

    }

}
