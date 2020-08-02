package com.appddiction.challenge.api.appddiction_challenge_api.repositories;

import com.appddiction.challenge.api.appddiction_challenge_api.models.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person, Integer> {
    
}