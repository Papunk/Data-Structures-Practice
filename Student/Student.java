package Student;

public interface Student {

    /**
     *
     * @return student's full name
     */
    String getName();

    /**
     *
     * @return student ID
     */
    int getID();

    /**
     *
     * @return student's average grade as a number between 0 and 100
     */
    int getAvgGrade();

    /**
     *
     * @return a list with the names of the student's classes
     */
    String[] getClasses();

}
