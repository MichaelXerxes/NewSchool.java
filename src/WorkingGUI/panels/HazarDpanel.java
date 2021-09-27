package WorkingGUI.panels;

import WorkingGUI.extraFiles.DataContainer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HazarDpanel extends RoWpanel {

    protected TravellerSpanel TSpanelforHazard;
    public HazarDpanel(JFrame frame, DataContainer dataContainer) {
        super(frame,dataContainer);
        //TSpanelforHazard=new TravellerSpanel(frame,dataContainer,this);
        frame.add(this);


        getPanels();
        getButtons();
        getComboBox();
        getLabels();
        //getFields();
        this.setOpaque(true);

        this.setVisible(false);

    }

  @Override
  public void actionPerformed(ActionEvent e) {



  }


}
