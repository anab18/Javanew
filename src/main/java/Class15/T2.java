package Class15;

public class T2 {
    String name;
    double s1Marks;
    double s2Marks;
    double s3Marks;

    T2(String sName, double m1, double m2, double m3) {
        name = sName;
        s1Marks = m1;
        s2Marks = m2;
        s3Marks = m3;

    }

    public void calculate() {
        double avg = (s1Marks + s2Marks + s3Marks) / 3;
        System.out.println(name + "s Avg Marks are " + avg);
    }
}
