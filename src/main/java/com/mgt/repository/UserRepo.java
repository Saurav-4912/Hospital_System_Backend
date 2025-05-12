package com.mgt.repository;

import com.mgt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long>
{

    boolean existsByUserName(String userName);

    Optional<User> findByUserName(String userName);

    Optional<User> findByUserId(Long id);
}
