package ReviewClass1;

import java.sql.SQLOutput;

public class E3StringConcat {
    public static void main(String[] args) {
        String houseNo=" H#12541";
        String streetNoo=" Abs13";
        String state=" New York";
        String country=" USA";
        String space=" ";
        String completAdress=houseNo+space+streetNoo+space+state+space+country;
        System.out.println(houseNo+streetNoo+state+country);


    }
}
