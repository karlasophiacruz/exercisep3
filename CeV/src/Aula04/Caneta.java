package Aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    protected int carga;
    
    public Caneta() { //metodo construct
        this.tampar();
        this.cor = "Azul";
    }

    public String geModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void status(){
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Uma caneta " + this.cor);
            System.out.println("está tampada? " + this.tampada);
            System.out.println("carga: " + this.carga);
    }
}
