package WorkoutViewModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;


public class WorkoutStartView extends JFrame {


    public ArrayList<String> weights = new ArrayList<String>();
    public ArrayList<String> repsNumber = new ArrayList<String>();

    private JPanel panel = new JPanel();
    private JButton exercise = new JButton("Pushups");
    private JButton weight = new JButton("Weight");
    private JButton reps = new JButton("Reps");
    private JButton one = new JButton("1");
    private JTextField weight1 = new JTextField();
    private JTextField reps1 = new JTextField();
    private JButton two = new JButton("2");
    private JTextField weight2 = new JTextField();
    private JTextField reps2 = new JTextField();
    private JButton three = new JButton("3");
    private JTextField weight3 = new JTextField();
    private JTextField reps3 = new JTextField();
    private JButton ghost = new JButton();
    private JButton next = new JButton("Next");




    public WorkoutStartView() {

        initialize();
    }

        public void initialize(){
            setSize(500, 400);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            //Display the window.
            setVisible(true);

//        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
            panel.setLayout(new GridLayout(5, 3, 3, 5));
            add(panel);
            panel.setBackground(Color.GRAY);

            exercise.setEnabled(true);


            weight.setEnabled(false);
            reps.setEnabled(false);


            one.setEnabled(false);

            two.setEnabled(false);

            three.setEnabled(false);


            ghost.setEnabled(false);
            ghost.setVisible(false);


//
//        JButton four = new JButton("4");
//        four.setEnabled(false);
//
//        JTextField weight4 = new JTextField("weight4");
//        JTextField reps4 = new JTextField("reps4");

            panel.add(exercise);
            panel.add(weight);
            panel.add(reps);

            panel.add(one);
            panel.add(weight1);
            panel.add(reps1);

            panel.add(two);
            panel.add(weight2);
            panel.add(reps2);

            panel.add(three);
            panel.add(weight3);
            panel.add(reps3);

            panel.add(ghost);
            panel.add(ghost);
            panel.add(next);

            weight1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    weights.add(weight1.getText());
                }
            });
            reps1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    repsNumber.add(reps1.getText());
                }
            });

            weight2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    weights.add(weight2.getText());
                }
            });
            reps2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    repsNumber.add(reps2.getText());
                }
            });

            weight3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    weights.add(weight3.getText());
                }
            });
            reps3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    repsNumber.add(reps3.getText());
                }
            });

            exercise.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //Call method to display exercise
                }
            });

            next.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //Call method to go to next exercise in the workout
                }
            });
        }


    }



