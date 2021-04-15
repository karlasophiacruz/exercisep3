package Aula05;

public class Aula05 {
    public static void main(String[] args) {

        BankAccount p1 = new BankAccount();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.openAccount("CC");

        BankAccount p2 = new BankAccount();
        p2.setNumConta(2222);
        p2.setDono("Creusa");
        p2.openAccount("CP");

        p1.deposit(100.00);
        p2.deposit(200.00);

        p2.sac(100.00);
        p1.sac(10000.00);

        p1.estadoAtual();
        p2.estadoAtual();

    }
}
