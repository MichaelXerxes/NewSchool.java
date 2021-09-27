package WorkingGUI.panels;

import WorkingGUI.Panel;
import WorkingGUI.extraFiles.DataContainer;
import WorkingGUI.extraFiles.RedirectingOutputStrmForWorkingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.PrintStream;

//The class, the Display panel is used to redirect the stream from the console to the text Area,
// and to display the results after an earlier introduction to the program.

public class Displaypanel extends Panel {
    private JTextArea textArea;
    private JPanel panel2,panel1,panel3;
    private JLabel label1;
    private JButton button1,button2,button3;

    public Displaypanel(JFrame frame){//constructor
        textArea = new JTextArea();//creating object
        frame.add(this);
        getThisPanel();
        getButtons();
        getTextAreas();
        getLabels();
        System.setOut(new PrintStream(new RedirectingOutputStrmForWorkingGUI(this), true));//Standard Output Stream to any user defined value
        //this.start();// call method
    }
    public void getThisPanel(){// method with panels setting
        this.setLayout(null);//class panel
        this.setBackground(Color.YELLOW);
        this.setBounds(0,0,750,770);
        panel1=new JPanel();// panel 1 add to class panel
        panel1.setLayout(null);
        panel1.setBackground(Color.blue);
        panel1.setBorder(BorderFactory.createLineBorder(Color.black,5));
        panel1.setBounds(6,6,738,558);
        panel1.setVisible(false);
        this.add(panel1);
        panel2=new JPanel();// panel 2 add to class panel
        panel2.setLayout(new GridLayout(1,1));
        panel2.setBackground(Color.gray);
        panel2.setBorder(BorderFactory.createLineBorder(Color.RED,5));
        panel2.setBounds(6,566,738,200);
        panel2.setVisible(false);
        this.add(panel2);
        this.setVisible(false);
        panel3=new JPanel();// panel 2 add to class panel
        panel3.setLayout(null);
        panel3.setBackground(Color.red);
        panel3.setBorder(BorderFactory.createLineBorder(Color.MAGENTA,5));
        panel3.setBounds(6,566,738,200);
        panel3.setVisible(false);
        this.add(panel3);
    }
    public void getButtons(){// buttons settings
        button2 = new JButton("Click to Accept ");
        button2.setBounds(6, 6, 150, 50);//set location and size
        panel2.add(button2);

        button1 = new JButton("Click to Cancel ");
        button1.setBounds(6, 67, 150, 50);//set location and size
        panel2.add(button1);

        button3 = new JButton("Click to Exit ");
        button3.setBounds(306, 138, 150, 50);//set location and size
        panel3.add(button3);

    }
    public void getTextAreas(){// test Area settings
        textArea.setFont(new Font("Consolas", Font.PLAIN, 12));//set font and size
        textArea.setBounds(6,6,722,550);
        textArea.setBackground(Color.cyan);// set background color
        panel1.add(textArea);
    }
    public void getLabels(){//Label settings
        label1=new JLabel();
        label1.setBounds(120,12,530,100);
        label1.setBorder(BorderFactory.createBevelBorder(1));
        label1.setBackground(Color.orange);
        label1.setText("Thank you for using the Program");
        label1.setFont(new Font("Serif", Font.BOLD, 35));
        label1.setOpaque(true);// so we can see component
        panel3.add(label1);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    @Override
    public void setVisible() {

    }
    public void appendText(String text) {//method to call text from the console on the panel screen
        textArea.append(text);
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
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

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public JTextArea getTextArea() {
        return textArea;
    }
}
