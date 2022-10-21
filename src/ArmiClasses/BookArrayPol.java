package ArmiClasses;

public class BookArrayPol {
    public void printAuthor(BookArrayList bb) {
        String bkname = bb.getBookName();
        int isBn = bb.getIsbn();
         System.out.println(bkname+ "..... " + isBn);
    }

    public static void main (String[] args) {
        BookArrayPol bookpol = new BookArrayPol();
        BookArrayList booklist = new BookArrayList();
        booklist.setBookName("This is A book test Harry Potter");
        booklist.setIsbn(5555);

        bookpol.printAuthor(booklist);

    }
}
