import java.util.Scanner;

public class OnlineExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        System.out.print("Enter your username: ");
        username = scanner.nextLine();
        System.out.print("Enter your password: ");
        password = scanner.nextLine();
        if (username.equals("admin") && password.equals("password")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }
        scanner.close();
    }
}