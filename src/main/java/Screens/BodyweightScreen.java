package Screens;

/**
 * This class is responsible for what is displayed when the user wants to graph bodyweight. I believe I have to
 * move the functionality(like the for loop) into the GraphResponseFormatter class.
 */

import Entities.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.*;
import java.util.List;

public class BodyweightScreen extends JFrame{

    private LinkedHashMap<Date, Float> bodyweight;


    public BodyweightScreen(LinkedHashMap<Date, Float> bodyweight) {

        this.bodyweight = bodyweight;
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        setSize(700, 700);

        TitledBorder border = new TitledBorder("PLOT SHOWING BODYWEIGHT PROGRESSION OVER TIME");
        border.setTitleJustification(TitledBorder.CENTER);
        border.setTitlePosition(TitledBorder.TOP);
        border.setTitleColor(Color.RED);
        panel.setBorder(border);


        JLabel label1 = new JLabel("Date");
        panel.add(label1);
        label1.setBounds(300, 670, 100, 100);





    }
    public void paint(Graphics gp) {
        super.paint(gp);
        Graphics2D graphics = (Graphics2D) gp;

        Line2D line1 = new Line2D.Float(100.0F, 600, 600, 600);
        graphics.draw(line1);

        Line2D line2 = new Line2D.Float(100, 100, 100, 600);
        graphics.draw(line2);



        List<Float> vals = new ArrayList<Float>(bodyweight.values());


        for(int i=0; i< vals.size(); i++){

            graphics.fill(new Ellipse2D.Float(100 + 50*i, 600 - vals.get(i),8,8));


        }






    }

}



