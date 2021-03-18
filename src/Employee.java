public class Employee {

    String name;
    String adress;
    double timeCard;

    public Employee(String name, String adress, double timeCard){
        this.name = name;
        this.adress = adress;
        this.timeCard = timeCard;
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