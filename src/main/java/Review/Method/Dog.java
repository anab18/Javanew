package Review.Method;

public class Dog {
    String name;
    String color;
    int age;
    double weight;
/*
When  erer you a planing to reuse a variabke in more than 2 method of you class create an instance variable for that
 */
   public Dog(String name,String color,int age,double weight){
       this.name=name;
       this.color=color;
       this.age=age;
       this.weight=weight;
   }
     void printInfo (){
         System.out.println(name+" "+color+" "+age+" "+weight);
     }//whever i am writing any logical in a method or loop or if cond and i temporarily need to store some data then we should create local variable
    //
    int sumarr(int[]arr){
       int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[1];

        }
        return sum;
    }
}
