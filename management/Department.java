package management;

public class Department {
    private String id, name;
    private int maxNum, number;
    private Employee[] employeeList;
    
    public Department(String id, String name, int maxNum){
        this.id = id;
        this.name = name;
        this.maxNum = maxNum;
        
        this.number = 0;
        this.employeeList = new Employee[maxNum];
    }

    public String getId(){
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

    public int getMaxNum() {
        return maxNum;
    }

    public int getEmployeeCount(){

    }
    
    public void printEmployeeCount(){
        System.out.println("Departemen: " + name + " (" + number + ")");
        for (int i = 0; i < number; i++) {
            System.out.println(employeeList[i]);
        }
    }
    
    public boolean canAddEmployee(){
        return number < maxNum;
    }
    
    public void deleteEmployee(Employee employee){
         for (int i = 0; i < number; i++) {
             if (employeeList[i] == employee) {
                employeeList[i] = employeeList[number - 1];
                employeeList[number - 1] = null;
                number--;
                break;
            }
        }
    }
   
    public void addEmployee(Employee employee){
            if (canAddEmployee()) {
            employeeList[number++] = employee;
        }
    }
    
}
    
  
