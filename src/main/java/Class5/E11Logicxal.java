package Class5;

import java.util.Scanner;

public class E11Logicxal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double quizMarks, midMarks, finalMarks, avgMarks;
        char grade;
        System.out.println("Please enter the mark for quiz0-100");
        quizMarks = sc.nextDouble();
        System.out.println("Please enter the mark for quiz0-100");
        midMarks = sc.nextDouble();
        System.out.println("Please enter the mark for quiz0-100");
        finalMarks = sc.nextDouble();
        avgMarks = (quizMarks + midMarks + finalMarks) / 3;

        if(avgMarks>=90){
grade='A';
        }else if (avgMarks>=70){
            grade='B';
        } else if (avgMarks >= 50) {
            grade='C';
        }else {
            grade = 'F';
        }
            System.out.println(grade);
        }
    }
