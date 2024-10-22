package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class score extends JFrame implements ActionListener {

    score(String name, int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/score1.png"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);

        JLabel heading = new JLabel("Thank you "+ name +" for playing!!");
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        heading.setBounds(45,30,700,30);
        add(heading);

        JLabel Gscore = new JLabel("Your score is "+score);
        Gscore.setFont(new Font("Tahoma",Font.PLAIN,26));
        Gscore.setBounds(350,200,300,30);
        add(Gscore);

        JButton playAgain = new JButton("Play Again");
        playAgain.setBounds(380,270,120,30);
        playAgain.setBackground(new Color(74, 144, 243));
        playAgain.setForeground(Color.getHSBColor(0,46,100));
        playAgain.addActionListener(this);
        add(playAgain);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new login();
    }

    public static void main(String[] args){
        new score("User",0);
    }
}
