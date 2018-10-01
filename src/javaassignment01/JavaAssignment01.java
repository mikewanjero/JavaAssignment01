package javaassignment01;

/**
 *
 * @author mike
 */
import java.awt.*;
import java.awt.*;
import javax.swing.*;
public class JavaAssignment01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame myframe;
        myframe = new JFrame("Login");
        JPanel mypanel=new JPanel();
        JLabel usernamelabel=new JLabel("Username: ");//Adding 
        JTextField username=new JTextField();
        username.setColumns(25);
        JLabel passwordlabel=new JLabel("Password: ");
        JTextField password=new JTextField();
        password.setColumns(25);
        JButton clear=new JButton("Clear");
        JButton login=new JButton("Login");
        JRadioButton malebutton=new JRadioButton("MALE");
        JRadioButton male=new JRadioButton();
        JRadioButton femalebutton=new JRadioButton("FEMALE");
        JRadioButton female=new JRadioButton();
        mypanel.add(usernamelabel);
        mypanel.add(username);
        mypanel.add(passwordlabel);
        mypanel.add(password);
        mypanel.add(clear);
        mypanel.add(login);
        myframe.add(mypanel);
        myframe.setSize(400,400);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
        
        
    }
    
}