package Aula07;

public class Aula07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty", "França", 31, 1.75, 68.9, 11, 2, 1);
        l[1] = new Lutador("Paulo", "Brasil", 30, 1.74, 68.5, 12, 4, 0);
        l[2] = new Lutador("Pedro", "EUA", 20, 1.80, 80.9, 10, 8, 5);
        l[3] = new Lutador("Mane", "Espanha", 25, 1.76, 81.6, 10, 5, 4);
        l[4] = new Lutador("Kevin", "Peru", 30, 1.74, 119.3, 2, 4, 0);
        l[5] = new Lutador("Mae", "EUA", 20, 1.80, 105.4, 10, 8, 5);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].apresentar();
    }
}
