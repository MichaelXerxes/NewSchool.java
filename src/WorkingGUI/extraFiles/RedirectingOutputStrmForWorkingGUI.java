package WorkingGUI.extraFiles;

import Assignment2OOP.GUI;
import WorkingGUI.panels.Displaypanel;
import WorkingGUI.workingGUI;

import java.io.IOException;
import java.io.OutputStream;

public class RedirectingOutputStrmForWorkingGUI extends OutputStream {
    private Displaypanel displaypanel;// creating  object

    public RedirectingOutputStrmForWorkingGUI(Displaypanel displaypanel) {//constructor with Displaypanel parameter
        this.displaypanel=displaypanel;
    }// constructor

    @Override
    public void write(int b) throws IOException {
        displaypanel.appendText(String.valueOf((char) b));//new text to appear on Displaypanel in workingGUI
    }//end method
}//end class

