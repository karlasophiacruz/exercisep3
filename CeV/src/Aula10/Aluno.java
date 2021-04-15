package Aula10;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void cancMat(){
        System.out.println("Matricula Cancelada!");
    }

    public void pagarMens(){
        System.out.println("Pagando mensalidade.");
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
