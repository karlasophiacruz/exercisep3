package Aula12;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Cachorro c = new Cachorro();

        m.alimentar();
        c.reagir("Olá");
        c.reagir(true);
        c.reagir(12, 00);
    }
}
