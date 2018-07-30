import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;

/**
 * Copyright (c) Anton on 25.07.2018.
 */


public class Employee {
    private EmployeeType employeeType;

    private int id;

    private String surname;

    private String name;

    private String patronomic;

    private String birthday;

    private String dayOfStart;

    private ArrayList<Employee> inSubmission;

    private String about;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronomic() {
        return patronomic;
    }

    public void setPatronomic(String patronomic) {
        this.patronomic = patronomic;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDayOfStart() {
        return dayOfStart;
    }

    public void setDayOfStart(String dayOfStart) {
        this.dayOfStart = dayOfStart;
    }

    public ArrayList<Employee> getInSubmission() {
        return inSubmission;
    }

    public void setInSubmission(ArrayList<Employee> inSubmission) {
        this.inSubmission = inSubmission;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
}
