
/**
 * Libary Class
 *
 * Bayley Cowen-Seagrove
 * 4.1.2 ver 1
 */
public class Library
{
    // instance variables - replace the example below with your own
    private TextBook[] bookShelf;
    private int nextBook;
    private int numOfBorrowers;

    public Library(int maxTextbooks)
    {
        bookShelf = new TextBook[maxTextbooks];
        for (int x = 0; x < bookShelf.length; x++) 
        {
            String title = "text_" + x;
            bookShelf[x] = new TextBook(title,5);
        }
        nextBook = 0;
        numOfBorrowers = 0;
    }

    public LibraryCard issueCard()
    {
        LibraryCard aCard = new LibraryCard(numOfBorrowers, 5);
        numOfBorrowers++;
        return aCard;
    }
    
    public TextBook borrowBook(LibraryCard card)
    {
        TextBook book = null;
        if ( (nextBook < bookShelf.length) && !card.expired() )
        {
            book = bookShelf[ nextBook ];
            bookShelf[ nextBook ] = null;
            nextBook++;
            card.swipe();
        }
        return book;
    }
    
    public void returnBook(TextBook book)
    {
        bookShelf[ nextBook-1 ] = book;
        nextBook--;
    }
    
    public void describe()
    {
        System.out.print("The library has ");
        System.out.print((bookShelf.length-nextBook) + " books left on the shelf and ");
        System.out.println("has issued " + numOfBorrowers + " library cards.");
    }
}
