package AssignBook;

import java.util.ArrayList;

public class Book {
    int bookId;
    String bookName;
    String authorName;

    Book(int b,String bn,String au){
        this.bookId=b;
        this.bookName=bn;
        this.authorName=au;
    }

    @Override
    public String toString() {
        return "BookId :"+bookId+"\nBookName :"+bookName+"\nAuthorName :"+authorName;
    }
    //
}
