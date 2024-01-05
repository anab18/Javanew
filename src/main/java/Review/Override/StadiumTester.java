package Review.Override;

public class StadiumTester {
    public static void main(String[] args) {

            Sports sport=new Sports("Soccer","Real Madrid");
            System.out.println(sport.type+" and team name is "+sport.teamName);
            System.out.println(sport.numberOfPlayers);

            Sports sport1= new Sports("Basketball","Chicago Bulls",15,"Chicago","Billy Donovan");
        }
    }