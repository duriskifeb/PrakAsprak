package management;

public class Employee {
    private String id, name;
    private Department[] department;
    
    public Employee(String id, String name){
        this.id = id;
        this.name = name;
        this.department = null;
    
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

    public Department[] getDepartment() {
        return this.department;
    }
    public void setDepartment(Department[] department) {
        if(this.department != null){
            System.out.println(this.department);
            this.department.deleteEmployee(this);
        }
        this.department = department;
        department.addEmployee(this);
    }
    
    public String toString(){
        return id + " - " + name + " - " + (department != null ? department.getName() : "No Department");    }
}
