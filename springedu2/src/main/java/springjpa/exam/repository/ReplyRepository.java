package springjpa.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import springjpa.exam.entity.Meeting;
import springjpa.exam.entity.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Integer>{
	public List<Reply> findByRefid(Meeting vo); // 메인 글에 대한 댓글들을 list로 받아오겠다~
	public List<Reply> findByRefidId(int id); // 메인글의 id를 사용해서 refid의 id로 리스트를 가져오겠다,,
}
