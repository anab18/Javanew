package Review.polimorphisam;

public class PolyTester {
    public static void main(String[] args) {
        Dog D=new Dog("pufic","red",1,"German");
        Cat C=new Cat("Crystal","grey",1);
        Animal[] animals={D,C};
        for(Animal n:animals){
            n.eat();
            n.speak();
            n.printInfo();
            System.out.println(n.getName());
            /*if(n instanceof Dog){
                Dog D2=(Dog)n;
                D2.run();*/

        }
        Animal n=animals[0];
        //((Dog)a).run();
        Dog D2=(Dog)n;
        D2.run();
    }
}
