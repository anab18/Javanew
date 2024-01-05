package HWNov27;
/*Create 2D array of countries: north america countries,
 south america countries, europe countries, asian countries, african countries.
  Then print all values from that array using 2 different loops and calculate
  how many total countries been stored.
 */
public class T2 {
    public static void main(String[] args) {
        String[][] countries={
            {"Canada","USA","Mexico"},
            {"Brazil","Columbia","Chile"},
                {"Italy","Germany","France"},
                {"India","China","Japan"},
                {"Algeria","Nigeria","Egypt"}};

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {

                System.out.print(countries[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        for (String[] n : countries) {
            for (String names : n) {
                System.out.print(names + " ");
            }
            System.out.println();
        }
    }
}

