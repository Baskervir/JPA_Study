package sample_project.project_01;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Member {
    @Id @GeneratedValue
    private Long id;

    private String memberName;

    private String memberNumber;

    private String major;

    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;

    @ManyToMany(mappedBy = "participants")
    private Set<Activity> activities = new HashSet<>();
}

/**
 * 설계 이유 설명
 * 1. @ManyToOne (Club)
 * 회원은 하나의 동아리에만 소속 -> 단방향 다대일로 설정
 * Member가 연관관계의 주인 (FK를 소유하므로 @JoinColumn 사용)
 *
 * 2. @ManyToMany(meppedBy = "perticipants") (Activity)
 * Activity 클래스에서 @JoinTable을 정의했기 때문에, 여기서는 mappedBy를 통해 비주인으로 설정
 * */