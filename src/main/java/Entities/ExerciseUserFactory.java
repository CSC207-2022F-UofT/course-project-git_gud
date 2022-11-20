package Entities;

public class ExerciseUserFactory implements UserFactory{

    @Override
    public User create(String username, String password) {
        return new ExerciseUser(username,password);
    }
}
