package study.bookdoit;

public class Stu11_Object {

    public static void main(String[] args) {

//        1.Object 클래스
//         1) toString() 메서드
        Book book1 = new Book(200, "개미");
        System.out.println(book1);
        System.out.println(book1.toString());


    }
}

// 1-1)
class Book {

    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle) {  // 책 번호와 제목을 매개변수로 입력받는 생성자
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

}