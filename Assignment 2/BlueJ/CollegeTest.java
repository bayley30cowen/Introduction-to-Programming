

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CollegeTest. Used to test the college methods and 
 * constructor
 *
 * @author  Bayley Cowen-Seagrove
 * @version 4.1.2
 */
public class CollegeTest
{
    private College college1;
    private College college2;
    private College college3;

    /**
     * Sets up the test fixture. Initialize 1 object of college
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        college1 = new College(20, 20);
    }
    /**
     * Test the contructor method. Initialize 2 objects of college
     */
    @Test
    public void ConstructorTest1()
    {
        College college2 = new College(0, 0);
        College college3 = new College(2, 2);
    }
    /**
     * Tests the describe function to PASS. Needed to see the no. of students
     * and no. of books
     *
     * Should PASS and describe the college 1 object i.e. (20, 20)
     * @return String which includes no. of students and no. of books.
     */
    @Test
    public void DescribeTest()
    {
        college1.describe();
    }
    /**
     * Tests the runCollege function to PASS. Needed to ensure that the input
     * of steps is taken in
     *
     * Should PASS and print 5 steps.
     * @return String 5 Steps each followed by describe function and next 
     * step
     */
    @Test
    public void runCollege1()
    {
        college1.runCollege(5);
    }
    /**
     * Tests the runCollege function to FAIL. Needed to ensure that the input
     * of steps is taken in and that is recognised as invalid
     *
     * Should FAIL and return an error
     * @return error, as college 2 has 0 students and 0 books, which is
     * invalid for the nextStep function.
     */
    @Test
    public void runCollege2()
    {
        college2.runCollege(5);
    }
     /**
     * Tests the runCollege function to FAIL. Needed to ensure that the input
     * of steps is taken in and that is recognised as invalid
     *
     * Should FAIL and return an error
     * @return error, as number of steps taken is less than 1, which is an
     * invalid input
     */
    @Test
    public void runCollege3()
    {
        college3.runCollege(0);
    }
    
    
}
