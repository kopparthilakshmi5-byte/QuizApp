import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("===== JAVA QUIZ APP =====");

        // Question 1
        System.out.println("\n1. What is Java?");
        System.out.println("A. Programming Language");
        System.out.println("B. Operating System");
        System.out.println("C. Browser");
        System.out.println("D. Database");
        System.out.print("Your answer: ");
        char ans1 = sc.next().charAt(0);

        if (ans1 == 'A' || ans1 == 'a') {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which keyword is used to define a class in Java?");
        System.out.println("A. function");
        System.out.println("B. define");
        System.out.println("C. class");
        System.out.println("D. new");
        System.out.print("Your answer: ");
        char ans2 = sc.next().charAt(0);

        if (ans2 == 'C' || ans2 == 'c') {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which loop is used when number of iterations is known?");
        System.out.println("A. while");
        System.out.println("B. do-while");
        System.out.println("C. for");
        System.out.println("D. if");
        System.out.print("Your answer: ");
        char ans3 = sc.next().charAt(0);

        if (ans3 == 'C' || ans3 == 'c') {
            score++;
        }

        // Result
        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score: " + score + "/3");

        if (score == 3)
            System.out.println("Excellent!");
        else if (score == 2)
            System.out.println("Very Good!");
        else
            System.out.println("Needs Improvement!");

        sc.close();
    }
}
