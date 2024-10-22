package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rules extends JFrame implements ActionListener {
    JButton back, start;
    String name;
    rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.getHSBColor(0,46,100));
        setLayout(null);

        JLabel heading = new JLabel("Welcome "+name+" to Game of Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Times New Roman",Font.BOLD,28));
        heading.setForeground(new Color(74, 144, 243));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Montserrat",Font.PLAIN,16));
        rules.setForeground(new Color(74, 144, 243));
        rules.setText(
            "<html>"+
                    "1. Time Limit: Each participant must complete the quiz within the specified time limit. No extra time will be granted once the timer ends."+"<br><br>"+

                    "2. No Cheating: Participants are not allowed to use any external resources, including books, notes, internet searches, or assistance from others during the quiz."+"<br><br>"+

                    "3. Answer Submission: All answers must be submitted through the designated platform or method by the end of the quiz. Late submissions will not be accepted."+"<br><br>"+

                    "4. Scoring and Tie-breaking: Points will be awarded for each correct answer. In case of a tie, additional tie-breaking questions or criteria will be used to determine the winner."+"<br><br>"+

                    "5. Behavior and Conduct: Participants must maintain a respectful and quiet environment to avoid disturbing others. Any disruptive behavior may lead to disqualification."+"<br><br>"+
            "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(74,144,243));
        back.setForeground(new Color(0xF8F856));
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(74,144,243));
        start.setForeground(new Color(0xF8F856));
        start.addActionListener(this);
        add(start);

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==start){
            setVisible(false);
            new quiz(name);

        } else if (ae.getSource()==back) {
            setVisible(false);
            new login();
        }
    }
    public static void main (String[] args){
        new rules("User");
    }
}
