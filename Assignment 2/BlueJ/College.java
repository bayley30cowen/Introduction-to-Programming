import java.util.ArrayList;
import java.util.Random;
/**
 * The College Class represents a college object, where a list of students
 * will attend and a library object within the college. This is used so that
 * the student objects can attend a college.
 * 
 * @author Bayley Cowen-Seagrove
 * @version 4.1.2
 */
public class College
{
    private ArrayList<Student> array;
    private Library library;
    private Random random;
    private int numOfStudents;
    private int numOfTextBooks;

    /**
     * Constructor for objects of class College, used to initialize College
     * objects.
     * 
     * @param numberOfStudents integer to represent the number 
     * of students in the college.
     * @param numberOfTextbooks integer to represent the number of textbook 
     * in the college library
     * 
     */
    public College(int numberOfStudents, int numberOfTextbooks)
    {
        numOfStudents = numberOfStudents;
        numOfTextBooks = numberOfTextbooks;
        library = new Library(numOfTextBooks);
        array = new ArrayList<Student>(numOfStudents);
        for(int x = 0; x < numOfStudents; x++){
            Student student = new Student("Student" + x, library);
            array.add(student);
        }
        random = new Random();
    }
    /**
     * Describe method that represents the college in terms of number of 
     * students, number of textbooks available in the library.
     * 
     * @return String stating number of students and textbooks in college
     */
    public void describe()
    {
        System.out.println("The college has " + numOfStudents + 
            " hard-working students");
        System.out.println("The library has " + numOfTextBooks + 
            " books on the shelf.");
        
      
    }
    /**
     * nextStep method checks if the college has students and if this is true, 
     * chooses student from the list at random. If they have not finished 
     * their studies, then the method will call for the student to study() 
     * If the random student has finished their studies the method 
     * prints a statement saying they have graduated, and removes them from 
     * the list of students. If no students are present at the college, a 
     * string notifiying the user is printed.
     * 
     * @return String If there are no students at the college, the user is 
     * notified by the printed string, or if the student has finished 
     * their studies, the user will be notified that they have finished
     * their studies, so that they can be removed.
     * 
     */
    private void nextStep()
    {
        if(array == null){
            System.out.println("Everything has gone quiet");
        }
        else{
             int rand = random.nextInt(array.size());
             Student chosenStudent = array.get(rand);
             if(chosenStudent.finishedStudies()){
                 System.out.println("The student has graduated" +
                    "and left the college!");
                 array.remove(rand);
             }
             else{
                 chosenStudent.study();
             }
        }
    }
    /**
     * runCollege method takes input of number of steps from the user, 
     * then runs the describe and nextStep() methods that many times 
     * returning the currentStep to the user.
     * 
     * @param nSteps integer user input to specify the number of times 
     * method is run
     * 
     * @return String the currentStep.
     */
    public void runCollege(int nSteps)
    {
        for(int currentStep = 1; currentStep <= nSteps; currentStep++){
            System.out.println("Step " + currentStep);
            describe();
            nextStep();
        }
    }
    /**
     * Main method to allow class to be run from command line
     * 
     * @param args array of strings used to allow parameter values 
     * to be passed to the program
     */
    public static void main(String[] args)
    {
        int numberOfStudents = Integer.parseInt(args[0]);
        int numberOfTextbooks = Integer.parseInt(args[1]);
        int numberOfSteps = Integer.parseInt(args[2]);
        College college = new College(numberOfStudents, numberOfTextbooks);
        college.runCollege(numberOfSteps);
        
        
    }
}

