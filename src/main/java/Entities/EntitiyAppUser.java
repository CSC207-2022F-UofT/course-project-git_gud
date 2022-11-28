package Entities;
public class EntitiyAppUser implements UserDetails {

    public String username;
    public String password;
    public String email;

    public EntitiyAppUser(String name, String password, String email){
        this.username = name;
        this.password = password;
        this.email = email;
    }
    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}
