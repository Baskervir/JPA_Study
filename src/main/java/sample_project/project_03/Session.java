package sample_project.project_03;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Session {
    @Id @GeneratedValue
    private Long id;

    private String topic;

    private LocalDate date;

    private String location;

    @ManyToOne
    @JoinColumn(name = "studygroup_id", nullable = false)
    private StudyGroup studyGroup;

    @OneToMany(mappedBy = "session", cascade = CascadeType.ALL)
    private List<SessionAttendance> attendances;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    public List<SessionAttendance> getAttendances() {
        return attendances;
    }

    public void setAttendances(List<SessionAttendance> attendances) {
        this.attendances = attendances;
    }
}
