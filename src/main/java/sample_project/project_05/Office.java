package sample_project.project_05;

import javax.persistence.*;

@Entity
public class Office {
    @Id @GeneratedValue
    private Long id;

    private String officeName;

    private String officeLocation;

    private String department;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID")
    private Company company;
}
