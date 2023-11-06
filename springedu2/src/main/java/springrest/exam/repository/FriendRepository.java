package springrest.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springrest.exam.entity.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Integer> {
}
