package sample_project.project_04;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Team {
    @Id @GeneratedValue
    private Long id;

    private String teamName;

    @OneToMany(mappedBy = "team")
    private Set<Member> members = new HashSet<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addMember(Member member) {
        members.add(member);
        member.setTeam(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }
}
