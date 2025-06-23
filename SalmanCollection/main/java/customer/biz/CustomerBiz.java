/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer.biz;

/**
 *
 * @author Aditya
 */
import customer.Customer;
import java.util.ArrayList;
import java.util.HashMap;

public class CustomerBiz implements ICustomerBiz {
    private ArrayList<Customer> customers;

    @Override
    public void initializeCustomer() {
        customers = new ArrayList<Customer>();
        
        HashMap<String, String> leePhone = new HashMap();
        leePhone.put("HP", "010-5678-1234");
        leePhone.put("Office", "010-2132-9876");
        leePhone.put("PERWAKILAN", "HP");
        
        Customer lee = new Customer(
            "Lee",
            20,
            leePhone
        );
                
        HashMap<String, String> parkPhone = new HashMap();
        parkPhone.put("HP", "010-4567-9876");
        parkPhone.put("OFFICE", "010-1234-5678");
        parkPhone.put("PERWAKILAN", "HP");
        
        Customer park = new Customer(
            "Park",
            31,
            parkPhone
        );
        
        HashMap<String, String> choiPhone = new HashMap();
        choiPhone.put("HP", "010-8888-9999");
        choiPhone.put("OFFICE", "010-1111-2222");
        choiPhone.put("PERWAKILAN", "OFFICE");
        
        Customer choi = new Customer(
            "Choi",
            25,
            choiPhone
        );
        
        HashMap<String, String> hongPhone = new HashMap();
        hongPhone.put("HP", "010-4679-8520");
        hongPhone.put("OFFICE", "010-4679-8522");
        hongPhone.put("PERWAKILAN", "OFFICE");
        
        Customer hong = new Customer(
            "Hong",
            25,
            hongPhone
        );        
        
        customers.add(lee);
        customers.add(park);
        customers.add(choi);
        customers.add(hong);
    }

    @Override
    public void printAllCustomer() {
        System.out.println("---------------Informasi Pinjaman-----------------");
        for(Customer cust : customers){
            int no = customers.indexOf(cust) + 1;
            String perwakilan = cust.getPhone().get("PERWAKILAN");
            String noHp = cust.getPhone().get(perwakilan);
            
            System.out.println(no +
                    ". nama: " + cust.getName()+
                    "\t usia: " + cust.getAge() +
                    "\t No Telepon: [" + perwakilan + "] " + noHp);
        }
    }

    @Override
    public void insertCustomer(String name, int age, HashMap<String, String> phone) {
       Customer cust = new Customer(
            name,
            age,
            phone
       );
       
       customers.add(cust);
       System.out.println("@ informasi pelanggan sudah ditambahkan");
    }

    @Override
    public void changeAge(int number, int age) {
        int index = number-1;
        
        if(age < 0){
            System.out.println("[Error] usia tidak dapat diinput negative");
            return;
        }
        
        if(index >= getCustomerNumber()){
            System.out.println("[Error] tidak bisa menemukan umur pelanggan yang sesuai");
            return;
        }
        Customer cust = customers.get(index);
        cust.setAge(age);
        System.out.println("@ informasi umur telah diubah");
    }

    @Override
    public void changePhone(int number, HashMap<String, String> phone) {
        int index = number-1;
        if(index >= getCustomerNumber()){
            System.out.println("[Error] tidak bisa menemukan nomor pelanggan yang sesuai");
            return;
        }
        Customer cust = customers.get(index);
        cust.setPhone(phone);
        System.out.println("@ informasi pelanggan telah diubah");
    }

    @Override
    public void deleteCustomer(int number) {
        int index = number-1;
        if(index >= getCustomerNumber()){
            System.out.println("[Error] tidak bisa menemukan nomor pelanggan yang sesuai");
            return;
        }
        customers.remove(index);
        System.out.println("@ informasi pelanggan telah dihapus");
    }

    @Override
    public int getCustomerNumber() {
        //return customers.size();
        int number = 0;
        for(Customer c : customers){
            number +=1;
        }
        return number;
        
    }
    
    
           
}
