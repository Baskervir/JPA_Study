package sample_project.project_02;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("STUDENT")
public class Student extends Member {
    private String studentNumber;
    private String major;
    private int year;

    protected Student() {}

    public Student (String name, String contact, String studentNumber, String major, int year) {
        super(name, contact);
        this.studentNumber = studentNumber;
        this.major = major;
        this.year = year;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
