package com.Vitor.citiesapi.states;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")

public class StateResource {

    @Autowired
    private StateRepository repository;

    /*private final StateRepository repository;

    public StateResource(final StateRepository repository) {

        this.repository = repository;
    } */

    @GetMapping
    public List<State> states() {

        return repository.findAll();
        }
    /*public Page<State> staties(Pageable page){
        return repository.findAll(page);
    }*/
}
