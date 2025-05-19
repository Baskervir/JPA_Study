package sample_project.project_06;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id @GeneratedValue
    private Long id;

    private String name;

    private String email;

    @ElementCollection
    @CollectionTable(name = "user_answer", joinColumns = @JoinColumn(name = "user_id"))
    private List<Answer> answers = new ArrayList<>();

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

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}

/**
 * @ElementCollection -> 값 타입 컬렉션으로 설정
 * @CollectionTable(name = "user_answer", joinColumns = @JoinColumn(name = "user_id"))
 *      -> 별도 테이블 지정 밑 외래 키 설정
 * 컬렉션 타입으로 List<Answer> 지정
 * **/
