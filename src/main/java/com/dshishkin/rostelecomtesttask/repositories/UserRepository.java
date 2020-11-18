package com.dshishkin.rostelecomtesttask.repositories;

import com.dshishkin.rostelecomtesttask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
