import javax.swing.text.View;

public class Presenter {


    public static void completeRegistration(ViewLoginPage x){
//        Inject the part of the view that needs updating here, using dependency inversion because of the dependency rule
    }
    public static void falseLogin(ViewLoginPage x){
        x.message.setText("Please Enter Correct Password");
    }

    public static void login(ViewLoginPage x){

    }
}
