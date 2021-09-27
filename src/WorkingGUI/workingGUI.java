package WorkingGUI;

import Assignment2OOP.HolidayPlan;
import Assignment2OOP.Policy;
//import WorkingGUI.extraFiles.ConsoletoWorkingGUI;
import WorkingGUI.extraFiles.DataContainer;
import WorkingGUI.panels.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class workingGUI extends JFrame implements ActionListener {
    private JFrame frame;
    private HolidayPlanPanel HPpanel;
    private Frontpanel Fpanel;
    private Policypanel Ppanel;
    private SelectionPanel Spanel;
    private DataContainer dataContainer;
    private RoWpanel RoWpanel,RowForHazardpanel,RoWForWinterpanel;
    private HazarDpanel HAZpanel;//not used
    private WinteRpanel WiNpanel;//not used
    private Displaypanel displaypanel;

    private JPanel cards;//for CardLayout not used
    private TravellerSpanel TSpanelRoW,TSpanelHAZ,TSpanelWIN;
    private int clickCount,number,curentnumber;


    public workingGUI(){//constructor
        clickCount=0;
        curentnumber=1;
        getFrame();
        //creating objects (panels) in order
        dataContainer=new DataContainer();

        cards=new JPanel(new CardLayout());

        Fpanel=new Frontpanel(frame,dataContainer);
        Fpanel.getButton1().addActionListener(this);

        HPpanel=new HolidayPlanPanel(frame,dataContainer);
        HPpanel.getButton1().addActionListener(this);

        Ppanel = new Policypanel(frame,dataContainer);
        Ppanel.getButton2().addActionListener(this);


        Spanel=new SelectionPanel(frame,dataContainer);
        Spanel.getButton1().addActionListener(this);
        Spanel.getButton2().addActionListener(this);
        Spanel.getButton3().addActionListener(this);

        RoWpanel=new RoWpanel(frame,dataContainer);
        RoWpanel.getButton1().addActionListener(this);

        RowForHazardpanel=new RoWpanel(frame,dataContainer,"Hazard");
        RowForHazardpanel.getButton1().addActionListener(this);

        RoWForWinterpanel=new RoWpanel(frame,dataContainer,"Winter");
        RoWForWinterpanel.getButton1().addActionListener(this);


        displaypanel=new Displaypanel(frame);
        displaypanel.getButton1().addActionListener(this);
        displaypanel.getButton2().addActionListener(this);
        displaypanel.getButton3().addActionListener(this);


    }

    public void getCards(){//method not used
        cards.add("startPanel",Fpanel);
        cards.add("HPpanel",HPpanel);
        cards.add("Ppanel",Ppanel);
        cards.add("Selection",Spanel);
        cards.add("RoW",RoWpanel);
        cards.add("Hazard",HPpanel);
        cards.add("Winter",WiNpanel);
    }
    public void getFrame(){//settings for frame
        frame=new JFrame("New working GUI");
        frame.setBounds(0, 0, 764, 807);//set size of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close program when click x on frame
        frame.setLayout(null);// default
        frame.setResizable(false);// make frame cannot to change
        frame.setLocationRelativeTo(null);// this allow frame to appear  in middle of screen
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);

    }

    @Override  //the method in which the sequence of actions is established//
    public void actionPerformed(ActionEvent e) {
        //           Step 1 Front panel                                                  /////////
        if(e.getSource()==Fpanel.getButton1()){
            Fpanel.setVisible(false);
            HPpanel.setVisible(true);
            //System.err.println("Steep 1");

        }
        //The scheduling methods create tasks with different delays and return the task object.
        // Here it has been used for conditional
        Runnable helloRunnable = new Runnable() {// implementing runnable interface
            public void run() {//Button 1 will become available when the user enters the data
               // System.out.println("Test ping");
                if((HPpanel.getField1().getText().equals("Write here"))&&(HPpanel.getField3().getText().equals("Type Here"))&&
                        (HPpanel.getField4().getText().equals("..."))){
                    HPpanel.getButton1().setEnabled(false);
                }else{
                    HPpanel.getButton1().setEnabled(true);

                }
            }
        };
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(helloRunnable, 0, 3, TimeUnit.SECONDS);

        //           Step 2 Holiday panel                                                 /////////
        if(e.getSource()==HPpanel.getButton1()){

            HPpanel.setVisible(false);
            Ppanel.setVisible(true);
            //System.err.println("Steep 2");
            // set data from panel to container
            dataContainer.setHPname(HPpanel.getField1().getText());
            dataContainer.setHPid(HPpanel.getField3().getText());
            dataContainer.setHPdestination(HPpanel.getField4().getText());
            dataContainer.setHPownerDoBstring(HPpanel.returnDateDoB());//call method to return date in proper String format

        }
        //The scheduling methods create tasks with different delays and return the task object.
        // Here it has been used for conditional
        Runnable Runnable2 = new Runnable() {// implementing runnable interface
            public void run() {//Button 1 will become available when the user enters the data
                // System.out.println("Test ping");
                if((Ppanel.getField3().getText().equals("ID"))&&(Ppanel.getField1().getText().equals("Write here"))){
                    Ppanel.getButton2().setEnabled(false);
                }else{
                    Ppanel.getButton2().setEnabled(true);

                }
            }
        };
        ScheduledExecutorService executor1 = Executors.newScheduledThreadPool(1);
        executor1.scheduleAtFixedRate(Runnable2, 0, 3, TimeUnit.SECONDS);

        //       Step 3 Policy panel                                                     /////////
        if(e.getSource()==Ppanel.getButton2()){
            Ppanel.setVisible(false);
           /// System.err.println("Steep 3");
            Spanel.setVisible(true);

            // saving the data
            dataContainer.setPolicyNum(Ppanel.getField3().getText());
            dataContainer.setPolicyOwnername(Ppanel.getField1().getText());
            dataContainer.setPownerDoBstring(Ppanel.returnPolicyDateDoB());
            dataContainer.setSDatestring(Ppanel.returnPolicyStartDate());
            dataContainer.setEDatestring(Ppanel.returnPolicyEndDate());

            //System.out.println(dataContainer.toString());
        }

        //       Step 4 Selection panel for RoW class                                    /////////
        if(e.getSource()==Spanel.getButton1()){
            Spanel.setVisible(false);
           // System.err.println("Steep 4 RoW");
            RoWpanel.setVisible(true);
            RoWpanel.getPanel3().setVisible(true);
        }

        //       Step 4 Selection panel for Hazard class                                 ////////
        if(e.getSource()==Spanel.getButton2()){
            Spanel.setVisible(false);
           // System.err.println("Steep 4 Hazard");
            RowForHazardpanel.setVisible(true);
            RowForHazardpanel.getPanel3().setVisible(true);
        }

        //       Step 4 Selection panel for Winter class                                 ////////
        if(e.getSource()==Spanel.getButton3()){
            Spanel.setVisible(false);
           // System.err.println("Steep 4 Winter");
            RoWForWinterpanel.setVisible(true);
            RoWForWinterpanel.getPanel3().setVisible(true);

        }

        //        Step 5 RoW panel                          *********************************

        if(e.getSource()==RoWpanel.getButton1()){
            int index= RoWpanel.getBox1().getSelectedIndex();//
            // saving the data
            dataContainer.setUserDestination(returnLocation(index));// set String value after user choose using method
            RoWpanel.getPanel3().setVisible(false);
            setNumber(RoWpanel.getBox4().getSelectedIndex()+1);//set number of travellers
            dataContainer.setNumberofTravellers(getNumber());//set number of travellers into container
            dataContainer.setPolicyType("Rest of World");
            dataContainer.setStatus("Active");

            // creating object using proper constructor
            TSpanelRoW=new TravellerSpanel(frame,dataContainer,RoWpanel,number);
            settingsForButtons(TSpanelRoW); //call method
        }

        //       Step 5-> 6 Travellers panel for RoW class *****
        try {

            // set action for button2
            if(e.getSource()==TSpanelRoW.getButton2()){
                TSpanelRoW.getField3().setText("Traveller number : " + (getCurentnumber()+1));//set text on field after each click
                clickCount++;
                curentnumber++;
                // saving the data using method
                TSpanelRoW.addToContainer(dataContainer);
                if(clickCount>=TSpanelRoW.getNumber()){
                    TSpanelRoW.getButton2().setEnabled(false);
                    TSpanelRoW.getButton3().setEnabled(true);
                }
            }
            // set action for button3 in RoW
            if(e.getSource()==TSpanelRoW.getButton3()){

                RoWpanel.setVisible(false);
                TSpanelRoW.setVisible(false);
                dataContainer.setPdailyRate(dataContainer.getDailyRateRoW());//set daily rate for RoW
                dataContainer.calPremiumRoW(dataContainer.getPdailyRate());//cost premium for RoW

                DisplaypanelOptions();
                Display();
                System.out.println(dataContainer.DisplayTravellersRoW());
            }
        }catch (NullPointerException exception){
        }

        //       Step 5 RoW panel for Hazard policy           *********************************

        if(e.getSource()==RowForHazardpanel.getButton1()){
            int index= RowForHazardpanel.getBox1().getSelectedIndex();//
            dataContainer.setUserDestination(returnLocation(index));// set String value after user choose using method
            RowForHazardpanel.getPanel3().setVisible(false);
            setNumber(RowForHazardpanel.getBox4().getSelectedIndex()+1);//set number of travellers
            dataContainer.setNumberofTravellers(getNumber());//set number of travellers into container
            dataContainer.setPolicyType("Hazard");
            dataContainer.setStatus("Active");

            // creating object using proper constructor
            TSpanelHAZ=new TravellerSpanel(frame,dataContainer,RowForHazardpanel,number,"Hazard");
            settingsForButtons(TSpanelHAZ);//call method

        }
        //       Step 5-> 6 Travellers panel for Hazard policy ******
        try {
            // set action for button 2 in Hazard
            if(e.getSource()==TSpanelHAZ.getButton2()){
                TSpanelHAZ.getField3().setText("Traveller number : " + (getCurentnumber()+1));//set text on field after each click

                clickCount++;
                curentnumber++;

                // saving the data using method
                TSpanelHAZ.addToContainer(dataContainer);
                dataContainer.setTravellerActivity(TSpanelHAZ.getActivityString());

                if(clickCount>=TSpanelHAZ.getNumber()){
                    TSpanelHAZ.getButton2().setEnabled(false);
                    TSpanelHAZ.getButton3().setEnabled(true);
                }
            }
            // set action for button3 in Hazard
            if(e.getSource()==TSpanelHAZ.getButton3()){
                RowForHazardpanel.setVisible(false);
                TSpanelHAZ.setVisible(false);
                dataContainer.setPdailyRate(14);// set daily rate to 14
                dataContainer.calPremiumHazard(dataContainer.getPdailyRate());// cost of premium
                DisplaypanelOptions();
                Display();
                System.out.println(dataContainer.DisplayTravellersHazard());
            }
        }catch (NullPointerException exception){
        }

        //       Step 5 RoW for Winter policy              *********************************

        if(e.getSource()==RoWForWinterpanel.getButton1()){

            int index= RoWForWinterpanel.getBox1().getSelectedIndex();//
            dataContainer.setUserDestination(returnLocation(index));// set String value after user choose using method

            RoWForWinterpanel.getPanel3().setVisible(false);
            setNumber(RoWForWinterpanel.getBox4().getSelectedIndex()+1);//set number of travellers
            dataContainer.setNumberofTravellers(getNumber());//set number of travellers into container
            dataContainer.setPolicyType("Winter");
            dataContainer.setStatus("Active");

            // creating object using proper constructor
            TSpanelWIN=new TravellerSpanel(frame,dataContainer,RoWForWinterpanel,number,"Winter","01");
            settingsForButtons(TSpanelWIN);//call method
        }
        //       Step 5-> 6 Travellers panel for Winter policy ******
        try {
            // set action for button 2 in Winter
            if(e.getSource()==TSpanelWIN.getButton2()){

                TSpanelWIN.getField3().setText("Traveller number : " + (getCurentnumber()+1));//set text on field after each click

                clickCount++;
                curentnumber++;

                // saving the data using method
                TSpanelWIN.addToContainer(dataContainer);
                dataContainer.setTravellerActivity(TSpanelWIN.getActivityString());
                dataContainer.setTravellerLevel(TSpanelWIN.getTravLevelString());

                if(clickCount>=TSpanelWIN.getNumber()){
                    TSpanelWIN.getButton2().setEnabled(false);
                    TSpanelWIN.getButton3().setEnabled(true);
                }
            }
            // set action for button3 in Winter
            if(e.getSource()==TSpanelWIN.getButton3()){
                RoWForWinterpanel.setVisible(false);
                TSpanelWIN.setVisible(false);
                dataContainer.setPdailyRate(dataContainer.setproperDailyRateWinter());//set daily rate for winter
                System.err.println(dataContainer.getPremium()+" premium "+"dail rate :"+dataContainer.getPdailyRate());
                dataContainer.calPremiumWinter(dataContainer.getPdailyRate());// cost premium for winter

                DisplaypanelOptions();
                Display();

                System.out.println("\nOne-time equipment fee :"+40+"£ each. Total : "+(40*dataContainer.getNumberofTravellers()+"£\n"));
                System.out.println(dataContainer.DisplayTravellersWinter());
            }
        }catch (NullPointerException exception){
        }

        //        Step 7 Display                        ****************************************

        if(e.getSource()==displaypanel.getButton1()){
            //System.err.println("Button1");
            dataContainer.setHPcost(0);
            dataContainer.setStatus("Client has own");
            dataContainer.setPolicyType("Cancelled");
            displaypanel.getPanel2().setVisible(false);
            displaypanel.getPanel3().setVisible(true);
            displaypanel.getTextArea().setText("");
            Display();
        }
        if(e.getSource()==displaypanel.getButton2()){
            //System.err.println("Button2");
            displaypanel.getPanel2().setVisible(false);
            displaypanel.getPanel3().setVisible(true);
        }
        if(e.getSource()==displaypanel.getButton3()){
            System. exit(0);//exit program !!!!
        }


    }
    public void DisplaypanelOptions(){
        displaypanel.setVisible(true);
        displaypanel.getPanel2().setVisible(true);
        displaypanel.getPanel1().setVisible(true);
    }
    public void settingsForButtons(TravellerSpanel TS){
        TS.setVisible(true);
        TS.getButton2().addActionListener(this);//add action to this class
        TS.getButton3().addActionListener(this);//add action to this class
        TS.getButton3().setEnabled(false);
    }
    public String returnLocation(int index){// method to return proper string using argument
        String str="";
        if(index==0){
            return str="North America";
        }else if(index==1){
            return str="South America";
        }else if (index==2){
            return  str="Asia";
        }
        return str="Rest World";
    }


    public void Display(){
        System.out.println(dataContainer.toString());
    }




    ///       getters   setters    ////


    public DataContainer getDataContainer() {
        return dataContainer;
    }

    public void setDataContainer(DataContainer dataContainer) {
        this.dataContainer = dataContainer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCurentnumber() {
        return curentnumber;
    }

    public void setCurentnumber(int curentnumber) {
        this.curentnumber = curentnumber;
    }
}
