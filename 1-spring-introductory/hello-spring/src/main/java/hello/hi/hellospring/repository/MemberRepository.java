package hello.hi.hellospring.repository;

import hello.hi.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> finByName(String name);
    List<Member> findAll();
}