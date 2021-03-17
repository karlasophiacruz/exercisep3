import java.util.Scanner;

public class AbaixoaPoluicao {
    public static void main(String[] args) {

        int n1;
        float multa = 0;
        int casas = 0;

        System.out.println("Enter the number of cars:");
        n1 = input.nextInt();

        while (n1 != 999){
            if (n1 > 2){
                multa += 12.89 * (n1 - 2);
                casas += 1;
            }
            System.out.println("Enter the number of cars:");
            n1 = input.nextInt();
        }

        System.out.printf("%.2f\n%d", multa, casas);
    }
}
