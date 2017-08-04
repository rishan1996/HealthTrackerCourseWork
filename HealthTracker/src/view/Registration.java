package view;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Registration extends JFrame{

    public static void main(String[] args){

        new Registration();

    }

    public Registration(){

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
