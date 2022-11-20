package Screens;



import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class BodyweightScreen extends JFrame{

    public BodyweightScreen() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        setSize(700, 700);

    }
    public void paint(Graphics gp) {
        super.paint(gp);
        Graphics2D graphics = (Graphics2D) gp;

        Line2D line1 = new Line2D.Float(100, 600, 600, 600);
        graphics.draw(line1);

        Line2D line2 = new Line2D.Float(100, 100, 100, 600);
        graphics.draw(line2);



    }

}



