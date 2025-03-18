package Jurnal5;

public class Main {
    public static void main(String[] args) {
        // List nama karyawan
        String[] nameList = {
                "Skye Heredia", "Lucille Waltz", "Nichol Sutphin", "Vernia Caraway",
                "Rita Rangel", "Waldo Ontiveros", "Milton Grantham", "Loura Swilley",
                "Lola Duropan", "Kandis Mcnary", "Milford Kirts", "Denita Taniguchi",
                "Talia Fenderson", "Truman Daoust", "Alfonso Chaloux", "Fernanda Overby",
                "Cristy Yearby", "Daniell Pabst", "Bradley Newson", "Renda Maffei"
        };

        // a. Create array of employee objects
        Employee[] employees = new Employee[nameList.length];

        // b. Create three department objects
        Department techTeam = new Department("TECH", "Tim Teknis", 100);
        Department hrTeam = new Department("HR", "Tim SDM", 5);
        Department securityTeam = new Department("SEC", "Tim Keamanan", 5);

        // c-e. Create employee objects and assign them to Tech Team
        for (int i = 0; i < nameList.length; i++) {
            String empId = String.format("EMP%02d", i + 1);
            employees[i] = new Employee(empId, nameList[i]);
            employees[i].setDepartment(techTeam);
        }

        // f. Print initial placement status
        System.out.println("1. Status Penetapan Awal");
        System.out.println("No ID Nama Departemen");
        techTeam.printEmployeeList();
        securityTeam.printEmployeeList();
        hrTeam.printEmployeeList();

        // g-h. Transfer employees based on ID
        for (int i = 0; i < nameList.length; i++) {
            int empNumber = i + 1;

            // Check if the employee ID is divisible by both 2 and 5
            if (empNumber % 2 == 0 && empNumber % 5 == 0) {
                employees[i].setDepartment(securityTeam);
            }
            // Check if the employee ID is divisible by 5
            else if (empNumber % 5 == 0) {
                employees[i].setDepartment(securityTeam);
            }
            // Check if the employee ID is divisible by 2
            else if (empNumber % 2 == 0) {
                employees[i].setDepartment(hrTeam);
            }
            // Otherwise, employee stays in Tech Team
        }

        // i. Print status after transfer
        System.out.println("\n2. Status Setelah Transfer");
        System.out.println("No ID Nama Departemen");
        techTeam.printEmployeeList();
        securityTeam.printEmployeeList();
        hrTeam.printEmployeeList();
    }
}