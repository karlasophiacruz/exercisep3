public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Bruno", "Recife", 10.0);

        System.out.println(employee1.printEmployeeInfo());

<<<<<<< HEAD
        System.out.println(employee1.name); //pode acessar diretamente também
=======
        System.out.println(employee.name); //pode acessar diretamente também
>>>>>>> 190df96d655e381247ae1568752dc72732444c47

        System.out.println("-----------------------------");

        Employee employee2 = new Employee("Maria", "Aracaju", 5);

        System.out.println(employee1.printEmployeeInfo(employee2));
    }
    
}
