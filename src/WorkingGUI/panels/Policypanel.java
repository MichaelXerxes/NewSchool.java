package WorkingGUI.panels;

import Assignment2OOP.HolidayPlan;
import Assignment2OOP.Policy;
import WorkingGUI.Panel;
import WorkingGUI.extraFiles.DataContainer;
import WorkingGUI.workingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Policypanel extends Panel {
    private JButton button1, button2;
    private JTextField field1, field2, field3, field4, field5, fieldSmonth, fieldSyear, fieldEmonth, fieldEyear, fieldSday, fieldEday;
    private JLabel label1, label2, label3, label4, label5, labelSmonth, labelSyear, labelEmonth, labelEyear, labelSday, labelEday;
    private JPanel panel2;
    private String name, date, id, Sdate, Edate;

    public Policypanel(JFrame frame, DataContainer dataContainer) {//constructor
        super(frame, dataContainer);
        frame.add(this);
        this.setLayout(null);// no layout
        this.setBackground(Color.pink);
        this.setBorder(BorderFactory.createLineBorder(Color.magenta, 5));//ser border color and thickness
        this.setBounds(0, 0, 750, 770);//set location and size

        getExtraPanels();
        getFields();
        getLabels();
        getButtons();
        addToPanel2();

        this.setVisible(false);
    }

    public void getExtraPanels() {//panel 2 settings
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2, 6));
        panel2.setBackground(Color.BLUE);
        panel2.setBorder(BorderFactory.createLineBorder(Color.orange, 5));
        panel2.setBounds(6, 420, 738, 150);
        //panel2.setVisible(false);
        this.add(panel2);


    }

    public void addToPanel2() {//method where objects add to panel2 in correct order
        panel2.add(labelSday);
        panel2.add(fieldSday);
        panel2.add(labelSmonth);
        panel2.add(fieldSmonth);
        panel2.add(labelSyear);
        panel2.add(fieldSyear);
        panel2.add(labelEday);
        panel2.add(fieldEday);
        panel2.add(labelEmonth);
        panel2.add(fieldEmonth);
        panel2.add(labelEyear);
        panel2.add(fieldEyear);

    }

    public void getButtons() {//Buttons settings
        button2 = new JButton("Click to Accept Policy details");
        button2.addActionListener(this);// this add action to button ( when user click button)
        button2.setBounds(276, 700, 250, 50);//set location and size

        button1 = new JButton("TEst Test");//tetst ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬!!!!!!
        button1.addActionListener(this);// this add action to button ( when user click button)
        button1.setBounds(6, 6, 100, 50);//set location and size
        this.add(button2);
        //panel2.add(button1);

    }

    public void getFields() {//TextFields settings
        // Policy owner Name
        field1 = new JTextField();
        field1.setText("Write here");//set text
        field1.setBounds(306, 60, 200, 50);//set location and size
        field1.setBackground(Color.black);
        field1.setForeground(new Color(0x00FF00));
        field1.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text
        //   Policy owner DoB Day
        field2 = new JTextField();
        field2.setText("DD");//set text
        field2.setBounds(306, 110, 100, 50);//set location and size
        field2.setBackground(Color.black);
        field2.setForeground(new Color(0x00FF00));
        field2.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text
        //   Policy ID
        field3 = new JTextField();
        field3.setText("ID");//set text
        field3.setBounds(306, 6, 100, 50);//set location and size
        field3.setBackground(Color.black);
        field3.setForeground(new Color(0x00FF00));
        field3.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text
        //   Policy owner DoB Month
        field4 = new JTextField();
        field4.setText("MM");//set text
        field4.setBounds(306, 160, 100, 50);//set location and size
        field4.setBackground(Color.black);
        field4.setForeground(new Color(0x00FF00));
        field4.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text
        //   Policy owner DoB Year
        field5 = new JTextField();
        field5.setText("YYYY");//set text Start d
        field5.setBounds(306, 210, 100, 50);//set location and size
        field5.setBackground(Color.black);
        field5.setForeground(new Color(0x00FF00));
        field5.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text

        //   Start - End objects for panel 2
        //   Policy Start day
        fieldSday = new JTextField();
        fieldSday.setText("DD");
        fieldSday.setSize(50, 50);
        fieldSday.setBackground(Color.black);
        fieldSday.setForeground(new Color(0x00FF00));
        fieldSday.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text
        //   Policy Start month
        fieldSmonth = new JTextField();
        fieldSmonth.setText("MM");
        fieldSmonth.setSize(50, 50);
        fieldSmonth.setBackground(Color.black);
        fieldSmonth.setForeground(new Color(0x00FF00));
        fieldSmonth.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text
        //   Policy Start year
        fieldSyear = new JTextField();
        fieldSyear.setText("YYYY");
        fieldSyear.setSize(100, 50);
        fieldSyear.setBackground(Color.black);
        fieldSyear.setForeground(new Color(0x00FF00));
        fieldSyear.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text
        //   Policy End day
        fieldEday = new JTextField();
        fieldEday.setText("DD");
        fieldEday.setSize(50, 50);
        fieldEday.setBackground(Color.black);
        fieldEday.setForeground(new Color(0x00FF00));
        fieldEday.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text
        //   Policy End month
        fieldEmonth = new JTextField();
        fieldEmonth.setText("MM");
        fieldEmonth.setSize(100, 50);
        fieldEmonth.setBackground(Color.black);
        fieldEmonth.setForeground(new Color(0x00FF00));
        fieldEmonth.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text
        //   Policy End year
        fieldEyear = new JTextField();
        fieldEyear.setText("YYYY");
        fieldEyear.setSize(100, 50);
        fieldEyear.setBackground(Color.black);
        fieldEyear.setForeground(new Color(0x00FF00));
        fieldEyear.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text

        //   add object to main panel(this class)
        this.add(field1);
        this.add(field2);
        this.add(field3);
        this.add(field4);
        this.add(field5);
        //

    }

    public void getLabels() {//Labels settings
        label1 = new JLabel("Name :");
        label1.setBounds(6, 60, 300, 50);//set location and size
        label1.setBackground(Color.GREEN);
        label1.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 25));//set font and size
        label1.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        label1.setOpaque(true);
        label1.setHorizontalTextPosition(JLabel.CENTER);

        label2 = new JLabel("Day of Birth :");
        label2.setBounds(6, 110, 300, 50);//set location and size
        label2.setBackground(Color.GREEN);
        label2.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 25));//set font and size
        label2.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        label2.setOpaque(true);
        label2.setHorizontalTextPosition(JLabel.CENTER);

        label3 = new JLabel("ID number :");
        label3.setBounds(6, 6, 300, 50);//set location and size
        label3.setBackground(Color.GREEN);
        label3.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 25));//set font and size
        label3.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        label3.setOpaque(true);
        label3.setHorizontalTextPosition(JLabel.CENTER);

        label4 = new JLabel("Month if Birth :");
        label4.setBounds(6, 160, 300, 50);//set location and size
        label4.setBackground(Color.GREEN);
        label4.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 25));//set font and size
        label4.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        label4.setOpaque(true);
        label4.setHorizontalTextPosition(JLabel.CENTER);

        label5 = new JLabel("Year of Birth:");
        label5.setBounds(6, 210, 300, 50);//set location and size
        label5.setBackground(Color.GREEN);
        label5.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 25));//set font and size
        label5.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        label5.setOpaque(true);
        label5.setHorizontalTextPosition(JLabel.CENTER);

        //   Start - End objects for panel 2

        labelSday = new JLabel("Start Day");
        labelSday.setSize(100, 50);
        labelSday.setBackground(Color.GREEN);
        labelSday.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 20));//set font and size
        labelSday.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        labelSday.setOpaque(true);
        labelSday.setHorizontalTextPosition(JLabel.CENTER);

        labelSmonth = new JLabel("Start Month");
        labelSmonth.setSize(100, 50);
        labelSmonth.setBackground(Color.GREEN);
        labelSmonth.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 16));//set font and size
        labelSmonth.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        labelSmonth.setOpaque(true);
        labelSmonth.setHorizontalTextPosition(JLabel.CENTER);

        labelSyear = new JLabel("Start Year");
        labelSyear.setSize(100, 50);
        labelSyear.setBackground(Color.GREEN);
        labelSyear.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 20));//set font and size
        labelSyear.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        labelSyear.setOpaque(true);
        labelSyear.setHorizontalTextPosition(JLabel.CENTER);

        labelEday = new JLabel("End Day");
        labelEday.setSize(100, 50);
        labelEday.setBackground(Color.GREEN);
        labelEday.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 20));//set font and size
        labelEday.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        labelEday.setOpaque(true);
        labelEday.setHorizontalTextPosition(JLabel.CENTER);

        labelEmonth = new JLabel("End Month");
        labelEmonth.setSize(100, 50);
        labelEmonth.setBackground(Color.GREEN);
        labelEmonth.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 20));//set font and size
        labelEmonth.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        labelEmonth.setOpaque(true);
        labelEmonth.setHorizontalTextPosition(JLabel.CENTER);

        labelEyear = new JLabel("End Year");
        labelEyear.setSize(100, 50);
        labelEyear.setBackground(Color.GREEN);
        labelEyear.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 20));//set font and size
        labelEyear.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        labelEyear.setOpaque(true);
        labelEyear.setHorizontalTextPosition(JLabel.CENTER);
        //   add object to main panel(this class)
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(label5);
    }

    public String returnPolicyDateDoB() {//method to return String date format
        String day, month, year, str;
        day = getField2().getText();
        month = getField4().getText();
        year = getField5().getText();
        str = day + "/" + month + "/" + year;
        return str;
    }

    public String returnPolicyStartDate() {//method to return String date format
        String day, month, year, str;
        day = getFieldSday().getText();
        month = getFieldSmonth().getText();
        year = getFieldSyear().getText();
        str = day + "/" + month + "/" + year;
        return str;
    }

    public String returnPolicyEndDate() {//method to return String date format
        String day, month, year, str;
        day = getFieldEday().getText();
        month = getFieldEmonth().getText();
        year = getFieldEyear().getText();
        str = day + "/" + month + "/" + year;
        return str;
    }


    @Override
    public void actionPerformed(ActionEvent e) {


    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSdate() {
        return Sdate;
    }

    public void setSdate(String sdate) {
        Sdate = sdate;
    }

    public String getEdate() {
        return Edate;
    }

    public void setEdate(String edate) {
        Edate = edate;
    }

    @Override
    public void setVisible() {
        this.setVisible(true);
    }

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }


    public JTextField getFieldSmonth() {
        return fieldSmonth;
    }

    public void setFieldSmonth(JTextField fieldSmonth) {
        this.fieldSmonth = fieldSmonth;
    }

    public JTextField getFieldSyear() {
        return fieldSyear;
    }

    public void setFieldSyear(JTextField fieldSyear) {
        this.fieldSyear = fieldSyear;
    }

    public JTextField getFieldEmonth() {
        return fieldEmonth;
    }

    public void setFieldEmonth(JTextField fieldEmonth) {
        this.fieldEmonth = fieldEmonth;
    }

    public JTextField getFieldEyear() {
        return fieldEyear;
    }

    public void setFieldEyear(JTextField fieldEyear) {
        this.fieldEyear = fieldEyear;
    }

    public JTextField getFieldSday() {
        return fieldSday;
    }

    public void setFieldSday(JTextField fieldSday) {
        this.fieldSday = fieldSday;
    }

    public JTextField getFieldEday() {
        return fieldEday;
    }

    public void setFieldEday(JTextField fieldEday) {
        this.fieldEday = fieldEday;
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

    public JTextField getField5() {
        return field5;
    }

    public void setField5(JTextField field5) {
        this.field5 = field5;
    }
}
