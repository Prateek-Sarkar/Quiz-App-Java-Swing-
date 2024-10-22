package Quiz;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener{
    JButton rules, back;
    JTextField tfname;
    login(){
        getContentPane().setBackground(Color.getHSBColor(0,46,100));
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/2.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);


        JLabel heading = new JLabel("Game of Brains");
        heading.setBounds(785,60,300,45);
        heading.setFont(new Font("Times New Roman",Font.BOLD,40));
        heading.setForeground(new Color(74, 144, 243));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(845,160,150,20);
        name.setFont(new Font("Montserrat",Font.BOLD,18));
        name.setForeground(new Color(74, 144, 243));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(820,200,200,20);
        tfname.setFont(new Font("Montserrat",Font.ITALIC,15));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(820,240,80,25);
        rules.setBackground(new Color(74,144,243));
        rules.setForeground(new Color(0xF8F856));
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(940,240,80,25);
        back.setBackground(new Color(74,144,243));
        back.setForeground(new Color(0xF8F856));
        back.addActionListener(this);
        add(back);





        setSize(1200,500);
        setLocation(150,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==rules){
            String name = tfname.getText();
            setVisible(false);
            new rules(name);
        } else if (ae.getSource()==back) {
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new login();
    }
}
