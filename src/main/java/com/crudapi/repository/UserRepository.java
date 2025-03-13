package com.crudapi.repository;

import com.crudapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("""
        SELECT u
        FROM User AS u
        WHERE u.isDeleted = false
    """)
    List<User> findAllActiveUsers();
}
