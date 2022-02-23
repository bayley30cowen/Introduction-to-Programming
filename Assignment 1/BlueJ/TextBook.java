
/**
 * TextBook class 
 *
 * Bayley Cowen-Seagrove
 * 4.1.2 ver 1
 */
public class TextBook
{
    private String titleOfTextbook;
    private int numOfChapters;
    private int chaptersRead;
    
    public TextBook(String title, int num)
    {
        titleOfTextbook = title;
        numOfChapters = num;
        chaptersRead = 0;
    }
    
    public String getTitle()
    {
        return titleOfTextbook;
    }
    
    public void readNextChapter()
    {
        if ( isFinished() ) 
        {
            System.out.println("All Chapters have been read! The book has been finished!");
        }
        else 
        {
            chaptersRead++;
        }
    }
    
    public boolean isFinished()
    {
        return chaptersRead >=numOfChapters;
    }
    
    public void closeBook()
    {
        chaptersRead = 0;
    }
    
    public void describe()
    {
        System.out.println(titleOfTextbook + " with " + (numOfChapters - chaptersRead) + " chapters left.");
    }
}
