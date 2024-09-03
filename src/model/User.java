package model;

import java.util.Date;

public class User {
    public User(String fullName, Date birthday){
        this.Birthday= birthday;
        this.FullName= fullName;
    }
    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private Date Birthday;
    private String FullName;
}
