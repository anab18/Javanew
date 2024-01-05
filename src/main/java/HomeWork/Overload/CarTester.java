package HomeWork.Overload;

public class CarTester {

        public static void main(String[] args) {
            Car n = new Car("Toyota", "Sienna", 2022);
            n.printInfo();
            n.calculate_rental_price(32.99,7);
            LuxuryCar lc=new LuxuryCar("BMW","X5",2020);
            lc.printInfo();
            lc.calculate_rental_price(55.99,7,32);
            EconomyCar Ec=new EconomyCar("Honda","Civic",2000);
            Ec.printInfo();
            Ec.calculate_rental_price(25.50,7,23);

        }
    }



