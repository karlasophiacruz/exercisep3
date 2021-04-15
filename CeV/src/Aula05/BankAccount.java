package Aula05;

public class BankAccount {
    public int numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("----------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public BankAccount(){
        saldo = 0.00;
        status = false;
    }
 
    public void setNumConta(int n){
        numConta = n;
    }
    public int getNumConta() {
        return numConta;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    public String getDono() {
        return dono;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus(){
        return this.status;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Double getSaldo() {
        return saldo;
    }

    public void openAccount(String t){
        setTipo(t);
        setStatus(true);

        if(t == "CC"){
            this.saldo = 50.00;
        } 
        else if(t == "CP"){
            saldo = 150.00;
        }
    }

    public void closeAccount(){
        if(saldo > 0){
            System.out.println("Conta com dinheiro");
        }
        else if(saldo < 0){
            System.out.println("Conta em débito");
        }
        else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void deposit(Double value){
        if(status == true){
            setSaldo(getSaldo() + value);
            System.out.println("Deposito realizado com sucesso");
        }
        else{
            System.out.println("Impossível depositar");
        }
    }

    public void sac(Double value){
        if(status == true){
            if(saldo >= value){
                saldo -= value;
            }
            else{
                System.out.println("Saldo Insuficiente");
            }
        }
        else{
            System.out.println("Impossível Sacar");
        }
    }

    public void mensal(){
        Double v = 0.00;
        if(getTipo() == "CC"){
            v = 12.00;
        }
        else if(getTipo() == "CP"){
            v = 20.00;
        }
        if(getStatus() == true){
            if(saldo > v){
                saldo -= v;
            }
            else{
                System.out.println("Saldo Insuficiente");
            }
        }
        else{
            System.out.println("Impossível pagar");
        }
    }

}
