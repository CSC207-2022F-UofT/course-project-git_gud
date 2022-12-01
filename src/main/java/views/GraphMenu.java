package views;

import controllers.GraphController;

import java.awt.GridLayout;
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
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout());


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

        final JButton button4 = new JButton("Targets");
        button4.setBounds(80, 30, 30, 10);
        button4.addActionListener(this);
        frame.add(button4);

        frame.setVisible(true);







    }


    @Override
    public void actionPerformed(ActionEvent e) {


       // have to call the View controller here
        controller.plot(username, e.getActionCommand());




















//        Date d1 = new Date(2022, 10,2);
//        Date d2 = new Date(2022, 19,2);
//        Date d3 = new Date(2022, 18,2);
//        Date d4 = new Date(2022, 10,3);
//        Date d5 = new Date(2022, 11,3);
////        Date d = new SimpleDateFormat("dd/MM/yyyy").parse("09/09/2056");
//
//
//        LinkedHashMap<Date, Float> l = new LinkedHashMap<Date, Float>();
//        l.put(d1, 27.0F);
//        l.put(d2, 316.0F);
//        l.put(d3, 5.0F);
//        l.put(d4, 34.3F);
//        l.put(d5, 101.0F);
////        l.put(d, 200.0F);
//
//        BodyweightScreen b = new BodyweightScreen(l);
//        b.setVisible(true);





    }
}
