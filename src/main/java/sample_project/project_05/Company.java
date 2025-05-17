package sample_project.project_05;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Company {
    @Id @GeneratedValue
    @Column(name = "COMPANY_ID")
    private Long id;

    private String companyName;

    private String mainCompanyLocation;

    @OneToMany(mappedBy = "company")
    Set<Office> offices = new HashSet<Office>();

//    @OneToMany(mappedBy = "company")
//    List<Office> offices = new ArrayList<Office>();
}

/**
 * Set으로 바꾼 이유
 * List : 순서 보장, 중복 허용 (순서가 의미 있는 경우 유리하다)
 * Set : 순서 없음, 중복 불허 (연관된 객체가 중복되면 안되는 경우 유리하다)
 *
 * 중복된 Office 객체가 들어가면  안되는 상황 -> Set!
 * 양방향 관계에서 add() 중복 방지에도 효과 있음
 * **/