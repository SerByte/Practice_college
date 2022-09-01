import java.util.Scanner;

/*
 * Завдання 3.
 * Поділ яблук - 1
 * N школярів ділять K яблук порівну, залишок, що не ділиться, залишається в кошику.
 * Скільки яблук дістанеться кожному школяреві?
 */

public class Practice3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scn.nextInt();
        System.out.print("Enter number of apples: ");
        int apples = scn.nextInt();
        int method = apples / students;
        System.out.println("Every student will get: " + method);
    }
}