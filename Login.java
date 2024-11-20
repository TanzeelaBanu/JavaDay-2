package tanzeela;

import java.util.Scanner;
public class Login
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        String validUserId = "admin";
        String validPassword = "password123";

        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();

        if (userId.equals(validUserId)) {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (password.equals(validPassword)) {
                System.out.println("Login successful");
            } else {
                System.out.println("Login unsuccessful");
            }
        } else {
            System.out.println("Invalid user ID");
        }
        scanner.close();
	}
}

