package com.example.study.bootjpa.dao;

import com.example.study.bootjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Transactional
    @Modifying
    @Query("update User u set u.remark = ?2 where u.id = ?1")
    void updateRemark(Long id, String remark);
}
