package Aula14;

public class Visualizacao {
    private Gafan espectador;
    private Video filme;

    public Visualizacao(Gafan espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int total = 0;
        if(porc <= 20){
            total = 3;
        } else if(porc <=50){
            total = 5;
        } else if(porc <= 90){
            total = 8;
        } else{
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }

    public Gafan getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafan espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Espectador = " + this.getEspectador() + " Filme = " + this.getFilme();
    }
}
