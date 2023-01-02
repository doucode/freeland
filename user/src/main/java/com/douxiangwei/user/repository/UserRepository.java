package com.douxiangwei.user.repository;

import com.douxiangwei.user.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    public boolean existsByPhoneNumber(String phoneNumber);
    public User findByPhoneNumber(String phoneNumber);
}
