package Aula02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("está tampada? " + this.tampada);
        System.out.println("carga: " + this.carga);
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO!");
        } else{
            System.out.println("Estou rabiscando!");
        }
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }
}