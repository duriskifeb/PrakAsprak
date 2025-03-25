/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *

* @author Axioo Pongo
 */
public class Employee {

    public Employee(String empId, String name) {
         this.id = empId;
        this.name = name  ;
        this.department = null ;
    }
    
    private String id,name;
    
    private Department department ;
    
//    public void Employee (String id, String name){
//        
//       
//    }
    
    public String getId (){
       
        
        return id;
    }
    
    public String getName(String name){
        
        return name;
        
    }
    public String setName(String name){
        return name;
        
    }
    public Department getDepartment (){
        
        return department;
    }
    public void setDepartment(Department department){
        if (this.department != null){
            this.department.deleteEmployee(this);
        }
        if(department != null && department.canAddEmployee( )) {
            department.addEmployee(this);
            this.department = department;
        }else {
            this.department = null;
        }
        }
        
        
    
    //public String toString(){
        
        
   // }

    
    
           
    
}
