package com.lilistech.organized.repository;


import com.lilistech.organized.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    public Long countById(Long id);
}
