package Collection;

// import com.asthiseta.pbocollection.customer.Customer;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author asthiseta
 */
public class CustomerBiz implements ICustomerBiz {

    private ArrayList<Customer> customers;

    @Override
    public void initializeCustomer() {
        this.customers = new ArrayList<>();

        HashMap<String, String> leePhones = new HashMap<String, String>();
        leePhones.put("HP", "010-5678-1234");
        leePhones.put("OFFICE", "010-2132-9876");
        leePhones.put("PERWAKILAN", "HP");
        Customer lee = new Customer(
                "Lee",
                28,
                leePhones);

        HashMap<String, String> parkPhones = new HashMap<String, String>();
        parkPhones.put("HP", "010-4567-9876");
        parkPhones.put("OFFICE", "010-1234-5678");
        parkPhones.put("PERWAKILAN", "HP");
        Customer park = new Customer(
                "Park",
                31,
                parkPhones);

        HashMap<String, String> choiPhones = new HashMap<String, String>();
        choiPhones.put("HP", "010-8888-9999");
        choiPhones.put("OFFICE", "010-1111-2222");
        choiPhones.put("PERWAKILAN", "OFFICE");
        Customer choi = new Customer(
                "Choi",
                31,
                choiPhones);

        customers.add(lee);
        customers.add(park);
        customers.add(choi);
    }

    @Override
    public void printAllCustomer() {

        int no = 1;

        for (Customer customer : customers) {
            HashMap<String, String> phones = customer.getPhone();
            String perwakilan = phones.get("PERWAKILAN");
            System.out.println(no + ". nama: " + customer.getName() + " \t usia: " + customer.getAge()
                    + " \t No Telepon: " + "[" + perwakilan + "] " + phones.get(perwakilan));
            no += 1;
        }

    }

    @Override
    public void insertCustomer(String name, int age, HashMap<String, String> phone) {
        Customer newCust = new Customer(
                name,
                age,
                phone);

        customers.add(newCust);
        System.out.println("@ informasi pelanggan sudah ditambahkan");
    }

    @Override
    public void changeAge(int number, int age) {
        if (age < 0) {
            System.out.println("[Error] usia tidak bisa di input negative");
            return;
        }
        if ((number - 1) >= getCustomerNumber()) {
            System.out.println("[Error] tidak bisa menemukan nomor pelanggan yang sesuai");
            return;
        }
        Customer cust = customers.get(number - 1);
        cust.setAge(age);
        customers.remove(number - 1);
        customers.add(number - 1, cust);
        System.out.println("@ Informasi Pelanggan telah dihapus");
    }

    @Override
    public void changePhone(int number, HashMap<String, String> phone) {
        if ((number - 1) >= getCustomerNumber()) {
            System.out.println("[Error] tidak bisa menemukan nomor pelanggan yang sesuai");
            return;
        }
        Customer cust = customers.get(number - 1);
        cust.setPhone(phone);
        customers.remove(number - 1);
        customers.add(number - 1, cust);
        System.out.println("@ Informasi Pelanggan telah dihapus");

    }

    @Override
    public void deleteCustomer(int number) {
        if ((number - 1) >= getCustomerNumber()) {
            System.out.println("[Error] tidak bisa menemukan nomor pelanggan yang sesuai");
            return;
        }

        customers.remove(number - 1);
        System.out.println("@ Informasi Pelanggan telah dihapus");

    }

    @Override
    public int getCustomerNumber() {
        // return customers.size();
        int no = 0;
        for (Customer customer : customers) {
            no += 1;
        }
        return no;
    }

}