package com.mgt.repository;

import com.mgt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long>
{

    boolean existsByUsername(String username);

    Optional<User> findByUsername(String userName);

    
}
