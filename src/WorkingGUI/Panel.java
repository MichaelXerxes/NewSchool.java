package WorkingGUI;

import Assignment2OOP.HolidayPlan;
import WorkingGUI.extraFiles.DataContainer;
import WorkingGUI.panels.HolidayPlanPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Panel extends JPanel implements ActionListener {
    protected JFrame frame;
    protected DataContainer dataContainer;
    //protected HolidayPlan plan;
    public Panel(JFrame frame,DataContainer dataContainer)
    {
        this.frame=frame;
        this.dataContainer=dataContainer;
    }
    public Panel(){}
    public abstract void actionPerformed(ActionEvent e);
    public abstract void setVisible();

    public DataContainer getDataContainer() {
        return dataContainer;
    }

    public void setDataContainer(DataContainer dataContainer) {
        this.dataContainer = dataContainer;
    }
}
