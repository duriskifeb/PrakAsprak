package Jurnal5;

public class Employee {
    private String id;
    private String name;
    private Department department;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        // a. Check if the department can accommodate more people
        if (department.canAddEmployee()) {
            // b. If there's already a department, remove the employee from it
            if (this.department != null) {
                this.department.deleteEmployee(this);
            }
            // c. Add the employee to the new department
            department.addEmployee(this);
            // d. Change the department field to the received department
            this.department = department;
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + (department != null ? department.getName() : "No Department");
    }
}