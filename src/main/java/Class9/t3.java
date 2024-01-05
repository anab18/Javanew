package Class9;

public class t3 {
    public static void main(String[] args) {
        String[][] names={
                {"Ana","Vera","Tudor","Sasha"},
                {"A","B","A","B"}
        };

        for( int i=0;i<4; i++) {
            if(names[1][i].equals("A")||names[1][i].equals("B"))
            System.out.println(names[0][i]+" "+names[1][i]);
            }
        }
    }

