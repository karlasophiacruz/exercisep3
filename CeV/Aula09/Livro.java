package Aula09;

public class Livro implements Publicacao {
    private String titulo, autor;
    private int totPag, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPag, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }

    public String detalhes(){
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + "\n, totPaginas=" + totPag
                + ", pagAtual=" + pagAtual + ", aberto=" + aberto + "\n, leitor=" + leitor.getNome() +
                ", idade=" + leitor.getIdade() + ", sexo=" + leitor.getSexo() + '}';
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public int getTotPag() {
        return totPag;
    }
    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String título) {
        this.titulo = título;
    }

    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;        
    }

    @Override
    public void folhear(int p) {
        if(p > this.totPag){
            this.pagAtual = 0;
        }
        this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
        
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
        
    }
}
