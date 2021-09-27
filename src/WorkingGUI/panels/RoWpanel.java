package WorkingGUI.panels;

import Assignment2OOP.RoW;
import WorkingGUI.Panel;
import WorkingGUI.extraFiles.DataContainer;
import WorkingGUI.workingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RoWpanel extends Panel {
    protected JPanel panel1,panel2,panel3;
    protected JLabel label1,label2,label3,label4;
    protected JComboBox box1,box2,box3,box4;
    protected JButton button1,button2;
    protected JTextField field1,field2,field3,field4;
    protected String[]  worldDestination={"North America","South America","Asia","Rest World"};
    //protected String[] Activities={"Snowboard","Skis","Skates","Hiking","Climbing"};
    //protected String[] userSkills={"Beginner","Intermediate","Advanced","Master"};
    protected String[] numberOfTravellers={"1","2","3","4","5","6"};
    protected String userDestination="";
    protected int number;
    protected TravellerSpanel TSpanel;
    public RoWpanel(JFrame frame,DataContainer dataContainer) {
        //super(frame,dataContainer);
        frame.add(this);
        this.setLayout(null);// no layout
        this.setBackground(Color.pink);
        this.setBorder(BorderFactory.createLineBorder(Color.magenta,5));//ser border color and thickness
        this.setBounds(0,0,750,770);//set location and size
        getPanels();
        getComboBox();
       getButtons();
       getLabels();
        this.setVisible(false);
    }
    public RoWpanel(JFrame frame,DataContainer dataContainer,String policyname) {
        //super(frame,dataContainer);
        frame.add(this);
        this.setLayout(null);// no layout
        this.setBackground(Color.pink);
        this.setBorder(BorderFactory.createLineBorder(Color.magenta,5));//ser border color and thickness
        this.setBounds(0,0,750,770);//set location and size
        getPanels();
        getComboBox();
        getButtons();
        getLabels();

        this.setVisible(false);
    }
    public void getPanels(){
        panel1=new JPanel();
        panel3=new JPanel();

        panel1.setLayout(null);
        panel1.setBackground(Color.YELLOW);
        panel1.setBorder(BorderFactory.createLineBorder(Color.RED,5));
        panel1.setBounds(6,6,738,358);

        panel3.setLayout(null);
        panel3.setBackground(Color.black);
        panel3.setBorder(BorderFactory.createLineBorder(Color.yellow,5));
        panel3.setBounds(6,362,738,358);

        this.add(panel1);
        this.add(panel3);
    }

    public void getComboBox(){
        box1=new JComboBox(worldDestination);
        box1.setSelectedIndex(0);
        box1.addActionListener(this);
        box1.setBounds(410,36,150,50);

        box4=new JComboBox(numberOfTravellers);
        box4.setSelectedIndex(0);
        box4.addActionListener(this);
        box4.setBounds(410,136,150,50);

        panel1.add(box1);
        panel1.add(box4);

    }
    public void getButtons() {
        button1 = new JButton("Click to Accept ");
        button1.addActionListener(this);// this add action to button ( when user click button)
        button1.setBounds(336, 240, 150, 50);//set location and size

        panel1.add(button1);
    }
    public void getLabels() {
        label1 = new JLabel("Choose destination :");
        label1.setBounds(6, 36, 300, 50);//set location and size
        label1.setBackground(Color.GREEN);
        label1.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 25));//set font and size
        label1.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        label1.setOpaque(true);
        label1.setHorizontalTextPosition(JLabel.CENTER);


        label4 = new JLabel("How many Travellers? :");
        label4.setBounds(6, 136, 300, 50);//set location and size
        label4.setBackground(Color.GREEN);
        label4.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 25));//set font and size
        label4.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        label4.setOpaque(true);
        label4.setHorizontalTextPosition(JLabel.CENTER);


        panel1.add(label1);
        panel1.add(label4);
    }
    /*public void getFields() {
        field1 = new JTextField();
        field1.setText("Write here");//set text
        field1.setBounds(306, 90, 250, 50);//set location and size
        field1.setBackground(Color.black);
        field1.setForeground(new Color(0x00FF00));
        field1.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text

        field2 = new JTextField();
        field2.setText("DD/MM/YYYY");//set text
        field2.setBounds(306, 160, 200, 50);//set location and size
        field2.setBackground(Color.black);
        field2.setForeground(new Color(0x00FF00));
        field2.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text

        field3 = new JTextField();
        field3.setText("Traveller number : "+getNumber());//set text
        field3.setBounds(156, 6, 400, 50);//set location and size
        field3.setBackground(Color.black);
        field3.setForeground(new Color(0xE600FF));
        field3.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text

    }*/

        @Override
    public void actionPerformed(ActionEvent e) {

        }
    public void panel2FindHowMany(int number){

    }
    public int returnNumberTravellers(int number){
        int number1=number;
        return number1;
    }

   // @Override
    public void setVisible() {
        this.setVisible(true);

    }

    public String getUserDestination() {
        return userDestination;
    }

    public void setUserDestination(String userDestination) {
        this.userDestination = userDestination;

    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public JComboBox getBox4() {
        return box4;
    }

    public void setBox4(JComboBox box4) {
        this.box4 = box4;
    }

    public TravellerSpanel getTSpanel() {
        return TSpanel;
    }

    public void setTSpanel(TravellerSpanel TSpanel) {
        this.TSpanel = TSpanel;
    }

    public JComboBox getBox1() {
        return box1;
    }

    public void setBox1(JComboBox box1) {
        this.box1 = box1;
    }
}
