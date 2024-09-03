package model;

import java.util.Date;

public class Doctor extends  User implements  ISchedulable{
    public Doctor(String fullName, Date birthday){
        super(fullName,birthday);
    }

    @Override
    public void schedule(Date date, String time) {
        System.out.println(date +" - " +  time);
    }
}
