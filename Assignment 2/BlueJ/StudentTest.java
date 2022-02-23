

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentTest. Used to test the Student methods and 
 * constructor
 * 
 * @author  Bayley Cowen-Seagrove
 * @version 4.1.2
 */
public class StudentTest
{
    private Library library1;
    private Library library2;
    private Student student1;
    private Student student2;
    private Student student3;
    
    /**
     * Sets up the test fixture. Initialize 2 objects of student and 1 or
     * library.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        library1 = new Library(50);
        student1 = new Student("Jeff", library1);
        student2 = new Student("Max", library1);
    }  
    
    /**
     * Test the contructor method. Initialize 1 objects of library 
     * and 1 object of student
     */
    @Test
    public void ConstructorTest1()
    {
       Library library2 = new Library(50);
       Student student3 = new Student("Holly", library2);
    }
    
    /**
     * Tests the describe function to PASS. Needed to see the student's name
     * and whether they have a book
     *
     * Should PASS but return that student does not have a textbook
     * @return String which includes name of student, and that they have no
     * textbook
     */
    @Test
    public void DescribeTest1()
    {
        student1.describe();
    }
    
    /**
     * Tests the describe function to PASS. Needed to see the student's name
     * and whether they have a book
     *
     * Should PASS and return that student does have a textbook
     * @return String which includes name of student, and that they have a
     * textbook
     */
    @Test
    public void DescribeTest2()
    {
        student2.study();
        student2.describe();
    }
    
    /**
     * Tests the study function to PASS. Needed to see that a student 
     * previously without a book is given a book
     *
     * Should PASS
     * @return String which includes name of student, and that they dont 
     * have a textbook, follwed by them having a textbook.
     * 
     */
    @Test
    public void StudyTest1()
    {
        student1.describe();
        student1.study();
        student1.describe();
    }
    
    /**
     * Tests the study function to PASS. Needed to see that a student 
     * previously with a book is able to study and work through a book
     *
     * Should PASS
     * @return String which includes name of student, and that they have
     * progressed through the book.
     * 
     */
    @Test
    public void StudyTest2()
    {
        student1.study();
        student1.describe();
    }
    
     /**
     * Tests the study function to PASS. Needed to see that a student 
     * who has finished a book has been recognsied.
     *
     * Should PASS
     * @return String which includes name of student, and the loop of them
     * studying through a book. Once the book is completed, a string tells 
     * the user that the student has finished the book, and no longer has a
     * book, until they begin studying again.
     * 
     */
    @Test
    public void StudyTest3()
    {
        for(int x = 1; x <= 31; x++){
            student1.study();
            student1.describe();
           
        }
    }

}
