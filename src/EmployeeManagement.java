public class EmployeeManagement {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("John Doe", 1, 5000);
        employees[1] = new Employee("Jane Smith", 2, 6000);
        employees[2] = new Employee("David Johnson", 3, 7000);
        employees[3] = new Employee("Sarah Williams", 1, 5500);
        employees[4] = new Employee("Michael Brown", 2, 6500);
        employees[5] = new Employee("Jessica Davis", 3, 7500);
        employees[6] = new Employee("Christopher Wilson", 1, 5200);
        employees[7] = new Employee("Emily Taylor", 2, 6200);
        employees[8] = new Employee("Daniel Anderson", 3, 7200);
        employees[9] = new Employee("Olivia Martinez", 1, 5300);

        printAllEmployees();
        System.out.println("Total monthly salary cost: $" + calculateTotalSalaryCost());
        System.out.println("Employee with minimum salary: " + findEmployeeWithMinimumSalary());
        System.out.println("Employee with maximum salary: " + findEmployeeWithMaximumSalary());
        System.out.println("Average salary: $" + calculateAverageSalary());
        printAllEmployeeNames();
    }

    private static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static double calculateTotalSalaryCost() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    private static Employee findEmployeeWithMinimumSalary() {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    private static Employee findEmployeeWithMaximumSalary() {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    private static double calculateAverageSalary() {
        double totalSalary = calculateTotalSalaryCost();
        return totalSalary / employees.length;
    }

    private static void printAllEmployeeNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
