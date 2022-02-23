
/**
 * The Libary Class represents a library object, where textbooks will be 
 * stored for students to borrow. This is used so that students can borrow 
 * textbooks and return books.
 *
 * @author Bayley Cowen-Seagrove
 * @version 4.1.2
 */
public class Library
{
    private TextBook[] bookShelf;
    private int nextBook;
    private int borrowers;
    
    /**
     * Constructor for objects of class Library, used to initialize Library
     * objects.
     * 
     * @param numOfBooks Integer used to represent the number of books in
     * the college library.
     */
    public Library(int numOfBooks)
    {
        bookShelf = new TextBook[numOfBooks];
        for (int i = 0; i < bookShelf.length; i++ ) {
            String title = "text_" + i;
            bookShelf[i] = new TextBook(title,5);
        }
        nextBook = 0;
        borrowers = 0;
    }
    /**
     * issueCard method that returns a library card object, that issues a 
     * new card. This isneeded as students need a library card to borrow 
     * books.
     * 
     * @return aCard LibraryCard new library card for student.
     */
    public LibraryCard issueCard()
    {
        LibraryCard aCard = new LibraryCard(borrowers, 5);
        borrowers++;
        return aCard;
    }
    /**
     * borrowBook method that returns a textbook object, that allows for a 
     * textbook to be borrowed. The method checks that the student's card is 
     * active (not expired) and that the shelf is not empty. If these are 
     * true, the student can borrow the book.
     * 
     * @param card LibraryCard This is needed as students need a library 
     * card to borrow books.
     * @return book Textbook the book being borrowed.
     */
    public TextBook borrowBook(LibraryCard card)
    {
        TextBook book = null;
        if ( (nextBook < bookShelf.length)  && !card.expired() ) {
            book = bookShelf[ nextBook ];
            bookShelf[ nextBook ] = null;
            nextBook++;
            card.swipe();
        }
        return book;
    }  
    /**
     * returnBook method that returns a textbook object, that allows for a 
     * textbookto be returned to the shelf. 
     * 
     * @param book TextBook The book being returned to the shelf
     */
    public void returnBook(TextBook book)
    {
        bookShelf[ nextBook-1 ] = book;
        nextBook--;
    }
    /**
     * Describe method that represents the library in terms of number of 
     * books on the shelf, and number of library cards issued.
     * 
     * @return String stating number of books on the shelf and library cards 
     * issued.
     */
    public void describe()
    {
        System.out.print("The library has ");
        System.out.print((bookShelf.length-nextBook) + 
            " books on the shelf, and ");
        System.out.println("has issued " + borrowers + " cards.");
    }
        
}