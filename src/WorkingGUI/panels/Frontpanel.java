package WorkingGUI.panels;

import WorkingGUI.Panel;
import WorkingGUI.extraFiles.DataContainer;
import WorkingGUI.extraFiles.PictureJPGforpanel;
import WorkingGUI.workingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class Frontpanel extends Panel {
    private JButton button1;
    private JLabel label,label2;
    private PictureJPGforpanel pictureJPGforpanel;//not used
    public Frontpanel(JFrame frame, DataContainer dataContainer) {
        super(frame,dataContainer);
        frame.add(this);
        this.setLayout(null);// no layout
        this.setBackground(Color.pink);
        this.setBorder(BorderFactory.createLineBorder(Color.magenta,5));//ser border color and thickness
        this.setBounds(0,0,750,770);//set location and size

        getLabel();
        getButtons();


        this.setVisible(true);

    }
    public void getButtons(){// button settings
        button1=new JButton("Click to Continue");
        button1.addActionListener(this);// this add action to button ( when user click button)
        button1.setBounds(306,702,150,50);//set location and size

        this.add(button1);
    }
    public void getLabel(){//labels settings
        label=new JLabel();
        label.setBounds(120,6,530,500);
        label.setBorder(BorderFactory.createBevelBorder(0));
        label.setBackground(Color.blue);
        label.setLayout(new FlowLayout());
        label.setIcon(new ImageIcon("res/HolidayPicture.jpg"));// add picture to label from 'res' folder
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setOpaque(true);// so we can see component
        this.add(label);
        validate();

        label2=new JLabel();
        label2.setBounds(120,510,530,180);
        label2.setBorder(BorderFactory.createBevelBorder(1));
        label2.setBackground(Color.orange);
        label2.setText(" Holiday Planner");
        label2.setFont(new Font("Serif", Font.BOLD, 70));
        label2.setOpaque(true);// so we can see component
        this.add(label2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      //  if (e.getSource()==button1){
        //    setButton1(button1);
        //}

    }
    @Override
    public void setVisible(){
        this.setVisible(false);
    }


    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }
}
