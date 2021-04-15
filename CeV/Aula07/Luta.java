package Aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("===DESAFIADO===");
            this.desafiado.apresentar();
            System.out.println("===DESAFIANTE===");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0: //Empate
                    System.out.println("EMPATE!");
                    this.desafiado.empatarluta();
                    this.desafiante.empatarluta();
                    break;
                case 1:
                    System.out.println("DESAFIANTE VENCEU!");
                    this.desafiante.ganharluta();
                    this.desafiado.perderluta();
                    break;
                case 2:
                    System.out.println("DESAFIADO VENCEU!");
                    this.desafiante.perderluta();
                    this.desafiado.ganharluta();
                    break;
            }
        } else{
            System.out.println("A luta não permitida!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
