package graph_use_case;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;



public class GraphView extends JFrame{


//    private final graph_use_case.GraphController g;

    public GraphView(){


        final JFrame frame = new JFrame();
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout());


        final JButton button1 = new JButton("Show bodyweight progression");
        button1.setBounds(3, 3, 3, 1);
        frame.add(button1);

        final JButton button2 = new JButton("Show volume progression");
        button2.setBounds(80, 30, 30, 10);
        frame.add(button2);

        final JButton button3 = new JButton("Show one rep max progression");
        button3.setBounds(3, 3, 3, 1);
        frame.add(button3);

        final JButton button4 = new JButton("Show targets");
        button4.setBounds(80, 30, 30, 10);
        frame.add(button4);

        frame.setVisible(true);

    }


}
