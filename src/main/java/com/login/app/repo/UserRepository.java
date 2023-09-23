package com.login.app.repo;

import com.login.app.constant.AppsConstants;
import com.login.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    User findByEmailAndPassword(String email, String password);

    User findByUserIDAndUserRole(Integer userID, AppsConstants.UserRole userRole);
}
