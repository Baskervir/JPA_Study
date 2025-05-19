package sample_project.project_02;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PROFESSOR")
public class Professor extends Member {
    private String officeLocation;
    private String researchArea;

    protected Professor() {}

    public Professor(String name, String contact, String officeLocation, String researchArea) {
        super(name, contact);
        this.officeLocation = officeLocation;
        this.researchArea = researchArea;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }
}
