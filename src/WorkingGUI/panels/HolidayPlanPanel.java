package WorkingGUI.panels;

import Assignment2OOP.HolidayPlan;
import WorkingGUI.Panel;
import WorkingGUI.extraFiles.DataContainer;
import WorkingGUI.workingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HolidayPlanPanel extends Panel {
    private JButton button1;
    private JTextField field1,field2,field3,field4,field5,field6;
    private JLabel label1,label2,label3,label4,label5,label6,label7;

    private HolidayPlan plan;

    private String nameHP,dateHP,idHP,destinationHP;
    public HolidayPlanPanel(JFrame frame, DataContainer dataContainer){//constructor
        super(frame,dataContainer);
        frame.add(this);
        this.setLayout(null);// no layout
        this.setBackground(Color.pink);
        this.setBorder(BorderFactory.createLineBorder(Color.magenta,5));//ser border color and thickness
        this.setBounds(0,0,750,770);//set location and size


        getFields();//call method
        getLabels();//call method
        getButtons();//call method

        this.setVisible(false);

    }
    public void getButtons(){//Buttons settings
        button1=new JButton("Click to Accept");
        //button1.addActionListener(this);// this add action to button ( when user click button)
        button1.setBounds(306,700,150,50);//set location and size

        this.add(button1);

    }
    public void getFields(){//TextFields settings
        field1=new JTextField();
        field1.setText("Write here");//set text - Name
        field1.setBounds(306,60,200,50);//set location and size
        field1.setBackground(Color.black);
        field1.setForeground(new Color(0x00FF00));
        field1.setFont(new Font("Consolas",Font.PLAIN,35));// change font   is changing size of text

        field2=new JTextField();
        field2.setText("DD");//set text - number of Days
        field2.setBounds(306,160,100,50);//set location and size
        field2.setBackground(Color.black);
        field2.setForeground(new Color(0x00FF00));
        field2.setFont(new Font("Consolas",Font.PLAIN,35));// change font   is changing size of text

        field3=new JTextField();
        field3.setText("Type Here");//set text - ID number
        field3.setBounds(306,6,200,50);//set location and size
        field3.setBackground(Color.black);
        field3.setForeground(new Color(0x00FF00));
        field3.setFont(new Font("Consolas",Font.PLAIN,35));// change font   is changing size of text

        field4=new JTextField();
        field4.setText("...");//set text - destination
        field4.setBounds(306,110,200,50);//set location and size
        field4.setBackground(Color.black);
        field4.setForeground(new Color(0x00FF00));
        field4.setFont(new Font("Consolas",Font.PLAIN,35));// change font   is changing size of text

        field5=new JTextField();
        field5.setText("MM");//set text - number of Months
        field5.setBounds(306,220,100,50);//set location and size
        field5.setBackground(Color.black);
        field5.setForeground(new Color(0x00FF00));
        field5.setFont(new Font("Consolas",Font.PLAIN,35));// change font   is changing size of text

        field6=new JTextField();
        field6.setText("YYYY");//set text- Year
        field6.setBounds(306,280,100,50);//set location and size
        field6.setBackground(Color.black);
        field6.setForeground(new Color(0x00FF00));
        field6.setFont(new Font("Consolas",Font.PLAIN,35));// change font   is changing size of text




        this.add(field1);
        this.add(field2);
        this.add(field3);
        this.add(field4);
        this.add(field5);
        this.add(field6);

    }
    public void getLabels(){//Labels settings
        label1=new JLabel("Name :");
        label1.setBounds(6,60,300,50);//set location and size
        label1.setBackground(Color.GREEN);
        label1.setFont(new Font("MV Boli",Font.ROMAN_BASELINE,25));//set font and size
        label1.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        label1.setOpaque(true);
        label1.setHorizontalTextPosition(JLabel.CENTER);

        label2=new JLabel("Day of Birth :");
        label2.setBounds(6,160,300,50);//set location and size
        label2.setBackground(Color.GREEN);
        label2.setFont(new Font("MV Boli",Font.ROMAN_BASELINE,25));//set font and size
        label2.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        label2.setOpaque(true);
        label2.setHorizontalTextPosition(JLabel.CENTER);

        label3=new JLabel("ID number :");
        label3.setBounds(6,6,300,50);//set location and size
        label3.setBackground(Color.GREEN);
        label3.setFont(new Font("MV Boli",Font.ROMAN_BASELINE,25));//set font and size
        label3.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        label3.setOpaque(true);
        label3.setHorizontalTextPosition(JLabel.CENTER);

        label4=new JLabel("Your Destination is ? :");
        label4.setBounds(6,110,300,50);//set location and size
        label4.setBackground(Color.GREEN);
        label4.setFont(new Font("MV Boli",Font.ROMAN_BASELINE,25));//set font and size
        label4.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        label4.setOpaque(true);
        label4.setHorizontalTextPosition(JLabel.CENTER);

        label5=new JLabel("Month of Birth :");
        label5.setBounds(6,220,300,50);//set location and size
        label5.setBackground(Color.GREEN);
        label5.setFont(new Font("MV Boli",Font.ROMAN_BASELINE,25));//set font and size
        label5.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        label5.setOpaque(true);
        label5.setHorizontalTextPosition(JLabel.CENTER);

        label6=new JLabel("Year of Birth :");
        label6.setBounds(6,280,300,50);//set location and size
        label6.setBackground(Color.GREEN);
        label6.setFont(new Font("MV Boli",Font.ROMAN_BASELINE,25));//set font and size
        label6.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        label6.setOpaque(true);
        label6.setHorizontalTextPosition(JLabel.CENTER);

        label7=new JLabel(" Enter the details of the person planning the holiday.");
        label7.setBounds(6,400,738,100);//set location and size
        label7.setBackground(Color.orange);
        label7.setFont(new Font("MV Boli",Font.BOLD,25));//set font and size
        label7.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        label7.setOpaque(true);
        label6.setHorizontalTextPosition(JLabel.CENTER);




        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(label5);
        this.add(label6);
        this.add(label7);
    }
    public String returnDateDoB(){//method to return String date format
        String day,month,year,str;
        day=getField2().getText();
        month=getField5().getText();
        year=getField6().getText();
        str=day+"/"+month+"/"+year;
        return str;
    }

    @Override
    public void actionPerformed(ActionEvent e) {



    }
    @Override
    public void setVisible(){
        this.setVisible(false);
    }
    public String getDate() {
        return dateHP;
    }

    public void setDate(String date) {
        this.dateHP = date;
    }

    @Override
    public String getName() {
        return nameHP;
    }

    @Override
    public void setName(String name) {
        this.nameHP = name;
        dataContainer.setHPname(nameHP);
    }

    public String getId() {
        return idHP;
    }

    public void setId(String id) {
        this.idHP = id;
        dataContainer.setHPid(idHP);
    }

    public String getDestination() {
        return destinationHP;
    }

    public HolidayPlan getPlan() {
        return plan;
    }

    public void setPlan(HolidayPlan plan) {
        this.plan = plan;
    }

    public void setDestination(String destination) {
        this.destinationHP = destination;
        dataContainer.setHPdestination(destinationHP);
    }

    public JTextField getField1() {
        return field1;
    }

    public void setField1(JTextField field1) {
        this.field1 = field1;
    }

    public JTextField getField2() {
        return field2;
    }

    public void setField2(JTextField field2) {
        this.field2 = field2;
    }

    public JTextField getField3() {
        return field3;
    }

    public void setField3(JTextField field3) {
        this.field3 = field3;
    }

    public JTextField getField4() {
        return field4;
    }

    public void setField4(JTextField field4) {
        this.field4 = field4;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JTextField getField5() {
        return field5;
    }

    public void setField5(JTextField field5) {
        this.field5 = field5;
    }

    public JTextField getField6() {
        return field6;
    }

    public void setField6(JTextField field6) {
        this.field6 = field6;
    }


}
