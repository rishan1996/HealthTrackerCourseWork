package view;

/**************************
 *        Legend          *
 *------------------------*
 *     p_ = panel         *
 *     l_ = label         *
 *     b_ = button        *
 *   tf_ = text field     *
 *************************/

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Registration extends JFrame{

    public static void main(String[] args){

        new Registration();

    }

    public Registration(){

        //The main panel
        JPanel p_registration = new JPanel();

        //Title label
        JLabel l_title = new JLabel("Registration");
        //Labels for the text fields
        JLabel l_userName = new JLabel("Username: ");
        JLabel l_password = new JLabel("Password: ");
        JLabel l_passConfirm = new JLabel("Confirm Password: ");
        JLabel l_firstName = new JLabel("First Name: ");
        JLabel l_surname = new JLabel("Surname: ");
        JLabel l_email = new JLabel("Email Address: ");
        JLabel l_height = new JLabel("Height: ");
        JLabel l_weight = new JLabel("Weight: ");
        JLabel l_age = new JLabel("Age: ");

        //The text fields
        JTextField tf_userName = new JTextField("", 12);
        tf_userName.setToolTipText("Enter preferred username");
        JTextField tf_password = new JTextField("", 12);
        tf_password.setToolTipText("Enter preferred password");
        JTextField tf_passConfirm = new JTextField("", 12);
        tf_passConfirm.setToolTipText("Confirm your password");

        //The buttons
        JButton b_cancel = new JButton("Cancel");
        b_cancel.setToolTipText("Press to cancel registration and to return to the login screen");
        JButton b_register = new JButton("Register");
        b_register.setToolTipText("Press to complete registration");

        //Add the label to the panel
        p_registration.add(l_title);
        p_registration.add(l_userName);
        p_registration.add(l_password);
        p_registration.add(l_passConfirm);
        p_registration.add(l_firstName);
        p_registration.add(l_surname);
        p_registration.add(l_email);
        p_registration.add(l_height);
        p_registration.add(l_weight);
        p_registration.add(l_age);

        //Add the text fields
        p_registration.add(tf_userName);
        p_registration.add(tf_password);
        p_registration.add(tf_passConfirm);

        //Add the buttons to the panel
        p_registration.add(b_cancel);
        p_registration.add(b_register);

        //Add the panel to the frame
        this.add(p_registration);

        //Set the size of the window
        this.setSize(400, 600);
        //Center the window
        this.setLocationRelativeTo(null);
        //Make the window not resizeable
        this.setResizable(false);
        //Set the title of the window
        this.setTitle("Registration");

        //Show the window
        this.setVisible(true);
        

        //Exit when close button is clicked
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
