package Aula14;

public abstract class Pessoa {
    protected String nome, sexo;
    protected int idade;
    protected float experiencia;

    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    @Override
    public String toString() {
        return "{ " + this.nome + " " + this.idade + " " + this.sexo + " "
        + this.experiencia + " }";
    }
}
