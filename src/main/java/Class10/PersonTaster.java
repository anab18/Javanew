package Class10;

public class PersonTaster {
    public static void main(String[] args) {
        Person person=new Person();
        person.name="Ana";
        person.gender='F';
        person.rasa="White";
        person.age=25;
        System.out.println(person.name);
        System.out.println(person.gender);
        System.out.println(person.rasa);
        System.out.println(person.age);
        person.language();
        person.work();

    }

}
