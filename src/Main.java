import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine(); //Limpar entrada

        List<Employee> employees = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" + (i+1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();

            while(hasId(employees, id)) {
                System.out.println("ID already taken... Try again!");
                id = sc.nextInt();
            }

            sc.nextLine(); //Limpar entrada
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            Employee emp = new Employee(id, name, salary);
            employees.add(emp);
        }

        System.out.print("\nEnter the employee ID that will have salary increase: ");
        int id_increase = sc.nextInt();
        Employee employee_increase = employees
                .stream()
                .filter(x -> x.getId() == id_increase)
                .findFirst()
                .orElse(null);

        if(employee_increase == null)
            System.out.println("Employee not found");
        else
        {
            System.out.print("Enter the percentage (%): ");
            double percentage = sc.nextDouble();
            employee_increase.increaseSalary(percentage);
        }
        System.out.print("\n");
        for(Employee e : employees)
        {
            System.out.println(e);
        }

        sc.close();
    }
    public static boolean hasId(List<Employee> list, int id)
    {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
