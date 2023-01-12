package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transactions extends JFrame implements ActionListener{

    JLabel l1;
    JButton deposit, cashWithdrawl, fastCash, miniStatement, pinChange, balanceEnq, exit;
    String pin;
    Transactions(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 960, 1080);
        add(l2);
        
        l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
       
        deposit = new JButton("DEPOSIT");
        cashWithdrawl = new JButton("CASH WITHDRAWL");
        fastCash = new JButton("FAST CASH");
        miniStatement = new JButton("MINI STATEMENT");
        pinChange = new JButton("PIN CHANGE");
        balanceEnq = new JButton("BALANCE ENQUIRY");
        exit = new JButton("EXIT");
        
        setLayout(null);
        
        l1.setBounds(235,400,700,35);
        l2.add(l1);
        
        deposit.setBounds(170,499,150,35);
        l2.add(deposit);
        
        cashWithdrawl.setBounds(390,499,150,35);
        l2.add(cashWithdrawl);
        
        fastCash.setBounds(170,543,150,35);
        l2.add(fastCash);
        
        miniStatement.setBounds(390,543,150,35);
        l2.add(miniStatement);
        
        pinChange.setBounds(170,588,150,35);
        l2.add(pinChange);
        
        balanceEnq.setBounds(390,588,150,35);
        l2.add(balanceEnq);
        
        exit.setBounds(390,633,150,35);
        l2.add(exit);
        
        
        deposit.addActionListener(this);
        cashWithdrawl.addActionListener(this);
        fastCash.addActionListener(this);
        miniStatement.addActionListener(this);
        pinChange.addActionListener(this);
        balanceEnq.addActionListener(this);
        exit.addActionListener(this);
        
        
        setSize(960,1080);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){ 
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }else if(ae.getSource()==cashWithdrawl){ 
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
        }else if(ae.getSource()==fastCash){ 
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }else if(ae.getSource()==miniStatement){ 
            new MiniStatement(pin).setVisible(true);
        }else if(ae.getSource()==pinChange){ 
            setVisible(false);
            new Pin(pin).setVisible(true);
        }else if(ae.getSource()==balanceEnq){ 
            this.setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }else if(ae.getSource()==exit){ 
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        new Transactions("").setVisible(true);
    }
}