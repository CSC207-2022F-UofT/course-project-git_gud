package Screens;

/**
 * This class is responsible for what is displayed when the user wants to graph bodyweight. I believe I have to
 * move the functionality(like the for loop) into the GraphResponseFormatter class.
 */

import Entities.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.*;
import java.util.List;

public class BodyweightScreen extends JFrame //implements ActionListener
 {

    private LinkedHashMap<Date, Float> bodyweight;


    public BodyweightScreen(LinkedHashMap<Date, Float> bodyweight) {

        this.bodyweight = bodyweight;

        JFrame f = new JFrame("Bodyweight Screen");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
        setSize(700, 700);

        TitledBorder border = new TitledBorder("PLOT SHOWING BODYWEIGHT PROGRESSION OVER TIME");
        border.setTitleJustification(TitledBorder.CENTER);
        border.setTitlePosition(TitledBorder.TOP);
        border.setTitleColor(Color.RED);
        panel.setBorder(border);



        JLabel label1 = new JLabel("Date");
        label1.setBounds(330, 590, 30, 30);
        label1.setFont(new Font("Serif", Font.PLAIN, 16));
        panel.add(label1);

        JLabel label2 = new JLabel("Bodyweight");
        label2.setBounds(1, 270, 150, 120);
        label2.setFont(new Font("Serif", Font.PLAIN, 14));
        panel.add(label2);

        JLabel label3 = new JLabel("0");
        label3.setBounds(70, 560, 15, 15);
        label3.setFont(new Font("Serif", Font.PLAIN, 14));
        panel.add(label3);

        JLabel label4 = new JLabel("100");
        label4.setBounds(70, 453, 30, 30);
        label4.setFont(new Font("Serif", Font.PLAIN, 14));
        panel.add(label4);

        JLabel label5 = new JLabel("200");
        label5.setBounds(70, 353, 30, 30);
        label5.setFont(new Font("Serif", Font.PLAIN, 14));
        panel.add(label5);

        JLabel label6 = new JLabel("300");
        label6.setBounds(70, 253, 30, 30);
        label6.setFont(new Font("Serif", Font.PLAIN, 14));
        panel.add(label6);

        JLabel label7 = new JLabel("400");
        label7.setBounds(70, 153, 30, 30);
        label7.setFont(new Font("Serif", Font.PLAIN, 14));
        panel.add(label7);

        JLabel label8 = new JLabel("500");
        label8.setBounds(70, 53, 30, 30);
        label8.setFont(new Font("Serif", Font.PLAIN, 14));
        panel.add(label8);





    }
    public void paint(Graphics gp) {
        super.paint(gp);
        Graphics2D graphics = (Graphics2D) gp;

        Line2D line1 = new Line2D.Float(100, 600, 600, 600);
        graphics.draw(line1);

        Line2D line2 = new Line2D.Float(100, 100, 100, 600);
        graphics.draw(line2);



        List<Float> vals = new ArrayList<Float>(bodyweight.values());


        for(int i=0; i< vals.size(); i++){

            graphics.fill(new Ellipse2D.Float(100 + 25*i, 595 - vals.get(i),8,8));


        }






    }

}



