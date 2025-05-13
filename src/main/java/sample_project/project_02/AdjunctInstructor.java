package sample_project.project_02;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ADJUNCT")
public class AdjunctInstructor extends Member {
    private String companyName;
    private String lectureSubject;

    protected AdjunctInstructor() {}

    public AdjunctInstructor(String name, String contact, String companyName, String lectureSubject) {
        super(name, contact);
        this.companyName = companyName;
        this.lectureSubject = lectureSubject;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLectureSubject() {
        return lectureSubject;
    }

    public void setLectureSubject(String lectureSubject) {
        this.lectureSubject = lectureSubject;
    }
}
