package WorkingGUI.panels;

import WorkingGUI.Panel;
import WorkingGUI.extraFiles.DataContainer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.PortUnreachableException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TravellerSpanel extends Panel {
    private JComboBox box2,box3;
    private JButton button2,button3;
    private JLabel label2,label3,labelTravmonth,labelTravyear;
    private JTextField field1,field2,field3,fieldTravmonth,fieldTravyear;
    private String[] Activities={"Snowboard","Skis","Skates","Hiking","Climbing"};
    private String[] userSkills={"Beginner","Intermediate","Advanced","Master"};
    private  int number;
    private String policyname,ID;

    private int clickCount,currentnumber;
    // Constructor for ROW
    public TravellerSpanel(JFrame frame,DataContainer dataContainer, RoWpanel roWpanel,int number){
        super(frame,dataContainer);
        getThisPanel();
        roWpanel.add(this);
        this.number=number;
        currentnumber=1;

        getButtons();
        getLabels();
        getFields();
        getComboBox();


    }
    // Constructor for Hazard
    public TravellerSpanel(JFrame frame ,DataContainer dataContainer,RoWpanel roWpanel,int number,String name){
        super(frame,dataContainer);
        getThisPanel();
        roWpanel.add(this);
        this.number=number;
        this.policyname=name;
        currentnumber=1;

        getButtons();
        getLabels();
        getFields();
        getComboBox();
        this.add(box2);


    }
    // Constructor for Winter
    public TravellerSpanel(JFrame frame,DataContainer dataContainer ,RoWpanel rowinter,int number,String name,String ID){
        super(frame,dataContainer);
        getThisPanel();
        rowinter.add(this);
        this.number=number;
        this.policyname=name;
        this.ID=ID;
        currentnumber=1;

        getButtons();
        getLabels();
        getFields();
        getComboBox();
        this.add(box2);
        this.add(box3);
    }

    public void getThisPanel(){
        this.setLayout(null);
        this.setBackground(Color.blue);
        this.setBorder(BorderFactory.createLineBorder(Color.black,5));
        this.setBounds(6,366,738,400);
        this.setVisible(false);
    }
    public void getComboBox(){
        box2=new JComboBox(Activities);//crating ComboBox object and add String array
        box2.setSelectedIndex(0);// select first element from String array
        box2.addActionListener(this);
        box2.setBounds(562,140,150,50);

        box3=new JComboBox(userSkills);//crating ComboBox object and add String array
        box3.setSelectedIndex(0);
        box3.addActionListener(this);
        box3.setBounds(562,240,150,50);
    }
    public void getButtons(){//Buttons settings
        button2 = new JButton("Click to Accept ");
        button2.addActionListener(this);// this add action to button ( when user click button)
        button2.setBounds(426, 320, 150, 50);//set location and size
        this.add(button2);
        button3 = new JButton("Click to Display ");
        button3.addActionListener(this);// this add action to button ( when user click button)
        button3.setBounds(562, 10, 150, 50);//set location and size
        this.add(button3);
    }
    public void getLabels(){//Label settings
        label2=new JLabel("Traveller name :");
        label2.setBounds(6,65,300,50);//set location and size
        label2.setBackground(Color.GREEN);
        label2.setFont(new Font("MV Boli",Font.ROMAN_BASELINE,25));//set font and size
        label2.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        label2.setOpaque(true);
        label2.setHorizontalTextPosition(JLabel.CENTER);

        label3=new JLabel("Traveller DOB - Day:");
        label3.setBounds(6,120,300,50);//set location and size
        label3.setBackground(Color.GREEN);
        label3.setFont(new Font("MV Boli",Font.ROMAN_BASELINE,25));//set font and size
        label3.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        label3.setOpaque(true);
        label3.setHorizontalTextPosition(JLabel.CENTER);

        labelTravmonth=new JLabel("Traveller DOB - Month:");
        labelTravmonth.setBounds(6,175,300,50);//set location and size
        labelTravmonth.setBackground(Color.GREEN);
        labelTravmonth.setFont(new Font("MV Boli",Font.ROMAN_BASELINE,25));//set font and size
        labelTravmonth.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        labelTravmonth.setOpaque(true);
        labelTravmonth.setHorizontalTextPosition(JLabel.CENTER);

        labelTravyear=new JLabel(" Traveller DoB - Year");
        labelTravyear.setBounds(6,230,300,50);//set location and size
        labelTravyear.setBackground(Color.GREEN);
        labelTravyear.setFont(new Font("MV Boli",Font.ROMAN_BASELINE,25));//set font and size
        labelTravyear.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        labelTravyear.setOpaque(true);
        labelTravyear.setHorizontalTextPosition(JLabel.CENTER);
        this.add(label2);
        this.add(label3);

        this.add(labelTravmonth);
        this.add(labelTravyear);
    }
    public void getFields() {//TextField settings
        field1 = new JTextField();
        field1.setText("Write here");//set text
        field1.setBounds(306, 65, 250, 50);//set location and size
        field1.setBackground(Color.black);
        field1.setForeground(new Color(0xDBD2D2));
        field1.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text

        field2 = new JTextField();
        field2.setText("DD");//set text
        field2.setBounds(306, 120, 100, 50);//set location and size
        field2.setBackground(Color.black);
        field2.setForeground(new Color(0xE600FF));
        field2.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text

        field3 = new JTextField();
        field3.setText("Traveller number : 1");//set text currentnumber
        field3.setBounds(156, 6, 400, 50);//set location and size
        field3.setBackground(Color.black);
        field3.setForeground(new Color(0xD9470C));
        field3.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text

        fieldTravmonth = new JTextField();
        fieldTravmonth.setText("MM");//set text
        fieldTravmonth.setBounds(306, 175, 100, 50);//set location and size
        fieldTravmonth.setBackground(Color.black);
        fieldTravmonth.setForeground(new Color(0xE600FF));
        fieldTravmonth.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text

        fieldTravyear = new JTextField();
        fieldTravyear.setText("YYYY");//set text
        fieldTravyear.setBounds(306, 230, 100, 50);//set location and size
        fieldTravyear.setBackground(Color.black);
        fieldTravyear.setForeground(new Color(0xE600FF));
        fieldTravyear.setFont(new Font("Consolas", Font.PLAIN, 35));// change font   is changing size of text


        this.add(field3);

        this.add(field1);
        this.add(field2);
        this.add(fieldTravmonth);
        this.add(fieldTravyear);
    }
    public String returnPolicyOwnerDoB() {//method to return String date format
        String day, month, year, str;
        day = getField2().getText();
        month = getFieldTravmonth().getText();
        year = getFieldTravyear().getText();
        str = day + "/" + month + "/" + year;
        return str;
    }
    // saving the data method
    public void addToContainer(DataContainer dataContainer){
        dataContainer.setTravellersNames(getField1().getText());
        dataContainer.setTravelelrsDoB(setAnYDate());
    }
    // method to transform String into Calendar object
    public Calendar setAnYDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar DOBtest = Calendar.getInstance();
        String date = "";
        int error = 0;

        do {    //read date from keyboard as String
            //System.out.print("Enter Date : Follow instruction");
            date = returnPolicyOwnerDoB();//call method that return String to set proper and logic date format
            //date=keyboard.nextLine(); // change input format to any String
            // problem developed in word document
            try {    //apply SimpleDateFormat format to the date variable
                //and store the date in the Calendar object dob
                DOBtest.setTime(sdf.parse(date));
                error = 0;
            } catch (Exception e) {
                System.out.print("date not in correct format (dd/MM/yyyy):");
                error = 1;
            }
        } while (error == 1);
        return DOBtest;
    }
    public String getActivityString(){//method to return String value after user make his choose
      //  ,,,"Climbing"
        String str="";
        int index;
        index=getBox2().getSelectedIndex();
        if(index==0){
            return  str="Snowboard";
        }else if(index==1){
            return str="Skis";
        }else if(index==2){
            return str="Skates";
        }else if(index==3){
            return str="Hiking";
        }else if(index==4){
            return str="Climbing";
        }
        return str="something went wrong";
    }
    public String getTravLevelString(){//method to return String value after user make his choose
        String str="";
        int index;
        index=getBox3().getSelectedIndex();
        if(index==0){
            return  str="Beginner";
        }else if(index==1){
            return str="Intermediate";
        }else if(index==2){
            return str="Advanced";
        }else if(index==3) {
            return str = "Master";
        }
        return str="something went wrong";
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //  setters and getters
    public int returnNumberTravellers(int number){
        int number1=number;
        return number1;
    }

    @Override
    public void setVisible() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCurrentnumber() {
        return currentnumber;
    }

    public void setCurrentnumber(int currentnumber) {
        this.currentnumber = currentnumber;
    }

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public void setButton3(JButton button3) {
        this.button3 = button3;
    }

    public JComboBox getBox2() {
        return box2;
    }

    public void setBox2(JComboBox box2) {
        this.box2 = box2;
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

    public JTextField getFieldTravmonth() {
        return fieldTravmonth;
    }

    public void setFieldTravmonth(JTextField fieldTravmonth) {
        this.fieldTravmonth = fieldTravmonth;
    }

    public JTextField getFieldTravyear() {
        return fieldTravyear;
    }

    public void setFieldTravyear(JTextField fieldTravyear) {
        this.fieldTravyear = fieldTravyear;
    }

    public JComboBox getBox3() {
        return box3;
    }

    public void setBox3(JComboBox box3) {
        this.box3 = box3;
    }
}
