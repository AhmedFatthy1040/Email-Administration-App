import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String companySuffix = "fake.com";
    private String department;
    private String alternativeEmail;
    private int defaultPasswordLength = 8;
    private int mailboxCapacity = 350;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        String dep = setDepartment();
        while (dep == "Error")
            dep = setDepartment();
        this.department = dep;

        this.password = generatePassword(9);
        System.out.println("The Password is: " + this.password);

        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "." + this.companySuffix;
    }
    private String setDepartment() {
        int choice;
        System.out.println("DEPARTMENT CODES \n1 for HR \n2 for Development \n3 for Sales \n4 for Accounting \n0 for None \nEnter the department : ");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        if (choice == 1)
            return "HR";
        else if (choice == 2)
            return "development";
        else if (choice == 3)
            return "sales";
        else if (choice == 4)
            return "accounting";
        else if (choice == 0)
            return "none";
        else {
            System.out.println("Invalid Choice!!");
            return "Error";
        }
    }
    private String generatePassword(int length) {
        String passwordSet = "ABCDEFJHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int k = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(k);
        }
        return new String(password);
    }
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }
    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getMailboxCapacity() {
        return this.mailboxCapacity;
    }
    public String getAlternativeEmail() {
        return this.alternativeEmail;
    }
    public String getPassword() {
        return this.password;
    }
    public String showInfo() {
        return "Name: " + this.firstName + " " + this.lastName +
                "\nDepartment: " + this.department +
                "\nCompany Email: " + this.email +
                "\nMailbox Capacity: " + this.mailboxCapacity + "MB";
    }
}
