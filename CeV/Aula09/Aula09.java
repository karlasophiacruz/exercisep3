package Aula09;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", "M", 22);
        p[1] = new Pessoa("Maria", "F", 25);

        l[0] = new Livro("Aprendendo Java", "José", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro", 500, p[1]);
        l[2] = new Livro("Harry Potter", "Paulo", 400, p[0]);

        System.out.println(l[0].detalhes());
    }
}
