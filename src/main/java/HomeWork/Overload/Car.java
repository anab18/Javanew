package HomeWork.Overload;
/*
1)Create a class Car with properties like make, model, and year.
Implement a method calculate_rental_price based on the number of rental days.
Create two subclasses: LuxuryCar and EconomyCar. Override the calculate_rental_price method in LuxuryCar to
include additional charges.Demonstrate the functionality by creating instances of each class and calling their methods
2)Online Shopping Cart:
 */
public class Car {
    String make;
    String model;
    int year;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;}
public void printInfo(){
    System.out.println(make+","+model+","+year);}
public void calculate_rental_price(double priceRent, int day) {
        double RentPrice = priceRent * day;
        System.out.println("Rent Price $"+ RentPrice+ " for " +day+" days");}}
     class LuxuryCar extends Car {
        public LuxuryCar(String make, String model, int year) {super(make, model, year);}
        public void calculate_rental_price(double RentPrice,int day,int addCharges) {
            double TotalRent=(RentPrice*day)+addCharges;
            System.out.println("Luxury car rent price for "+day+" days includes additional charges.Total cost $" + TotalRent);}}
    class EconomyCar extends Car {
        EconomyCar(String make, String model, int year){
            super(make, model, year);}
        public void calculate_rental_price(double RentPrice,int day,int addCharges) {
            double TotalRent=(RentPrice*day)+addCharges;
            System.out.println("Economy car rent price for "+day+" days includes additional charges.Total cost $" + TotalRent);}}


