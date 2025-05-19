package sample_project.project_06;

import javax.persistence.Embeddable;

@Embeddable
public class Answer {
    private String objectiveAnswer;
    private String subjectiveAnswer;

    public Answer() {}

    public Answer(String objectiveAnswer, String subjectiveAnswer) {
        this.objectiveAnswer = objectiveAnswer;
        this.subjectiveAnswer = subjectiveAnswer;
    }

    public String getObjectiveAnswer() {
        return objectiveAnswer;
    }

    public void setObjectiveAnswer(String objectiveAnswer) {
        this.objectiveAnswer = objectiveAnswer;
    }

    public String getSubjectiveAnswer() {
        return subjectiveAnswer;
    }

    public void setSubjectiveAnswer(String subjectiveAnswer) {
        this.subjectiveAnswer = subjectiveAnswer;
    }
}

/**
 * @Embeddable 사용
 * 기본 생성자 + 생성자 오버로딩
 * **/