
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JRadioButton savingAccount, fixDepositAccount, currentAccount, recuDepoAccount;
    JButton submit, cancel;
    JCheckBox atmCard, internetBanking, mobileBanking, emailAlerts, chequeBook, eStatement, declare;
    String formno;
    Signup3(String formno){
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);
        
        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        l2 = new JLabel("Account Type:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l4 = new JLabel("XXXX-XXXX-XXXX-4184");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
    
        l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("Raleway", Font.BOLD, 12));
    
        l10 = new JLabel("Services Required:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l11 = new JLabel("Form No:");
        l11.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l12 = new JLabel(formno);
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        
        
        atmCard = new JCheckBox("ATM CARD");
        atmCard.setBackground(Color.WHITE);
        atmCard.setFont(new Font("Raleway", Font.BOLD, 16));
        
        internetBanking = new JCheckBox("Internet Banking");
        internetBanking.setBackground(Color.WHITE);
        internetBanking.setFont(new Font("Raleway", Font.BOLD, 16));
        
        mobileBanking = new JCheckBox("Mobile Banking");
        mobileBanking.setBackground(Color.WHITE);
        mobileBanking.setFont(new Font("Raleway", Font.BOLD, 16));
        
        emailAlerts = new JCheckBox("EMAIL Alerts");
        emailAlerts.setBackground(Color.WHITE);
        emailAlerts.setFont(new Font("Raleway", Font.BOLD, 16));
        
        chequeBook = new JCheckBox("Cheque Book");
        chequeBook.setBackground(Color.WHITE);
        chequeBook.setFont(new Font("Raleway", Font.BOLD, 16));
        
        eStatement = new JCheckBox("E-Statement");
        eStatement.setBackground(Color.WHITE);
        eStatement.setFont(new Font("Raleway", Font.BOLD, 16));
        
        declare = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        declare.setBackground(Color.WHITE);
        declare.setFont(new Font("Raleway", Font.BOLD, 12));
         
        
        savingAccount = new JRadioButton("Saving Account");
        savingAccount.setFont(new Font("Raleway", Font.BOLD, 16));
        savingAccount.setBackground(Color.WHITE);
        
        fixDepositAccount = new JRadioButton("Fixed Deposit Account");
        fixDepositAccount.setFont(new Font("Raleway", Font.BOLD, 16));
        fixDepositAccount.setBackground(Color.WHITE);
        
        currentAccount = new JRadioButton("Current Account");
        currentAccount.setFont(new Font("Raleway", Font.BOLD, 16));
        currentAccount.setBackground(Color.WHITE);
        
        recuDepoAccount = new JRadioButton("Recurring Deposit Account");
        recuDepoAccount.setFont(new Font("Raleway", Font.BOLD, 16));
        recuDepoAccount.setBackground(Color.WHITE);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(savingAccount);
        groupgender.add(fixDepositAccount);
        groupgender.add(currentAccount);
        groupgender.add(recuDepoAccount);
        
        setLayout(null);
        
        l11.setBounds(700,10,70,30);
        add(l11);
        
        l12.setBounds(770,10,40,30);
        add(l12);
        
        l1.setBounds(280,40,400,40);
        add(l1); 
        
        l2.setBounds(100,140,200,30);
        add(l2);
        
        savingAccount.setBounds(100,180,150,30);
        add(savingAccount);
        
        fixDepositAccount.setBounds(350,180,300,30);
        add(fixDepositAccount);
        
        currentAccount.setBounds(100,220,250,30);
        add(currentAccount);
        
        recuDepoAccount.setBounds(350,220,250,30);
        add(recuDepoAccount);
        
        l3.setBounds(100,300,200,30);
        add(l3);
        
        l4.setBounds(330,300,250,30);
        add(l4);
        
        l5.setBounds(100,330,200,20);
        add(l5);
        
        l6.setBounds(330,330,500,20);
        add(l6);
        
        l7.setBounds(100,370,200,30);
        add(l7);
        
        l8.setBounds(330,370,200,30);
        add(l8);
        
        l9.setBounds(100,400,200,20);
        add(l9);
        
        l10.setBounds(100,450,200,30);
        add(l10);
        
        atmCard.setBounds(100,500,200,30);
        add(atmCard);
        
        internetBanking.setBounds(350,500,200,30);
        add(internetBanking);
        
        mobileBanking.setBounds(100,550,200,30);
        add(mobileBanking);
        
        emailAlerts.setBounds(350,550,200,30);
        add(emailAlerts);
        
        chequeBook.setBounds(100,600,200,30);
        add(chequeBook);
        
        eStatement.setBounds(350,600,200,30);
        add(eStatement);
        
        declare.setBounds(100,680,600,20);
        add(declare);
        
        submit.setBounds(250,720,100,30);
        add(submit);
        
        cancel.setBounds(420,720,100,30);
        add(cancel);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850);
        setLocation(500,40);
        setVisible(true);
        
        submit.addActionListener(this);
        cancel.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String atype = null;
        if(savingAccount.isSelected()){ 
            atype = "Saving Account";
        }
        else if(fixDepositAccount.isSelected()){ 
            atype = "Fixed Deposit Account";
        }
        else if(currentAccount.isSelected()){ 
            atype = "Current Account";
        }else if(recuDepoAccount.isSelected()){ 
            atype = "Recurring Deposit Account";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardnumber = "" + Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
        String facility = "";
        if(atmCard.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(internetBanking.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(mobileBanking.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(emailAlerts.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(chequeBook.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(eStatement.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        try{
            if(ae.getSource()==submit){
                
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardnumber+"','"+pin+"','"+facility+"')";  
                    String q2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pin+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin:"+ pin);
                    
                    
                    new Login().setVisible(true);
                    setVisible(false);
                }
            
            }else if(ae.getSource()==cancel){
                System.exit(0);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Signup3("").setVisible(true);
    }
    
}


