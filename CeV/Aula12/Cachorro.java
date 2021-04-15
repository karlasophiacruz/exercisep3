package Aula12;

public class Cachorro extends Mamifero {

    public void emitirSom(){
        System.out.println("Aa au aua");
    }

    //Sobrecarga
    public void reagir(String frase){
        if(frase.equals("Olá mo")){
            System.out.println("Abanar e Latir");
        } else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar o rabo");
        } else{
            System.out.println("Ignorar");
        }
    }
    public void reagir(boolean dono){
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Ignorar");
        }
    }
    public void reagir(int idade, float peso){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
