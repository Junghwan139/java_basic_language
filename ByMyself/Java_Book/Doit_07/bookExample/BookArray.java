package ByMyself.Java_Book.Doit_07.bookExample;

public class BookArray {

    public static void main(String[] args) {
        Book[] libary = new Book[5];

       libary[0] = new Book("태백산맥", "조정래");

        System.out.println(libary[0].getAuthor()+libary[0].getBookName());

    }


}
