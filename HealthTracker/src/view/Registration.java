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
import javax.swing.border.Border;

public class Registration extends JFrame{

    public static void main(String[] args){

        new Registration();

    }

    public Registration(){

        //The panels
        JPanel p_registration = new JPanel();
        JPanel p_buttons = new JPanel();
        JPanel p_userName = new JPanel();
        JPanel p_password = new JPanel();
        JPanel p_passConfirm = new JPanel();
        JPanel p_firstName = new JPanel();
        JPanel p_surname = new JPanel();
        JPanel p_email = new JPanel();
        JPanel p_height = new JPanel();
        JPanel p_weight = new JPanel();
        JPanel p_age = new JPanel();


        Border mainBorder = BorderFactory.createTitledBorder("Registration");
        Border defaultBorder = BorderFactory.createTitledBorder("");


        //Set the borders for the panels
        p_registration.setBorder(mainBorder);
        p_buttons.setBorder(defaultBorder);
        p_userName.setBorder(defaultBorder);
        p_password.setBorder(defaultBorder);
        p_passConfirm.setBorder(defaultBorder);
        p_firstName.setBorder(defaultBorder);
        p_surname.setBorder(defaultBorder);
        p_email.setBorder(defaultBorder);
        p_height.setBorder(defaultBorder);
        p_weight.setBorder(defaultBorder);
        p_age.setBorder(defaultBorder);


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

        JTextField tf_firstName = new JTextField("", 12);
        tf_firstName.setToolTipText("Enter your first name");

        JTextField tf_surname = new JTextField("", 12);
        tf_surname.setToolTipText("Enter your surname");

        JTextField tf_email = new JTextField("", 12);
        tf_email.setToolTipText("Enter your email address");

        JTextField tf_height = new JTextField("", 12);
        tf_height.setToolTipText("Enter your height");

        JTextField tf_weight = new JTextField("", 12);
        tf_weight.setToolTipText("Enter your weight");

        JTextField tf_age = new JTextField("", 12);
        tf_age.setToolTipText("Enter your age");


        //The buttons
        JButton b_cancel = new JButton("Cancel");
        b_cancel.setToolTipText("Press to cancel registration and to return to the login screen");

        JButton b_register = new JButton("Register");
        b_register.setToolTipText("Press to complete registration");


        //Add the labels to the panels
        p_userName.add(l_userName);
        p_userName.add(tf_userName);

        p_password.add(l_password);
        p_password.add(tf_password);

        p_passConfirm.add(l_passConfirm);
        


        //Add the text fields
        p_registration.add(tf_userName);
        p_registration.add(tf_password);
        p_registration.add(tf_passConfirm);


        //Add the buttons to the panel
        p_buttons.add(b_cancel);
        p_buttons.add(b_register);


        //Add the buttons panel to the main panel
        p_registration.add(p_buttons);


        //Add the panel to the frame
        this.add(p_registration);

        //Set the size of the frame
        this.setSize(400, 600);
        //Center the frame
        this.setLocationRelativeTo(null);
        //Make the frame not resizeable
        this.setResizable(false);
        //Set the title of the frame
        this.setTitle("Health Tracker");

        //Show the frame
        this.setVisible(true);


        //Exit when close button is clicked
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
