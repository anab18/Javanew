package Class16;
/*
Write a Java program called Teacher.
Identify features and 4 behaviour of that Class. Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher .
Test all 4 classes
 */

public class TeacherTester {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.joke();
        MathTeacher mt=new MathTeacher();
        mt.hourOfTeaching=15;
        mt.teach();
    }
}
