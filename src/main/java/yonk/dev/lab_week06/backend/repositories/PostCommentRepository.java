package yonk.dev.lab_week06.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yonk.dev.lab_week06.backend.entities.PostComment;

import java.math.BigInteger;

@Repository
public interface PostCommentRepository extends JpaRepository<PostComment, BigInteger> {
}
