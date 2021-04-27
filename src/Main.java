public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Bruno", "Recife", 10.0);

        Hourly hourlyy = new Employee();

        //Hourly hourly = new Hourly();

        Employee hourly = new Hourly();

        Salaried salaried = new Salaried();

        Comissioned comissioned = new Comissioned();

        System.out.println(employee1.printEmployeeInfo());

        //System.out.println(employee.setName); //pode acessar diretamente também

        //employee1.getName();

        System.out.println(employee1.getName());

        System.out.println("-----------------------------");

        Employee employee2 = new Employee("Maria", "Aracaju", 5);

        System.out.println(employee1.printEmployeeInfo(employee2));
    }
    
}
