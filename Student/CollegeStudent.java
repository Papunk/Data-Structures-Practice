package Student;

import java.util.ArrayList;
import java.util.Hashtable;

public class CollegeStudent implements Student {
    //TODO enforce proper data entry in constructors

    private static int numberOfStudents = 1;
    private static Hashtable<Character, ArrayList<Student>> students = new Hashtable<>();

    private final String name;
    private final int ID;
    private int grade;
    private String[] classes;


    public CollegeStudent(String name, int ID, int grade, String[] classes) {
        this(name, ID);
        this.grade = grade;
        this.classes = classes;
    }

    public CollegeStudent(String name, int ID) {
        this.name = name;
        this.ID = ID;
        enroll();
    }

    public CollegeStudent(String name) {
        this.name = name;
        this.ID = generateID(name, 256);
        enroll();
    }


    @Override
    public String getName() {
        return name;
    }

    private int generateID(String name, int seed) {
        int ID = (name.length() + 1) * (numberOfStudents + 1) * seed;
        for (ArrayList<Student> l: students.values()) {
            for (Student s: l) {
                if (ID == s.getID()) ID = generateID(name, seed + 1);
            }
        }
        return ID;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public int getAvgGrade() {
        return grade;
    }

    @Override
    public String[] getClasses() {
        return classes;
    }


    private void enroll() {
        Character firstLetter = this.name.charAt(0);
        if (!students.containsKey(firstLetter)) {
            students.put(firstLetter, new ArrayList<Student>());
        }
        students.get(firstLetter).add(this);

        numberOfStudents++;
    }
}
