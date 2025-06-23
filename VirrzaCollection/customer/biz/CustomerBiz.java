/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer.biz;

import java.util.HashMap;
import customer.Customer;
import java.util.ArrayList; // import the ArrayList class

/**
 *
 * @author VirzaAbsyar
 */
public class CustomerBiz implements ICustomerBiz{

    

    private ArrayList<Customer> customers;
    
    
    
    @Override
    public void initializeCustomer() {
        customers = new ArrayList<Customer>();
        HashMap<String, String> leePhone = new HashMap();
        
        leePhone.put("HP", "010-5678-1234");
        leePhone.put("OFFICE", "010-2132-9876");
        leePhone.put("PERWAKILAN","HP");
        
        Customer lee  = new Customer(
        "Lee", 28, leePhone);
        
        customers.add(lee);
        
        
        HashMap<String, String> parkPhone = new HashMap();
        
        parkPhone.put("HP", "010-4567-9876");
        parkPhone.put("OFFICE", "010-1234-5678");
        parkPhone.put("PERWAKILAN","HP");
        
        Customer park  = new Customer(
        "Park", 31, parkPhone);
        
        customers.add(park);
        
        
        HashMap<String, String> choiPhone = new HashMap();
        
        choiPhone.put("HP", "010-8888-9999");
        choiPhone.put("OFFICE", "010-1111-2222");
        choiPhone.put("PERWAKILAN","OFFICE");
        
        Customer choi  = new Customer(
        "Choi", 25, choiPhone);
        
        customers.add(choi);
        
        
        
        
        HashMap<String, String> hongPhone = new HashMap();
        
        hongPhone.put("HP", "010-4679-8520");
        hongPhone.put("OFFICE", "010-4679-8522");
        hongPhone.put("PERWAKILAN","OFFICE");
        
        Customer hong  = new Customer(
        "Hong", 27, hongPhone);
        
        customers.add(hong);
        
        
        
        
        
        
    }

    @Override
    public void printAllCustomer() {
            System.out.println("------------------------------ Informasi Pelanggan ------------------------------");
            for(Customer allCustomer : customers){
                int no = customers.indexOf(allCustomer) + 1;
                String perwakilan = allCustomer.getPhone().get("PERWAKILAN");
                String noHp = allCustomer.getPhone().get(perwakilan);


                System.out.println(no + ", nama: " + allCustomer.getName()
                + ", Usia: " + allCustomer.getAge() + " No Telepon: ["+ perwakilan +"] " + noHp);
            
            
            
        }
        System.out.println("------------------------------------------------");
    }

    @Override
    public void insertCustomer(String name, int age, HashMap<String, String> phone) {
       Customer customer = new Customer(name, age,phone);
       customers.add(customer);
       System.out.println("@ Informasi pelanggan sudah ditambahkan");
    }

    @Override
    public void changeAge(int number, int age) {
        int index = number - 1;
        if(index >= getCustomerNumber()){
            System.out.println("[ERROR] tidak bisa menemukan nomor pelanggan yang sesuai");
        }
        Customer customer =  customers.get(index);
        customer.setAge(age);
        System.out.println("@ Informasi pelanggan sudah ditambahkan");
       
    }

    @Override
    public void changePhone(int number, HashMap<String, String> phone) {
        int index = number - 1;
        if(index >= getCustomerNumber()){
            System.out.println("[ERROR] tidak bisa menemukan nomor pelanggan yang sesuai");
        }
        Customer customer = customers.get(index);
        
//         
//        String perwakilan = customer.getPhone().get("PERWAKILAN");
//
//        
//        phone.put("PERWAKILAN", perwakilan);
        
        customer.setPhone(phone);
        System.out.println("@ Informasi pelanggan sudah ditambahkan");
    }

    @Override
    public void deleteCustomer(int number) {
        int index = number - 1;
        if(index >= getCustomerNumber()){
            System.out.println("[ERROR] tidak bisa menemukan nomor pelanggan yang sesuai");
        }
        customers.remove(number);
        System.out.println("@ Informasi pelanggan telah dihapus");
    }

    @Override
    public int getCustomerNumber() {
       int number = 0;
       for(Customer size : customers){
           number+=1;
       }
       return number;
               
    }
    
    
}
