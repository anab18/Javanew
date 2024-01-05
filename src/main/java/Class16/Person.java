package Class16;

public class Person {
    String Name;
    int age;
    double weight;
    void printInfo(){
        System.out.println(Name+" "+age+" "+weight);
    }

}
class Student extends Person{
char grade;
void study(){

}
}
class StudentTester{
    public static void main(String[] args) {
        Student s=new Student();
        s.age=12;
    }
}
