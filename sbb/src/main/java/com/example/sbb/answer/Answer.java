package answer;

import java.time.LocalDateTime;

import question.Question;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne //질문 엔티티에 연결하기 위해 추가하는 에너테이션. 하나의 질문에 여러개가 달릴 수 있음 - many(답변), one(질문)
    private Question question;
}
