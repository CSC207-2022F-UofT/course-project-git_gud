package Management;

import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;
import Controllers.DashboardController;

public class Settings {
    public static void main(String[] args) throws SQLException {
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println(" Select the number for a Setting\n1) Delete Account\n2) Change Username\n3) Change Email\n" +
                        "4) Change Password\n5) Change Body Fat Stats\n6) Change Body Weight Stats");

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
            //System.out.println(DashboardController.ChangeUsernameUseCase(userName, newUserName));
        }
        else if (Objects.equals(chosenSetting, "3")){
            System.out.println("What is your account email address?");
            String oldEmail = userInput.nextLine();
            System.out.println("What is your new account email address?");
            String newEmail = userInput.nextLine();
            //System.out.println(DashboardController.ChangeEmailUseCase(oldEmail, newEmail));
        }
        else if (Objects.equals(chosenSetting, "4")){
            System.out.println("What is your account password?");
            String oldPassword = userInput.nextLine();
            System.out.println("What is your new account password?");
            String newPassword = userInput.nextLine();
            System.out.println(DashboardController.ChangePasswordUseCase(oldPassword, newPassword));
        }
        else if (Objects.equals(chosenSetting, "5")){
            System.out.println("What is your username?");
            String username2 = userInput.nextLine();
            System.out.println("What is your new body fat?");
            int newFat = Integer.parseInt(userInput.nextLine());
            System.out.println(DashboardController.ChangeBodyFatUseCase(username2, newFat));
        }
        else if (Objects.equals(chosenSetting, "6")){
            System.out.println("What is your username?");
            String username1 = userInput.nextLine();
            System.out.println("What is your new weight?");
            int newWeight = Integer.parseInt(userInput.nextLine());
            System.out.println(DashboardController.ChangeBodyWeightUseCase(username1, newWeight));
        }
    }
}
