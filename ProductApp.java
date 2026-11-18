// Creating a class to store information about the mattress sales
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductApp{ 
public static void main(String[] args) {
//Creating the main window for the JFrame
JFrame frame = new JFrame("Information Capture");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(350,220);
frame.setLayout(new GridLayout(4,2,10,10));

// Creating labels and input boxes
JLabel nameLabel = new Label(" Customer Name:");
JTextField nameField = new JTextField();

JLabel productLabel = new Label(" Product Name:");
String[] roles = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
JComboBox<String> productDropdown = new JComboBox<>(products);

Jlabel 




}



}