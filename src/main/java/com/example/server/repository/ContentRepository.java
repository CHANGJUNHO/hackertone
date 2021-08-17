package com.example.server.repository;

import com.example.server.entity.MemberChat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends CrudRepository<MemberChat, Long> {
//TODO MemberChat내 DTO 생성 구현
}
