package Class23;

import java.util.HashSet;

/*
Create a Set that will hold Objects of Student Type. In this set we do not care about the insertion order. Each student object should have name and studentID.
Display name of each student.
 */
public class T4 {
    public static void main(String[] args) {

        HashSet<Student> student=new HashSet<>();
        student.add(new Student("Engin","123"));
        student.add(new Student("Kat","456"));
        student.add(new Student("Masimo","789"));

        for (Student s:student){
            s.printInfo();
        }
    }
}