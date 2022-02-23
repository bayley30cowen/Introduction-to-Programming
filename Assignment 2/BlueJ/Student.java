
/**
 * The Student Class represents a student object, where the student will 
 * be able to take out textbooks, study and return books.The student object 
 * will attend a college, and will interact with textbooks, library cards 
 * and the library.
 * 
 * @author Bayley Cowen-Seagrove
 * @version 4.1.2
 */
public class Student
{
    private String studName;
    private Library collegeLibrary;
    private LibraryCard libraryCard;
    private TextBook textBook;
    
    /**
     * Constructor for objects of class Student, used to initialize College
     * objects.
     * 
     * @param name String to represent the name of the student
     * @param library String to represent the library the student is 
     * attending
     */
    public Student(String name, Library library)
    {
        studName = name;
        collegeLibrary = library;
        libraryCard = collegeLibrary.issueCard();
        textBook = null;
    }

    /**
     * finishedStudies method that checks if the students library card is 
     * active (not expired), and if so, will check if the student has 
     * finished studying i.e. has no textbook.
     * 
     * @return Boolean Will return a true if the student has finished 
     * studying, or false ifthey haven't.
     */
    public boolean finishedStudies()
    {
        if(libraryCard.expired()){
            if(textBook == null){
                return true;
            }
        }
        return false;
    }
    /**
     * Study method checks if student has a textbook and if it is finished
     * if they dont have a textbook, makes the student borrow one from the 
     * library, if they have a textbook and it is not finished, makes the 
     * student read the next chapter of the textbook
     * if they have a textbook and it is finished, 
     * makes the student close the book and return it to the library, 
     * then borrow a new book
     */
    public void study()
    {
        if(textBook == null){
            textBook = collegeLibrary.borrowBook(libraryCard);
            
        }
        else{
            if(textBook.isFinished()){
                collegeLibrary.returnBook(textBook);
                textBook.closeBook();
                textBook = collegeLibrary.borrowBook(libraryCard);
            }
            else{
                textBook.readNextChapter();
            }
        }
    }
    /**
     * Describe method that represents the student in terms of their name, 
     * and whether they have a book.
     * 
     * @return String stating the students name and whether they have a book 
     * currently being borrowed
     */
     
    public void describe()
    {
        if(textBook == null){
            System.out.println("Student " + studName + 
                " does not have a book and ");
            libraryCard.describe();
        }
        else{
            System.out.println("Student " + studName + " has a book ");
            textBook.describe();
        }
    }
}
