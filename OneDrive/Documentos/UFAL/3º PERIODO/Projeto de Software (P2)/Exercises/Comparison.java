import java.util.Scanner;

public class Comparison {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;
        int sum;

        System.out.println("Enter the first integer: ");
        n1 = input.nextInt();

        System.out.println("Enter the first integer: ");
        n1 = input.nextInt();

        if(n1 == n2){
            System.out.printf("são iguais");
        }
        
        System.out.println(n1 == 3 ? "Valor correto" : "Valor errado");
    }
    
}
