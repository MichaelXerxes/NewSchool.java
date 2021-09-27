package WorkingGUI.panels;

import WorkingGUI.extraFiles.DataContainer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinteRpanel extends RoWpanel{
    private TravellerSpanel TSpanelForWInter;
    public WinteRpanel(JFrame frame, DataContainer dataContainer) {
        super(frame,dataContainer);
        frame.add(this);

        getPanels();
        getButtons();
        getComboBox();
        getLabels();
        //getFields();
        this.setVisible(false);
    }

}
