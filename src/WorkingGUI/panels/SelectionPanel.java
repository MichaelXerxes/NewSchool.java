package WorkingGUI.panels;

import Assignment2OOP.RoW;
import WorkingGUI.Panel;
import WorkingGUI.extraFiles.DataContainer;
import WorkingGUI.workingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SelectionPanel extends Panel {
    private JButton button1,button2,button3;
    private JLabel label1;
    private RoWpanel RoWpanel;
    private HazarDpanel HAZpanel;
    private WinteRpanel WiNpanel;

    public SelectionPanel(JFrame frame,DataContainer dataContainer) {
        super(frame,dataContainer);
        frame.add(this);
        this.setLayout(null);// no layout
        this.setBackground(Color.pink);
        this.setBorder(BorderFactory.createLineBorder(Color.magenta,5));//ser border color and thickness
        this.setBounds(0,0,750,770);//set location and size

        getLabels();
        getButtons();

        this.setVisible(false);
        setOpaque(true);
    }
    public void getButtons(){
        button1=new JButton("Click for Rest of World");
        button1.addActionListener(this);// this add action to button ( when user click button)
        button1.setBounds(175,140,350,80);//set location and size

        button2=new JButton("Click for Hazard");
        button2.addActionListener(this);// this add action to button ( when user click button)
        button2.setBounds(175,280,350,80);//set location and size

        button3=new JButton("Click for Winter");
        button3.addActionListener(this);// this add action to button ( when user click button)
        button3.setBounds(175,420,350,80);//set location and size

        this.add(button1);
        this.add(button2);
        this.add(button3);

    }
    public void getLabels() {
        label1 = new JLabel(" Choose your Policy type  :");
        label1.setBounds(120, 20, 480, 80);//set location and size
        label1.setBackground(Color.GREEN);
        label1.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 35));//set font and size
        label1.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        label1.setOpaque(true);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        this.add(label1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void setVisible() {

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

    public JButton getButton3() {
        return button3;
    }

    public void setButton3(JButton button3) {
        this.button3 = button3;
    }
}
