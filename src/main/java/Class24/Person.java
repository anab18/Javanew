package Class24;

public class Person {
    String name;
    String lastName;
    int age;
    double salary;
    public Person(String name,String lastName,int age,double salary){
this.name=name;
this.lastName=lastName;
this.age=age;
this.salary=salary;

    }
void printInfo(){
    System.out.println(name+" "+lastName+" "+age+" "+salary);
}
}
