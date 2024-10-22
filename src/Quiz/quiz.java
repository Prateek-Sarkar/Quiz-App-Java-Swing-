package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class quiz extends JFrame implements ActionListener {

    String questions [][] = new String[10][5];
    String answers [][] = new String[10][2];
    String userAnswer[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup groupoptions;
    JButton next,lifeline,submit;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String name;
    quiz(String name){
        this.name = name;
        setBounds(50,0,1440,850);
        getContentPane().setBackground(Color.getHSBColor(0,46,100));
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/bg2.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1440,392);
        add(image);

        qno = new JLabel("");
        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
        qno.setBounds(100,450,50,30);
        add(qno);

        question = new JLabel("");
        question.setFont(new Font("Tahoma",Font.PLAIN,24));
        question.setBounds(150,450,900,30);
        add(question);

        questions[0][0] = "Which social media platform was founded by Mark Zuckerberg in 2004?";
        questions[0][1] = "Twitter";
        questions[0][2] = "Instagram";
        questions[0][3] = "Facebook";
        questions[0][4] = "LinkedIn";

        questions[1][0] = "What does SEO stand for in internet marketing?";
        questions[1][1] = "Social Engine Optimization";
        questions[1][2] = "Search Engine Optimization";
        questions[1][3] = "Site Engine Operation";
        questions[1][4] = "Site Enhancement Operations";

        questions[2][0] = "Who is known as the father of modern computer science?";
        questions[2][1] = "Alan Turing";
        questions[2][2] = "Charles Babbage";
        questions[2][3] = "Ada Lovelace";
        questions[2][4] = "John von Neumann";

        questions[3][0] = "Which Indian state is known as the Land of the Seven Sisters?";
        questions[3][1] = "Arunachal Pradesh";
        questions[3][2] = "Mizoram";
        questions[3][3] = "Himachal Pradesh";
        questions[3][4] = "Assam";

        questions[4][0] = "Which is the longest bone in the human body?";
        questions[4][1] = "Tibia";
        questions[4][2] = "Ear";
        questions[4][3] = "Femur";
        questions[4][4] = "Humerus";

        questions[5][0] = "What is the largest organ in the human body?";
        questions[5][1] = "Liver";
        questions[5][2] = "Heart";
        questions[5][3] = "skin";
        questions[5][4] = "Hair";

        questions[6][0] = "Which country hosted the first modern Olympic Games?";
        questions[6][1] = "Greece";
        questions[6][2] = "USA";
        questions[6][3] = "Germany";
        questions[6][4] = "France";

        questions[7][0] = "Who developed the theory of relativity?";
        questions[7][1] = "Isaac Newton";
        questions[7][2] = "Albert Einstein";
        questions[7][3] = "Galileo Galilei";
        questions[7][4] = "Stephen Hawking";

        questions[8][0] = "In Greek mythology, who is the king of the gods?";
        questions[8][1] = "Zeus";
        questions[8][2] = "Poseidon";
        questions[8][3] = "Hades";
        questions[8][4] = "Hercules";

        questions[9][0] = "Which country gifted the Statue of Liberty to the United States?";
        questions[9][1] = "India";
        questions[9][2] = "United Kingdom";
        questions[9][3] = "France";
        questions[9][4] = "Germany";



        answers[0][1] = "Facebook";
        answers[1][1] = "Search Engine Optimization";
        answers[2][1] = "Alan Turing";
        answers[3][1] = "Assam";
        answers[4][1] = "Femur";
        answers[5][1] = "Skin";
        answers[6][1] = "Greece";
        answers[7][1] = "Albert Einstein";
        answers[8][1] = "Zeus";
        answers[9][1] = "France";

        opt1 = new JRadioButton(" ");
        opt1.setBounds(170,520,700,30);
        opt1.setBackground(Color.getHSBColor(0,46,100));
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        opt1.setForeground(new Color(74, 144, 243));
        add(opt1);

        opt2 = new JRadioButton(" ");
        opt2.setBounds(170,560,700,30);
        opt2.setBackground(Color.getHSBColor(0,46,100));
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        opt2.setForeground(new Color(74, 144, 243));
        add(opt2);

        opt3 = new JRadioButton(" ");
        opt3.setBounds(170,600,700,30);
        opt3.setBackground(Color.getHSBColor(0,46,100));
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        opt3.setForeground(new Color(74, 144, 243));
        add(opt3);

        opt4 = new JRadioButton(" ");
        opt4.setBounds(170,640,700,30);
        opt4.setBackground(Color.getHSBColor(0,46,100));
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        opt4.setForeground(new Color(74, 144, 243));
        add(opt4);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        next = new JButton("Next");
        next.setBounds(1100,550,200,40);
        next.setFont(new Font("Tahoma",Font.BOLD,22));
        next.setBackground(new Color(74, 144, 243));
        next.setForeground(Color.getHSBColor(0,46,100));
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("50-50 LifeLine");
        lifeline.setBounds(1100,630,200,40);
        lifeline.setFont(new Font("Tahoma",Font.BOLD,22));
        lifeline.setBackground(new Color(74, 144, 243));
        lifeline.setForeground(Color.getHSBColor(0,46,100));
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(1100,710,200,40);
        submit.setFont(new Font("Tahoma",Font.BOLD,22));
        submit.setBackground(new Color(74, 144, 243));
        submit.setForeground(Color.getHSBColor(0,46,100));
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);

        start(count);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if(groupoptions.getSelection()== null){
                userAnswer[count][0] = "";
            }else {
                userAnswer[count][0] = groupoptions.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }else if (ae.getSource() == submit){
            ans_given = 1;
            if(groupoptions.getSelection()== null){
                userAnswer[count][0] = "";
            }else {
                userAnswer[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < userAnswer.length; i++) {
                if (userAnswer[i][0].equals(answers[i][1])) {
                    score += 10;
                }else {
                    score += 0;
                }
            }
            setVisible(false);
            new score(name,score);
        }
    }

    public void paint(Graphics g){
        super.paint(g);

        String time = "Time Left - " + timer + "seconds"; //15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma",Font.BOLD,19));

        if(timer > 0){
            g.drawString(time, 1100,500);
        }else {
            g.drawString("Times Up!!", 1100,500);

        }
        timer--; //14

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e){
            e.printStackTrace();
        }

        if (ans_given == 1){
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) {  //Sumbit button
                if(groupoptions.getSelection()== null){
                    userAnswer[count][0] = "";
                }else {
                    userAnswer[count][0] = groupoptions.getSelection().getActionCommand();
                }

                for (int i = 0; i < userAnswer.length; i++) {
                    if (userAnswer[i][0].equals(answers[i][1])) {
                        score += 10;
                    }else {
                        score += 0;
                    }
                }
                setVisible(false);
                // Score
                new score(name,score);
            }else{  // next button
                if(groupoptions.getSelection()== null){
                    userAnswer[count][0] = "";
                }else {
                    userAnswer[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 --> 1
                start(count);
            }


        }


    }
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
    }

    public static void main( String[] args){
        new quiz("User");
    }
}
