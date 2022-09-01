import java.util.Scanner;

/*
 * Завдання 2. Наступне та попереднє
 * Напишіть програму, яка зчитує ціле число та виводить текст, аналогічний наведеному у прикладі.
 */
public class Practice2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int next = number + 1;
        int prev = number - 1;
        System.out.printf("The next number for the number %d is %d.%n", number, next);
        System.out.printf("The previous number for the number %d is %d.%n", number, prev);
    }
}