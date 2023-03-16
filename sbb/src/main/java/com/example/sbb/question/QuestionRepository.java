package question;

import org.springframework.data.jpa.repository.JpaRepository; //레포지터리 사용을 위해 필수적으로 필요함

public interface QuestionRepository extends JpaRepository<Question, Integer>{ //jpa리포지터리를 상속, 리포지터리의 대상 엔티티 : Question, 대상엔티티의 PK(primary key) : integar

}
