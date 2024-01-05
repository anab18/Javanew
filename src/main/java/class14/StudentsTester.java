package class14;
/*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
 */

import static class14.Students.numberOfStudents;

public class StudentsTester {
    public static void main(String[] args) {


        Students s1 = new Students();
       s1.student1="Maria";
       s1.ID=12535;
       numberOfStudents++;

       Students s2=new Students();
       s2.student1="Valeria";
       s2.ID=25588;
       numberOfStudents++;

       Students s3=new Students();
       s3.student1="Tudor";
       s3.ID=25122;
       numberOfStudents++;

        System.out.println("number students is "+numberOfStudents);


    }
}
