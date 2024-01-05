package Class15;
/*
Write a Teacher class   that have instance variables name and address. Create a constructor that will initialize those variables.
 Print name & address of given  Teacher using displayInfo method.
 */

public class Teacher {
    String name;
    String address;

    private int age;
    private double weight;

    public Teacher(String name, String address) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public Teacher(String name, String address, int age, double weight) {
        this(name,address,age);
        this.weight = weight;
    }

    public Teacher(String name, String address, int age) {
    }

    public void printInfo () {
            System.out.println(name + " " + address);
        }
    
        
    public static void main(String[] args) {
        Teacher t=new Teacher("Ana","12541 Powel ave,Lyons IL");
        t.printInfo();
    }
    }

