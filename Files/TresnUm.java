import java.util.Scanner;
import java.io.*;

public class TresnUm {

    public static int sequency(int number){
        if(number % 2 == 0){
            number = number / 2;
        }
        else{
            number = 3 * number + 1;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1; int n2;
        int a; int b; int k;

        while (input.hasNext()){
            n1 = input.nextInt();
            n2 = input.nextInt();

            int maior = 0;

            if(n1 > n2){
                a = n2; b = n1;
            }
            else{
                a = n1; b = n2;
            }

            for(k = a ; k <= b ; k++){
                int aux = k; int cont = 0;
                    
                while(aux != 1){
                    aux = sequency(aux);
                    cont++;
                }
                
                if(cont >= maior){
                    maior = cont + 1;
                }
            }
            System.out.printf("%d %d %d\n", n1, n2, maior);
        }
    }
}
