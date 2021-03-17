package br.ic.ufal.loop;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;
        int sum;

        System.out.println("Enter first int");
        n1 = input.nextInt();

        System.out.println("Enter second int");
        n2 = input.nextInt();

        sum = n1 + n2;

        System.out.printf("Sum is %d\n", sum);
    }
    
}
