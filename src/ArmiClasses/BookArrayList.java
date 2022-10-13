package ArmiClasses;

import java.util.ArrayList;

public class BookArrayList {
    private String bookName;
    private  int isbn;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public int getIsbn() {
        return isbn;
    }
}

class BookArrayListTest {
    public static void main (String[] args) {
        ArrayList<BookArrayList> myBookList = new ArrayList<BookArrayList>();
        BookArrayList a = new BookArrayList();
        myBookList.add(a);
        a.setBookName("A good book");
        a.setIsbn(1234);
        BookArrayList b = new BookArrayList();
        myBookList.add(b);
        b.setBookName("A bad book");
        //String result = a.getBookName();
        for (BookArrayList slist : myBookList){
            System.out.println(myBookList.indexOf(slist));
            System.out.println(slist.getBookName());

        }
    }
}
