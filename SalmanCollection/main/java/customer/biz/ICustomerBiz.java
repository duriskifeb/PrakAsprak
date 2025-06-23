/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package customer.biz;

/**
 *
 * @author Aditya
 */
import java.util.HashMap;
public interface ICustomerBiz {
    public void initializeCustomer();
    public void printAllCustomer();
    public void insertCustomer(String name, int age, HashMap <String, String> phone);
    public void changeAge(int number, int age);
    public void changePhone(int number, HashMap<String, String>phone);
    public void deleteCustomer(int number);
    public int getCustomerNumber();
    
}
