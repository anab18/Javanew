package Class16;

public class Teacher {

    String name;
    int age;
    char gender;
    int hourOfTeaching;
    void teach() {
        System.out.println("teacking");
    }
        void joke(){
            System.out.println("hahaha");
        }
}

class MathTeacher extends Teacher{
void math(){
    System.out.println("Teach math");
}
class ChemistTeacher extends Teacher{

 void Chemist   (){
     System.out.println("Teach chemist");
    }

}
class PianoTeacher extends Teacher {
    void piano() {
        System.out.println("Teach piano");
    }
}
}


