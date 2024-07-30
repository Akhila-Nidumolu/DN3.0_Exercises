class Employee {
    int eId;
    String name;
    String pos;
    double sal;

    public Employee(int eId, String name, String pos, double sal) {
        this.eId = eId;
        this.name = name;
        this.pos= pos;
        this.sal = sal;
    }
}
class EmployeeManagement {
    private Employee[] employees;
    private int size;
    public EmployeeManagement(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }
    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size] = employee;
            size++;
        }
    }
    public Employee searchEmployee(int eId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].eId == eId) {
                return employees[i];
            }
        }
        return null;
    }
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
    public void deleteEmployee(int eId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].eId == eId) {
                employees[i] = employees[size - 1];
                size--;
                break;
            }
        }
    }
}
