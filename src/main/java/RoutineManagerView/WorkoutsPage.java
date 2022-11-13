package RoutineManagerView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkoutsPage {

    WorkoutsPage() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 564);
        frame.setLayout(null);
        frame.setTitle("Routine Manager");

        JPanel workouts = new JPanel();
        workouts.setLocation(0, 250);
        workouts.setBounds(50, 144, 200, 275);
        workouts.setBackground(Color.lightGray);
        workouts.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton workout1 = new JButton();
        JButton workout2 = new JButton();
        JButton workout3 = new JButton();
        JButton workout4 = new JButton();
        JButton workout5 = new JButton();
        workout1.setText("Workout 1");
        workout2.setText("Workout 2");
        workout3.setText("Workout 3");
        workout4.setText("Workout 4");
        workout5.setText("Workout 5");
        workout1.setFocusable(false);
        workout2.setFocusable(false);
        workout3.setFocusable(false);
        workout4.setFocusable(false);
        workout5.setFocusable(false);
        workout1.setFont(new Font("Dialog", Font.BOLD, 30));
        workout2.setFont(new Font("Dialog", Font.BOLD, 30));
        workout3.setFont(new Font("Dialog", Font.BOLD, 30));
        workout4.setFont(new Font("Dialog", Font.BOLD, 30));
        workout5.setFont(new Font("Dialog", Font.BOLD, 30));

        workouts.add(workout1);
        workouts.add(workout2);
        workouts.add(workout3);
        workouts.add(workout4);
        workouts.add(workout5);

        frame.add(workouts);
        frame.setVisible(true);

        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == workout1) {
                    System.exit(0);
                }
                if (e.getSource() == workout2) {
                    System.out.println("You selected Workout 2");
                }
                if (e.getSource() == workout3) {
                    System.exit(0);
                }
                if (e.getSource() == workout4) {
                    System.exit(0);
                }
                if (e.getSource() == workout5) {
                    System.exit(0);
                }
            }
        };

        workout1.addActionListener(a);
        workout2.addActionListener(a);
        workout3.addActionListener(a);
        workout4.addActionListener(a);
        workout5.addActionListener(a);
    }
}
