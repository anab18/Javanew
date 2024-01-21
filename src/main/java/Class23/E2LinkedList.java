package Class23;

import java.util.LinkedList;

public class E2LinkedList {
    public static void main(String[] args) {
        //String is the name of the class.
        LinkedList<String> s=new LinkedList<>();
        s.add("kit");
        s.add("nam");
        s.add("kor");
        s.add("kim");
        s.add("rar");
        s.remove("rar");
        System.out.println(s);
        System.out.println(s.size());
    }
    }

