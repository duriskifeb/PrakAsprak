package week5;
import java.util.ArrayList;

public class Week5 {
    public static void main(String[] args) {
        
        ArrayList<Employee> employeefinal = new ArrayList<>(); // Daftar karyawan
        ArrayList<String> employeeNames = new ArrayList<>(); // Nama karyawan

        // Menambahkan nama-nama dari tabel
        employeeNames.add("Skye Heredia");
        employeeNames.add("Lucille Waltz");
        employeeNames.add("Nicholl Sutphin");
        employeeNames.add("Vernia Caraway");
        employeeNames.add("Rita Rangel");
        employeeNames.add("Waldo Ontiveros");
        employeeNames.add("Milton Grantham");
        employeeNames.add("Loura Swilley");
        employeeNames.add("Lola Duropan");
        employeeNames.add("Kandis Mcnary");
        employeeNames.add("Milford Kirts");
        employeeNames.add("Denita Taniguchi");
        employeeNames.add("Talia Fenderson");
        employeeNames.add("Truman Daoust");
        employeeNames.add("Alfonso Chaloux");
        employeeNames.add("Fernanda Overby");
        employeeNames.add("Cristy Yearby");
        employeeNames.add("Daniell Pabst");
        employeeNames.add("Bradley Newson");
        employeeNames.add("Renda Maffei");
       
        // Membuat objek department
        Department timTeknis = new Department("Tim Teknis", "1", 20);
        Department keamanan = new Department("Tim Keamanan", "1", 4);
        Department sdm = new Department("Tim SDM", "1", 5);

        // Menambahkan 10 karyawan pertama ke Tim Teknis
        for (int i = 0; i < 10; i++) {
            String empId = "EMP" + String.format("%02d", (i + 1)); // Format EMP01, EMP02, dll.
            Employee x = new Employee(empId, employeeNames.get(i)); // Membuat objek Employee
            x.setDepartment(timTeknis); // Menetapkan departemen
            employeefinal.add(x); // Menambah ke daftar
            
            System.out.println(x);
            
        }

        // Menampilkan daftar karyawan yang ditambahkan
        for (Employee emp : employeefinal) {
            System.out.println(emp);
        }
    }
}
