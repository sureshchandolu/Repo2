package com.oto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oto.entity.Person;

@Repository
public interface PersonRepostory extends JpaRepository<Person,Integer>{

}
