import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternativeEmail;
    private int mailboxCapacity;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created Successfully! : " + firstName + " " + lastName);
        String dep = setDepartment();
        while (dep == "Error")
            dep = setDepartment();
        this.department = dep;
        System.out.println("Department: " + dep);
    }
    private String setDepartment() {
        int choice;
        System.out.println("DEPARTMENT CODES \n1 for HR \n2 for Development \n3 for Sales \n4 for Accounting \n0 for None \nEnter the department : ");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        if (choice == 1)
            return "HR";
        else if (choice == 2)
            return "Development";
        else if (choice == 3)
            return "Sales";
        else if (choice == 4)
            return "Accounting";
        else if (choice == 0)
            return "None";
        else {
            System.out.println("Invalid Choice!!");
            return "Error";
        }
    }
}