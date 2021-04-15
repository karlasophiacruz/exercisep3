package Aula10;

public class Aula10 {
    public static void main(String[] args) {
        Visit p1 = new Visit();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Bolsista p5 = new Bolsista();

        p1.setNome("Pedro");
        p2.setNome("Sophia");
        p3.setNome("Marina");
        p4.setNome("Maria");

        p1.setSexo("M");
        p4.setSexo("F");

        p2.setIdade(18);

        p2.setCurso("Informatica");

        p5.pagarMens();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
