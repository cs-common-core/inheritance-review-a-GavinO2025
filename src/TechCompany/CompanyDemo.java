package TechCompany;

public class CompanyDemo {

    public static void main(String[] args) {
        Employee emp1 = new Developer("Alice", "Developer", 3);
        Employee emp2 = new Manager("Bob", "Manager", true);
        Employee[] staff = { emp1, emp2 };
        System.out.println(emp2.toString());
        for (Employee e : staff) {
            e.work();   // dynamic binding: runs Developer.work() for Alice, Manager.work() for Bob

        }
    }
}
