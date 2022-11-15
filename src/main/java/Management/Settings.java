package Management;

import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;
import Controllers.DashboardController;

public class Settings {
    public static void main(String[] args) throws SQLException {
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("""
                Select the number for a Setting
                1) Delete Account
                2) Change Username
                3) Change Email
                4) Change Password
                5) Change Body Fat Stats
                6) Change Body Weight Stats""");

        String chosenSetting = userInput.nextLine();  // Read user input
        if (Objects.equals(chosenSetting, "1")){
            System.out.println("What is your account username?");
            String userName = userInput.nextLine();
            System.out.println(DashboardController.DeleteAccountUseCase(userName));
        }
        else if (Objects.equals(chosenSetting, "2")){
            System.out.println("What is your account username?");
            String userName = userInput.nextLine();
            System.out.println("What is your new account username?");
            String newUserName = userInput.nextLine();
            System.out.println(DashboardController.ChangeUsernameUseCase(userName, newUserName));
        }
        else if (Objects.equals(chosenSetting, "3")){
            System.out.println("What is your account email address?");
            String oldEmail = userInput.nextLine();
            System.out.println("What is your new account email address?");
            String newEmail = userInput.nextLine();
            System.out.println(DashboardController.ChangeEmailUseCase(oldEmail, newEmail));
        }
        else if (Objects.equals(chosenSetting, "4")){
            System.out.println("What is your account password?");
            String oldPassword = userInput.nextLine();
            System.out.println("What is your new account password?");
            String newPassword = userInput.nextLine();
            System.out.println(DashboardController.ChangePasswordUseCase(oldPassword, newPassword));
        }
        else if (Objects.equals(chosenSetting, "5")){
            System.out.println("What is your old body fat?");
            int oldFat = Integer.parseInt(userInput.nextLine());
            System.out.println("What is your new body fat?");
            int newFat = Integer.parseInt(userInput.nextLine());
            System.out.println(DashboardController.ChangeBodyFatUseCase(oldFat, newFat));
        }
        else if (Objects.equals(chosenSetting, "6")){
            System.out.println("What is your old weight?");
            int oldWeight = Integer.parseInt(userInput.nextLine());
            System.out.println("What is your new weight?");
            int newWeight = Integer.parseInt(userInput.nextLine());
            System.out.println(DashboardController.ChangeBodyWeightUseCase(oldWeight, newWeight));
        }
    }
}
