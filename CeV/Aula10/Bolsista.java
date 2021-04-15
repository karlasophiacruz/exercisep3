package Aula10;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa!");
    }

    @Override
    public void pagarMens(){
        System.out.println(this.getNome() + "é bolsista! Mensalidade paga.");
    }

    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
