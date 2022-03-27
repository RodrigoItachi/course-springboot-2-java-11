package com.hawkandwolf.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hawkandwolf.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
