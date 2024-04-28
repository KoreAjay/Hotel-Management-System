/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system;


import javax.swing.*;
import java.awt.*;


public class AddCustomer extends JFrame{
    
    JComboBox  comboid;
    JTextField tfnumber;
    
    AddCustomer(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text=new JLabel("NEW CUSTOMER FROM");
        text.setBounds(100,20,300,30);
        text.setFont(new Font("Raleway",Font.PLAIN,20));
        add(text);
        
         JLabel lblid=new JLabel("ID");
        lblid.setBounds(35,80,100,20);
        lblid.setFont(new Font("Raleway",Font.PLAIN,20));
        add(lblid);
        
        String options[]={"Aadhar Card", "Passport","Driving License","Votar-id Card","Ration Card"};
        comboid =new JComboBox(options);
        comboid.setBounds(200,80,150,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
         JLabel lblnumber=new JLabel("Number");
        lblnumber.setBounds(35,120,100,20);
        lblnumber.setFont(new Font("Raleway",Font.PLAIN,20));
        add(lblnumber);
        
        tfnumber=new JTextField();
        tfnumber.setBounds(200,120,150,25);
        setBounds(350,200,800,550);
        setVisible(true);
    }
    public static void main(String []args){
        new AddCustomer();
    }
}
