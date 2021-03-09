package com.finalproject.springweb.repository;

import com.finalproject.springweb.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
    //User selectByIdentity(String identity);
}