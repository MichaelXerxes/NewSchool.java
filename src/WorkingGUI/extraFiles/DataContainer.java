package WorkingGUI.extraFiles;

import Assignment2OOP.HolidayPlan;
import Assignment2OOP.Policy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class DataContainer {
    private ArrayList<String> TravellersNames=new ArrayList<String>();
    private ArrayList<Calendar> TravelelrsDoB=new ArrayList<Calendar>();
    private ArrayList<String>  TravellerLevel=new ArrayList<String>();
    private ArrayList<String> TravellerActivity=new ArrayList<String>();
    private String HPid, HPname;
    private Calendar HPdateCreated;
    private Policy HPpolicy;
    private String HPinsuranceStatus;
    private String HPdestination;
    private double HPcost;
    private String policyNum, policyOwnername,status,policyType;
    private Calendar PownerDoB, PsDate, PeDate,HPownerDoB;
    private  String HPownerDoBstring,SDatestring,EDatestring,PownerDoBstring;
    private double PdailyRate, premium;
    private String ForPolicyholidayPlanID;
    private String userDestination;
    private int NumberofTravellers;
    private final double EquipmnetCover=40;
    private double highestRate;

    public DataContainer(){

    }
    public String toString(){
        String str="";
        str+="******** Holiday Plan details ********"+"\n";
        str+="Holiday Plan ID          : "+getHPid()+"\n";
        str+="Holiday Plan  Owner name : "+getHPname()+"\n";
        setHPownerDoB(setAnYDate(getHPownerDoBstring()));// changing date format string into calendar
        str+="Holiday Plan Owner DoB   : "+getHPownerDoB().get(Calendar.DATE)+"/"+getHPownerDoB().get(Calendar.MONTH)+
                "/"+getHPownerDoB().get(Calendar.YEAR)+"\n";
        str+="Holiday Plan Destination : "+getHPdestination()+"\n";
        setHPdateCreated(HPdateCreated= Calendar.getInstance());//set actual date
        str+="Holiday Plan Date Created: "+getHPdateCreated().get(Calendar.DATE)+"/"+getHPdateCreated().get(Calendar.MONTH)+
                "/"+getHPdateCreated().get(Calendar.YEAR)+"\n";
        str+="Holiday Plan - Policy ID : "+getPolicyNum()+"\n";
        setHPcost(getPremium());// this shouldn`t be here   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        str+="Holiday Plan Total cost  : "+getHPcost()+"\n";
        str+="\n";
        str+="******** Policy details ********"+"\n";
        str+="Policy Number       : "+getPolicyNum()+"\n";
        str+="Policy Type         : "+getPolicyType()+"\n";
        str+="Policy Status       : "+getStatus()+"\n";
        str+="Policy Destination  : "+getUserDestination()+"\n";
        str+="Policy Owner Name   : "+getPolicyOwnername()+"\n";
        setPownerDoB(setAnYDate(getPownerDoBstring()));//set date from string to calendar
        str+="Policy Owner DoB    : "+getPownerDoB().get(Calendar.DATE)+"/"+getPownerDoB().get(Calendar.MONTH)+
                "/"+getPownerDoB().get(Calendar.YEAR)+"\n";
        setPsDate(setAnYDate(getSDatestring()));//set date from string to calendar
        str+="Policy Start date   : "+getPsDate().get(Calendar.DATE)+"/"+getPsDate().get(Calendar.MONTH)+
                "/"+getPsDate().get(Calendar.YEAR)+"\n";
        setPeDate(setAnYDate(getEDatestring()));//set date from string to calendar
        str+="Policy End   date   : "+getPeDate().get(Calendar.DATE)+"/"+getPeDate().get(Calendar.MONTH)+
                "/"+getPeDate().get(Calendar.YEAR)+"\n";
        str+="Policy Premium      : "+getPremium()+"\n";
        str+="Policy daily rate   : "+getPdailyRate()+"\n";
        str+="********************************";

        return  str;
    }
    public String DisplayTravellersRoW(){//String method to Display Traveller details
        String str="";
        str+="Travellers information : \n";
        for(int i=0;i<getNumberofTravellers();i++){
            str+="Name :"+getTravellersNames().get(i)+" DoB :"+ getTravelelrsDoB().get(i).get(Calendar.DATE)
                    +  "/" + ((getTravelelrsDoB().get(i).get(Calendar.MONTH))+1) +  "/"
                    + getTravelelrsDoB().get(i).get(Calendar.YEAR)+"\n";
        }
        return  str;
    }//end method
    public String DisplayTravellersHazard(){//String method to Display Traveller details
        String str="";
        str+="Travellers information : \n";
        for(int i=0;i<getNumberofTravellers();i++){
            str+="Name :"+getTravellersNames().get(i)+" DoB :"+ getTravelelrsDoB().get(i).get(Calendar.DATE)
                    +  "/" + ((getTravelelrsDoB().get(i).get(Calendar.MONTH))+1) +  "/"
                    + getTravelelrsDoB().get(i).get(Calendar.YEAR)+
                    " Activity "+TravellerActivity.get(i)+"\n";

        }

        return  str;
    }//end method
    public String DisplayTravellersWinter(){//String method to Display Traveller details
        String str="";
        str+="Travellers information : \n";
        for(int i=0;i<getNumberofTravellers();i++){
            str+="Name :"+getTravellersNames().get(i)+" DoB :"+ getTravelelrsDoB().get(i).get(Calendar.DATE)
                    +  "/" + ((getTravelelrsDoB().get(i).get(Calendar.MONTH))+1) +  "/"
                    + getTravelelrsDoB().get(i).get(Calendar.YEAR)+
                    " Activity "+TravellerActivity.get(i)+
                    " Level : "+TravellerLevel.get(i)+"\n";
        }

        return  str;
    }//end method


    public Calendar setAnYDate(String string) {// method to change date in string into calendar format
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar DOBtest = Calendar.getInstance();
        String date = "";
        int error = 0;
        do {    //read date from keyboard as String
            //System.out.print("Enter Date : Follow instruction");
            date = string;//call method that return String to set proper and logic date format
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
    public void calPremiumRoW(double price){// total cost for RoW
        setPsDate(setAnYDate(getSDatestring()));//change string date into calendar format using method
        setPeDate(setAnYDate(getEDatestring()));//change string date into calendar format using method
        //work out number of days of policy and calculate premium based on a daily rate and number of people
        if(getPsDate()!= null && getPeDate()!= null)
        {
            System.err.println("price daily rtae "+price);
            long time1 = getPsDate().getTimeInMillis();
            long time2 = getPeDate().getTimeInMillis();
            long diff = time2 - time1;
            long days = diff/1000/60/60/24;
            System.err.println(days+" days");
            setPremium(days*price);
            //premium =days * price;
        }
        else
            setPremium(0);
            //premium = 0;
    }
    public double getDailyRateRoW(){//method return price for RoW
        String userDestination=getUserDestination();
        if(userDestination.equals("North America")){
            setPdailyRate(7);
        }else if(userDestination.equals("South America")){
            setPdailyRate(8);
        }else if(userDestination.equals("Asia")){
            setPdailyRate(9);
        }else if(userDestination.equals("Rest World")){
            setPdailyRate(10);
        }
        return getPdailyRate();
    }
    public void calPremiumHazard(double price){// cost for Hazard
        calPremiumRoW(price);
    }
    public void calPremiumWinter(double price){
        double testnumber,totalCover;
        price=setproperDailyRateWinter();
        calPremiumRoW(price);//call method

        testnumber=getPremium();//assign value using get method
        //System.out.println(testnumber);
        testnumber=testnumber*getNumberofTravellers();//calculate cost for all travellers without extras
        //System.out.println(testnumber);
        totalCover=(EquipmnetCover*getNumberofTravellers());//Extra cost
        //System.out.println(totalCover);
        setPremium(totalCover+testnumber);//total cost

    }
    public double setproperDailyRateWinter() {// for Winter Policy
        //method checking for String data in ArrayLIst TravellerLevel. The highest value is then taken as highestRate
        double number1=-1,number2=0;
        getTravellerActivity();
        for (int i = 0; i < getNumberofTravellers(); i++) {
            // for loop checking each ArrayList object
            if (TravellerActivity.get(i).contains("Snowboard")) {
                number1=12;
            } else if (TravellerActivity.get(i).contains("Skis")) {
                number1=13;
            } else if (TravellerActivity.get(i).contains("Skates")) {
                number1=5;
            } else if (TravellerActivity.get(i).contains("Hiking")) {
                number1=10;
            } else if (TravellerActivity.get(i).contains("Climbing")) {
                number1=20;
            }
            if(number2<=number1){
                setHighestRate(number1);
                number2=number1;
            }
        }
        return highestRate;
    }//end method


    ///           getters and setters        ///


    public double getHighestRate() {
        return highestRate;
    }

    public void setHighestRate(double highestRate) {
        this.highestRate = highestRate;
    }

    public String getPownerDoBstring() {
        return PownerDoBstring;
    }

    public void setPownerDoBstring(String pownerDoBstring) {
        PownerDoBstring = pownerDoBstring;
    }

    public Calendar getHPownerDoB() {
        return HPownerDoB;
    }

    public void setHPownerDoB(Calendar HPownerDoB) {
        this.HPownerDoB = HPownerDoB;
    }

    public String getHPownerDoBstring() {
        return HPownerDoBstring;
    }

    public void setHPownerDoBstring(String HPownerDoBstring) {
        this.HPownerDoBstring = HPownerDoBstring;
    }

    public String getSDatestring() {
        return SDatestring;
    }

    public void setSDatestring(String SDatestring) {
        this.SDatestring = SDatestring;
    }

    public String getEDatestring() {
        return EDatestring;
    }

    public void setEDatestring(String EDatestring) {
        this.EDatestring = EDatestring;
    }

    public ArrayList<String> getTravellersNames() {
        return TravellersNames;
    }

    public void setTravellersNames(String travellersName) {
        TravellersNames.add(travellersName);
    }

    public ArrayList<Calendar> getTravelelrsDoB() {
        return TravelelrsDoB;
    }

    public void setTravelelrsDoB(Calendar travelelrsDoB) {
        TravelelrsDoB.add(travelelrsDoB);
    }

    public ArrayList<String> getTravellerLevel() {
        return TravellerLevel;
    }

    public void setTravellerLevel(String travellerLevel) {
        TravellerLevel.add(travellerLevel);
    }

    public ArrayList<String> getTravellerActivity() {
        return TravellerActivity;
    }

    public void setTravellerActivity(String travellerActivity) {
        TravellerActivity.add(travellerActivity);
    }

    public String getHPid() {
        return HPid;
    }

    public void setHPid(String HPid) {
        this.HPid = HPid;
    }

    public String getHPname() {
        return HPname;
    }

    public void setHPname(String HPname) {
        this.HPname = HPname;
    }

    public Calendar getHPdateCreated() {
        return HPdateCreated;
    }

    public void setHPdateCreated(Calendar HPdateCreated) {
        this.HPdateCreated = HPdateCreated;
    }

    public Policy getHPpolicy() {
        return HPpolicy;
    }

    public void setHPpolicy(Policy HPpolicy) {
        this.HPpolicy = HPpolicy;
    }

    public String getHPinsuranceStatus() {
        return HPinsuranceStatus;
    }

    public void setHPinsuranceStatus(String HPinsuranceStatus) {
        this.HPinsuranceStatus = HPinsuranceStatus;
    }

    public String getHPdestination() {
        return HPdestination;
    }

    public void setHPdestination(String HPdestination) {
        this.HPdestination = HPdestination;
    }

    public double getHPcost() {
        return HPcost;
    }

    public void setHPcost(double HPcost) {
        this.HPcost = HPcost;
    }

    public String getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(String policyNum) {
        this.policyNum = policyNum;
    }

    public String getPolicyOwnername() {
        return policyOwnername;
    }

    public void setPolicyOwnername(String policyOwnername) {
        this.policyOwnername = policyOwnername;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Calendar getPownerDoB() {
        return PownerDoB;
    }

    public void setPownerDoB(Calendar pownerDoB) {
        PownerDoB = pownerDoB;
    }

    public Calendar getPsDate() {
        return PsDate;
    }

    public void setPsDate(Calendar psDate) {
        PsDate = psDate;
    }

    public Calendar getPeDate() {
        return PeDate;
    }

    public void setPeDate(Calendar peDate) {
        PeDate = peDate;
    }

    public double getPdailyRate() {
        return PdailyRate;
    }

    public void setPdailyRate(double pdailyRate) {
        PdailyRate = pdailyRate;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public String getForPolicyholidayPlanID() {
        return ForPolicyholidayPlanID;
    }

    public void setForPolicyholidayPlanID(String forPolicyholidayPlanID) {
        ForPolicyholidayPlanID = forPolicyholidayPlanID;
    }

    public String getUserDestination() {
        return userDestination;
    }

    public void setUserDestination(String userDestination) {
        this.userDestination = userDestination;
    }

    public int getNumberofTravellers() {
        return NumberofTravellers;
    }

    public void setNumberofTravellers(int numberofTravellers) {
        NumberofTravellers = numberofTravellers;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }
}
