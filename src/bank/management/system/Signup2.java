package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup2 extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JTextField panNo, adhar;
    JComboBox religionB, categoryB, incomeB, educationB, occupationB;
    String formno;
    Signup2(String formno){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);
        
        
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        l1 = new JLabel("Page 2: Additonal Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        l2 = new JLabel("Religion:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l3 = new JLabel("Category:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l4 = new JLabel("Income:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l5 = new JLabel("Educational");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l11 = new JLabel("Qualification:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l6 = new JLabel("Occupation:");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l7 = new JLabel("PAN Number:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l8 = new JLabel("Aadhar Number:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l9 = new JLabel("Senior Citizen:");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 13));
        
        l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 13));
        
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        
        panNo = new JTextField();
        panNo.setFont(new Font("Raleway", Font.BOLD, 14));
        
        adhar = new JTextField();
        adhar.setFont(new Font("Raleway", Font.BOLD, 14));
        
        syes = new JRadioButton("Yes");
        syes.setFont(new Font("Raleway", Font.BOLD, 14));
        syes.setBackground(Color.WHITE);
        
        sno = new JRadioButton("No");
        sno.setFont(new Font("Raleway", Font.BOLD, 14));
        sno.setBackground(Color.WHITE);
        
        eyes = new JRadioButton("Yes");
        eyes.setFont(new Font("Raleway", Font.BOLD, 14));
        eyes.setBackground(Color.WHITE);
        
        eno = new JRadioButton("No");
        eno.setFont(new Font("Raleway", Font.BOLD, 14));
        eno.setBackground(Color.WHITE);
        
        
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        this.religionB = new JComboBox(religion);
        this.religionB.setBackground(Color.WHITE);
        this.religionB.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String category[] = {"General","OBC","SC","ST","Other"};
        this.categoryB = new JComboBox(category);
        this.categoryB.setBackground(Color.WHITE);
        this.categoryB.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        this.incomeB = new JComboBox(income);
        this.incomeB.setBackground(Color.WHITE);
        this.incomeB.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        this.educationB = new JComboBox(education);
        this.educationB.setBackground(Color.WHITE);
        this.educationB.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        this.occupationB = new JComboBox(occupation);
        this.occupationB.setBackground(Color.WHITE);
        this.occupationB.setFont(new Font("Raleway", Font.BOLD, 14));
       
        
        setLayout(null);
        
        
        l12.setBounds(700,10,60,30);
        add(l12);
        
        l13.setBounds(760,10,60,30);
        add(l13);
        
        l1.setBounds(280,30,600,40);
        add(l1);
        
        l2.setBounds(100,120,100,30);
        add(l2);
        
        this.religionB.setBounds(350,120,320,30);
        add(this.religionB);
        
        l3.setBounds(100,170,100,30);
        add(l3);
        
        this.categoryB.setBounds(350,170,320,30);
        add(this.categoryB);
        
        l4.setBounds(100,220,100,30);
        add(l4);
        
        this.incomeB.setBounds(350,220,320,30);
        add(this.incomeB);
        
        l5.setBounds(100,270,150,30);
        add(l5);
        
        this.educationB.setBounds(350,270,320,30);
        add(this.educationB);
        
        l11.setBounds(100,290,150,30);
        add(l11);
        
        l6.setBounds(100,340,150,30);
        add(l6);
        
        this.occupationB.setBounds(350,340,320,30);
        add(this.occupationB);
        
        l7.setBounds(100,390,150,30);
        add(l7);
        
        panNo.setBounds(350,390,320,30);
        add(panNo);
        
        l8.setBounds(100,440,180,30);
        add(l8);
        
        adhar.setBounds(350,440,320,30);
        add(adhar);
        
        l9.setBounds(100,490,150,30);
        add(l9);
        
        syes.setBounds(350,490,100,30);
        add(syes);
        
        sno.setBounds(460,490,100,30);
        add(sno);
        
        l10.setBounds(100,540,180,30);
        add(l10);
        
        eyes.setBounds(350,540,100,30);
        add(eyes);
        
        eno.setBounds(460,540,100,30);
        add(eno);
        
        next.setBounds(570,640,100,30);
        add(next);
        
        next.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,750);
        setLocation(500,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String religion = (String)this.religionB.getSelectedItem(); 
        String category = (String)this.categoryB.getSelectedItem();
        String income = (String)this.incomeB.getSelectedItem();
        String education = (String)this.educationB.getSelectedItem();
        String occupation = (String)this.occupationB.getSelectedItem();
        
        String pan = panNo.getText();
        String aadhar = adhar.getText();
        
        String scitizen = "";
        if(syes.isSelected()){ 
            scitizen = "Yes";
        }
        else if(sno.isSelected()){ 
            scitizen = "No";
        }
           
        String eaccount = "";
        if(eyes.isSelected()){ 
            eaccount = "Yes";
        }else if(eno.isSelected()){ 
            eaccount = "No";
        }
        
        try{
            if(adhar.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signup2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c1.s.executeUpdate(q1);
                
                new Signup3(formno).setVisible(true);
                setVisible(false);
            }
                
      
            
        }catch(Exception ex){
             ex.printStackTrace();
        }
    
               
    }
    
    
    public static void main(String[] args){
        new Signup2("").setVisible(true);
    }
}
