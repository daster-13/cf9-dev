package gr.aueb.cf.cf9.ch11;

import javax.swing.plaf.PanelUI;

public class Student {
    private static int studentCount = 0;

    // static block

    static{
        studentCount = 0;
    }

    private int id;
    private String firstname;
    private String lastname;


    //Default constructor
    public Student() {
        studentCount++;

    }
    // Overloaded constructor
    public Student(int id, String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public static int getStudentCount() {
        return studentCount;
    }
}

