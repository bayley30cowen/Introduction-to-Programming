 
/**
 * The Textbook Class represents a textbook object, where textbooks will have 
 * a set number of chapters, that the students can read. This is needed for
 * when the student studies.
 *
 * Bayley Cowen-Seagrove
 * 4.1.2 ver 1
 */
public class TextBook
{
    
    private String title;
    private int nChapters;
    private int chaptersRead;
    /**
     * Constructor for objects of class Textbook, used to initialize Textbook
     * objects. Sets the title, number of chapters for a textbook, and sets
     * the chapters read to 0.
     * 
     * @param t String Title of the textbook
     * @param n Integer to represent the number of chapter
     */
    public TextBook(String t, int n)
    {
        title = t;
        nChapters = n;
        chaptersRead = 0;
    }
    /**
     * getTitle method gets the title of a textbook. This is useful as it is
     * needed in the describe method.
     * 
     * @return title String which is the title of the textbook.
     */
    public String getTitle() 
    {
        return title;
    }
    /**
     * readNextChapter checks whether the textbook is finished, else 
     * increments the number of chapters read by 1. This is used by students
     * when studying to enable them to work through a textbook.
     * 
     * 
     * @return String User is notified that if all chapters have been read
     * that the textbook is finished.
     */
    public void readNextChapter() 
    {
        if ( isFinished() ) {
            System.out.println("No more chapters to read!" + 
                "The book is finished!");
        } 
        else {
            chaptersRead++;
        }
    }   
    /**
     * isFinished method checks whether the student has read all of the 
     * chapters. This is used to check whether the student should keep 
     * reading in readNextChapter.
     * 
     * @return Boolean Returns true if all chapters have been read, else 
     * returns false
     */
    public boolean isFinished()
    {
        return chaptersRead >= nChapters;
    }
    /**
     * closeBook method sets the chaptersRead back to 0. This means that the
     * book has been read, and can be returned.
     * 
     * 
     */
    public void closeBook()
    {
        chaptersRead = 0;
    }     
    /**
     * Describe method that represents the textbook in terms of its title, 
     * with the number of chapter left to be read. This is helpful to see
     * how much a textbook has left before being finished.
     * 
     * @return String stating the textbooks title and the number of remaining
     * chapters to read.
     */
    public void describe()
    {
        System.out.println(title + " with " + (nChapters - chaptersRead) + 
            " chapters left.");
    }
        
}

