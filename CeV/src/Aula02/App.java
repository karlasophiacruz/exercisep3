package Aula02;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Caneta c1 = new Caneta();
        /*c1.cor = "Azul";
        c1.ponta = 0.5f;
        //c1.tampada = false;
        c1.tampar();
        c1.destampar();
        c1.rabiscar();*/
        c1.status();
        //c1.ponta = 0.5;
 
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.destampar();
        c2.status(); 
    }
}
