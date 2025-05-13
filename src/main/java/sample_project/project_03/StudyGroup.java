package sample_project.project_03;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class StudyGroup {
    @Id @GeneratedValue
    private Long id;

    private String name;

    private LocalDate createdDate;

    @Enumerated(EnumType.STRING)
    private StudyMode mode;

    @ManyToMany
    @JoinTable(
            name = "studyGroup_partidipant",
    joinColumns = @JoinColumn(name = "studygroup_id"),
    inverseJoinColumns = @JoinColumn(name = "participant_id")
    )
    private Set<Participant> participants = new HashSet<>();

    @OneToMany(mappedBy = "studyGroup", cascade = CascadeType.ALL)
    private List<Session> sessions;

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

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public StudyMode getMode() {
        return mode;
    }

    public void setMode(StudyMode mode) {
        this.mode = mode;
    }

    public Set<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}
