package views;

public class GraphErrorScreen extends RuntimeException{

    public GraphErrorScreen(String error) {
        super(error);
    }
}
