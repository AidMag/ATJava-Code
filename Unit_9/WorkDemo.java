import Work.*;

public class WorkDemo {
    public static void main(String[] args) {
        Employee e = new Employee("Steve", 50000);
        Manager a = new Manager("Bill", 50000, 10000);

        System.out.printf("Name: %s%nSalary: %.2f%nAnnual Income: %.2f%n%n", e.getName(), e.getSalary(), e.getAnnualIncome());
        System.out.printf("Name: %s%nSalary: %.2f%nAnnual Income: %.2f%n", a.getName(), a.getSalary(), a.getAnnualIncome());

    }
}
