package com.bob.dao;


import com.bob.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author wenhaibo
 * @date 18-7-27
 */

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
