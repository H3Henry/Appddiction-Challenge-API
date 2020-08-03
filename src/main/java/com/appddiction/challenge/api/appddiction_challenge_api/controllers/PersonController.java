package com.appddiction.challenge.api.appddiction_challenge_api.controllers;

import java.util.List;

import com.appddiction.challenge.api.appddiction_challenge_api.models.Person;
import com.appddiction.challenge.api.appddiction_challenge_api.repositories.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "person")
public class PersonController {

    @Autowired
    private PersonRepository pplRepo;

    @GetMapping(value = "/get-all")
    public List<Person> getAllPpl() {
        return pplRepo.findAll();
    }

    @PostMapping(value = "/save")
    public Person savePerson(@RequestBody Person p) {
        
        return pplRepo.save(p);
    }

    @DeleteMapping(value = "/delete")
    public void deletePerson(@RequestParam Integer id) {
        pplRepo.deleteById(id);
    }
}