package sample_project.project_03;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Participant {
    @Id @GeneratedValue
    private Long id;

    private String name;

    private String email;

    private LocalDate joinedDate;

    @ManyToMany(mappedBy = "participants")
    private Set<StudyGroup> studyGroups = new HashSet<>();

    @OneToMany(mappedBy = "participant", cascade = CascadeType.ALL)
    private List<SessionAttendance> attendances;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(LocalDate joinedDate) {
        this.joinedDate = joinedDate;
    }

    public Set<StudyGroup> getStudyGroups() {
        return studyGroups;
    }

    public void setStudyGroups(Set<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }

    public List<SessionAttendance> getAttendances() {
        return attendances;
    }

    public void setAttendances(List<SessionAttendance> attendances) {
        this.attendances = attendances;
    }
}
