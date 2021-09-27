package WorkingGUI;

import Assignment2OOP.Environment;
import Assignment2OOP.HolidayPlan;
import Assignment2OOP.Policy;

public class NewEnvironment {
    private workingGUI GUI;
    public NewEnvironment(){
        GUI=new workingGUI();
    }
    public static void main(String[] args){
       HolidayPlan plan=new HolidayPlan();
       Policy policy=new Policy(plan);
        NewEnvironment newE=new NewEnvironment();
    }
}
