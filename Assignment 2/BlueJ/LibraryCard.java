
/**
 * The Library Card Class represents a library card object, where a 
 * library card will have an id number and maximum number of borrows. This 
 * object is needed to enable a student to borrow a textbook.
 *
 * Bayley Cowen-Seagrove
 * 4.1.2 ver 1
 */
public class LibraryCard
{
    private int limit;
    private int booksBorrowed;
    private String cardRef;
    /**
     * Constructor for objects of class LibraryCard, used to initialize 
     * Library card objects. This sets the limit on borrows, and gives
     * the card an id number. Also sets the number of books borrowed to 0
     * as the card will be brand new.
     * 
     * @param idNum Integer id number of the library card.
     * @param maxNum Integer Limit on the number of borrows the card can do
     * before expire.
     */
    public LibraryCard(int idNum, int maxNum)
    {
        limit = maxNum;
        cardRef = "cardNum" + idNum; 
        booksBorrowed = 0;
    }
    /**
     * swipe method increases the number of books borrowed by the student. 
     * This is needed to calculate when the card would expire, i.e. when
     * the limit is reached.
     */
    public void swipe()
    {
        booksBorrowed++;
    }
     /**
     * expired method checks whether the card has expired by comparing the
     * limit on the card, to the number of books borrowed on that card. 
     * 
     * @return Boolean If the limit has been reached, the card has expired
     * so will return True, else will return false.
     */
    public boolean expired()
    {
        return booksBorrowed >= limit;
    }
    /**
     * getCardRef method gets the card reference number. This is needed in 
     * the describe method.
     * 
     * @return String the card reference number which is initailized in the 
     * constructor.
     */  
    public String getCardRef() 
    {
        return cardRef;
    }      
    /**
     * Describe method that represents the library card in terms of its 
     * card refernce, and the remaining borrowing allowance. This is helpful
     * as the students can check how many borrows they have remaining
     * on their card.
     * 
     * @return String stating the library cards reference number and the
     * remaining borrowd
     */
    public void describe() 
    {
        System.out.println( "Library card " + cardRef + 
               " has an allowace of " + (limit-booksBorrowed) + " books. " );
    }
    
}
