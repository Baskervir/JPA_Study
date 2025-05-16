package sample_project.project_04;

import javax.persistence.*;

@Entity
public class Member {
    @Id @GeneratedValue
    private Long id;

    private String memberName;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
