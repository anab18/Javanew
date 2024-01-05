package Class4;

public class E2NestIfConditions {
    public static void main(String[] args) {
        double budget=50000;
        String engineType="Hybrid" ;
        if(budget>=50000){
            if(engineType.equals("Electric")){
                System.out.println("I want to buy a tesla");

            } else if (engineType.equals("Hybrid")){
                System.out.println("I want to buy a Toyota");
            }else {
                System.out.println("I want a buy a Porche");
            }
            }else if(budget>=30000){
                if(engineType.equals("Electric")){
                    System.out.println("I want to buy byd");
                }else if(engineType.equals("Hybrid")){
                    System.out.println("I want to buy Camry");
                }else{
                    System.out.println("Hyundai Sonata");
                }
            }else if (budget>=20000) {
            if (engineType.equals("Electric")) {
                System.out.println("I want to buy byd");

            } else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy Camry");
            } else {
                System.out.println("hyundi senata");
            }
        }else if(budget>=20000){
            if(engineType.equals("Electronic")){
                System.out.println("nissan leaf");
            }else if(engineType.equals("Hybrid")){
                System.out.println("Kia");
            }else{
                System.out.println("Hounda civic");
            }
        }else{
            System.out.println("Lets save more");
        }
        }

    }

