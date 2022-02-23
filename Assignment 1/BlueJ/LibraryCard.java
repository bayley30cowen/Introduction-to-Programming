
/**
 * Libary card class
 *
 * Bayley Cowen-Seagrove
 * 4.1.2 ver 1
 */
public class LibraryCard
{
    private int bookLimit;
    private int booksBorrowed;
    private String cardReference;

    public LibraryCard(int lim, int num)
    {
        bookLimit = lim;
        cardReference = "cardNum" + num;
        booksBorrowed = 0;
    }

    public void swipe()
    {
        booksBorrowed++;
    }
    
    public boolean expired()
    {
        return booksBorrowed >= bookLimit;
    }
    
    public String getCardRef()
    {
        return cardReference;
    }
    
    public void describe()
    {
        System.out.println("Libary card " + cardReference + " with " + (bookLimit - booksBorrowed) + " books left.");
    }
}
