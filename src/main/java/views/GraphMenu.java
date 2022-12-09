package views;

import controllers.GraphController;
import graph_use_case.GraphResponseModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Very incomplete, but at the moment it just shows a basic menu with different buttons for different graphing
 * options. Need to add ActionPerformed methods.
 */


public class GraphMenu extends JFrame implements ActionListener{

    private GraphController controller;

    private String username;

//    private final controllers.GraphController g;

    public GraphMenu(GraphController controller, String username){

        this.controller = controller;
        this.username = username;


        final JFrame frame = new JFrame();
        frame.setSize(700,120);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());


        final JButton button1 = new JButton("Bodyweight");
        button1.setBounds(3, 3, 3, 1);
        button1.addActionListener(this);
        frame.add(button1);

        final JButton button2 = new JButton("Volume");
        button2.setBounds(80, 30, 30, 10);
        button2.addActionListener(this);
        frame.add(button2);

        final JButton button3 = new JButton("ORM");
        button3.setBounds(3, 3, 3, 1);
        button3.addActionListener(this);
        frame.add(button3);

        final JButton button4 = new JButton("TargetBodyweight");
        button4.setBounds(80, 30, 30, 10);
        button4.addActionListener(this);
        frame.add(button4);

        final JButton button5 = new JButton("TargetVolume");
        button5.setBounds(80, 30, 30, 10);
        button5.addActionListener(this);
        frame.add(button5);

        final JButton button6 = new JButton("TargetORM");
        button6.setBounds(80, 30, 30, 10);
        button6.addActionListener(this);
        frame.add(button6);

        frame.setVisible(true);







    }


    @Override
    public void actionPerformed(ActionEvent e) {


       // have to call the View controller here
       GraphResponseModel graphResponseModel = controller.plot(username, e.getActionCommand());

        if(graphResponseModel.getButtontext() == "Bodyweight") {
            BodyweightScreen b = new BodyweightScreen(graphResponseModel.getData());
            b.setVisible(true);
        } else if (graphResponseModel.getButtontext() == "Volume") {
            VolumeScreen v = new VolumeScreen(graphResponseModel.getData());
            v.setVisible(true);
        } else if (graphResponseModel.getButtontext() == "ORM") {
            ORMScreen o = new ORMScreen(graphResponseModel.getData());
            o.setVisible(true);
        }
        else if (graphResponseModel.getButtontext() == "TargetBodyweight" || graphResponseModel.getButtontext() == "TargetORM" ||
                graphResponseModel.getButtontext() == "TargetVolume"){
            TargetGraphScreen t = new TargetGraphScreen(graphResponseModel.getData(), graphResponseModel.getButtontext());
            t.setVisible(true);
        }













    }
}
