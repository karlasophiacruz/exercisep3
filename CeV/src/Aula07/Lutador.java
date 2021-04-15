package Aula07;

public class Lutador {
    private String name, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private Double altura, peso;

    public Lutador(String no, String na, int id, Double al, Double pe, int vi, int de, int emp){
        setName(no);
        setNacionalidade(na);
        setAltura(al);
        setIdade(id);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(emp);
    }

    public void apresentar(){
        System.out.println("------------------------------");
        System.out.println("Lutador: " + getName());
        System.out.println("Idade: " + getIdade());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Peso: " + getPeso());
        System.out.println("Altura: " + getAltura());
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }

    public void ganharluta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderluta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarluta(){
        setEmpates(getEmpates() + 1);
    }

    public String getName() {
        return name;
    }
    public Double getAltura() {
        return altura;
    }
    public String getCategoria() {
        return categoria;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public int getIdade() {
        return idade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public Double getPeso() {
        return peso;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
        setCategoria();
    }
    private void setCategoria() {
        if(this.peso < 52.2){
            categoria = "Invalido";
        } else if(this.peso <= 70.3){
            categoria = "Leve";
        } else if(this.peso <= 83.9){
            categoria = "Médio";
        } else if(this.peso <= 120.2){
            categoria = "Pesado";
        } else{
            categoria = "Invalido";
        }
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
}
