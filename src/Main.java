public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Bruno", "Recife", 10.0);

        System.out.println(employee1.printEmployeeInfo());

        System.out.println(employee1.name); //pode acessar diretamente também

        System.out.println("-----------------------------");

        Employee employee2 = new Employee("Maria", "Aracaju", 5);

        System.out.println(employee1.printEmployeeInfo(employee2));
    }
    
}
