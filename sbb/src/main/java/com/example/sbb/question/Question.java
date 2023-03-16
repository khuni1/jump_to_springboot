package question;

import java.time.LocalDateTime;

import answer.Answer;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity


public class Question {
    @Id //class Question의 primary key를 기본 키로 지정.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GeneratedValue - 1씩 자동으로 증가하여 저장. strategy 옵션 : 일정한 속성의 고유번호 생성
    private Integer id;
    @Column(length = 200) //length - column의 길이 설정.
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList; //질문에 대한 답변은 여러개 - 따라서, one to many


}
