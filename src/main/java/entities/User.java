package entities;

public interface User {
    //We'll keep the interface ,so we can use the open closed principle? In the future if we add different types of users
    //for example a TrainerUser or an AthleteUser if we add features specific to certain sports.

    //The user should have some methods for logging in
    String getusername();

    String getpassword();

    //The user should not be forced to use methods for volume and bodyweight in case the user is a trainer or athlete.




}
