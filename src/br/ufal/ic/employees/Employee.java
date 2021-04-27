package br.ufal.ic.employees;

public class Employee {


    String mail; //package
    protected String name;
    public String adress;
    private double timeCard;

    public Employee(String name, String adress, double timeCard){
        this.name = name;
        this.adress = adress;
        this.timeCard = timeCard;
    }

    public Employee(String employeeType){
        if(employeeType.equals("hourlyEmployee")){
            //is.hourlyEmployee = true;
        } 
        if(employeeType.equals("salariedEmployee")){
            //this.salariedEmployee = true;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeCard(double timeCard) {
        if(timeCard >= 0){
            this.timeCard = timeCard;
        }
        else{
            System.out.println("Valor incorreto!");
        }
    }

    public String getName() {
        return this.name;
    }

    public String getAdress() {
        return this.adress;
    }

    public double getTimeCard() {
        return this.timeCard;
    }

    public String printEmployeeInfo(){
        return "Name: " + this.name +
               "\nAdress: " + this.adress +
               "\nTime Card: " + this.timeCard;
    }

    //this = employee1;
    //employee = employee2;
    public String printEmployeeInfo(Employee employee){
        return "Name: " + this.name +
               "\nAdress: " + this.adress +
               "\nTime Card: " + this.timeCard +
               "\n-----------------------------" +
               "\nName: " + employee.name +
               "\nAdress: " + employee.adress +
               "\nTime Card: " + employee.timeCard;
    }
}