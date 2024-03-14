package AssignBook;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {


//    Book obj = ;
//    Book obj1 = ;
        //its not a mistake both way are correct !!

    ArrayList<Book> bookList = new ArrayList<Book>();
    bookList.add(new Book(1,"Ugly Love","Colleen Hover"));
    bookList.add(new Book(1,"Its End with Us","Colleen Hover"));

    for(Book books : bookList){
        System.out.println(books);
    }


    }
}
