package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import study.datajpa.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);

    //전체 조회
    List<Member> findHelloBy();

    List<Member> findTop3By();

//    @Query(name = "Member.findByUsername")
    List<Member> findByUsername(@Param("username") String username);
}
