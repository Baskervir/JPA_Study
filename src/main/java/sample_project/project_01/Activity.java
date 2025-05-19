package sample_project.project_01;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Activity {
    @Id @GeneratedValue
    private Long id;

    private String actName;

    @Temporal(TemporalType.DATE)
    private Date actDate;
    private String actLocation;

    @ManyToMany
    @JoinTable(
            name = "member_activity",
            joinColumns = @JoinColumn(name = "activity_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id")
    )
    private Set<Member> participants = new HashSet<>();
}

/**
 * 설계 이유
 * @ManyToMany
 * 활동 1개에는 여러 명의 회원이 참여 가능
 * 회원 1명도 여러 활동에 참여할 수 있으므로 다대다 관계
 *
 * Activity가 연관관계의 주인이다
 * 주인은 @JoinTable을 정의하고 외래 키를 관리한다
 * 명시적으로 관계 테이블을 선언하는 쪽이 주인으로 설정된다
 * 반대로 Member쪽에서는 mappedBy = "participants"를 통해 비주인으로 설정
 * */