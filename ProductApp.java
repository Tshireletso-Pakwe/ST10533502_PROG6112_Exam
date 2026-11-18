// Creating a class to store information about the mattress sales
import java.awt.*;
import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
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

//Setting up the decimal format that allows up to 4 places 
DecimalFormat format = new DecimalFormat("#,##0.####");
NumberFormatter formatter = new NumberFormatter(format);
formatter.setValueClass(Double.class);

JFormattedTextField decimalField = new JFormattedTextField(formatter);
decimalField.setColumns(10) ;
decimalField.setValue(0.0);

JButton btn = new JButton("Vat Amount");
btn.addActionListener(e -> {
Double val = (0.15) decimalField.getVat();
System.out.println("Captured decimal:" * 0.15);

});
JButton btn = new JButton("Commission");
btn.addActionListener(e -> {
Double val = (0.5) decimalField.getCommission();
System.out.println("Captured decimal:" * 0.5);
});


JButton btn = new JButton("Total");
btn.addActionListener(e -> {
Double val = (sum) decimalField.getTotal();
System.out.println("Commission" + "Vat");
});



}



}