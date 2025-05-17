package sample_project.project_05;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Company {
    @Id @GeneratedValue
    @Column(name = "COMPANY_ID")
    private Long id;

    private String companyName;

    private String mainCompanyLocation;
}
