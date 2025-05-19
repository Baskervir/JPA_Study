package sample_project.project_01;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Club {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date createdTime;

    @OneToMany(mappedBy = "club")
    private Set<Member> members = new HashSet<>();
}

/**
 * 설계 이유
 * @OneToMany(mappedBy = "club)
 * mappedBy = "club" -> Member 클래스의 club 필드를 기준으로 연관관계를 설정 (비주인)
 * 연관관계의 주인은 Member -> 외래 키를 가지고 있고, @JoinColumn 설정
 * 
 * 클럽에서 회원 목록을 바로 조회할 수 있도록 양방향 설정
 * */