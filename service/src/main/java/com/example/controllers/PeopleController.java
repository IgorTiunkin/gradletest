package com.example.controllers;

import com.example.services.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/people")
public class PeopleController {
    private final PeopleService peopleService;

    @RequestMapping
    public String index () {
        return "hello";
    }

    @RequestMapping("/all")
    public String allPeople (Model model) {
        model.addAttribute("people", peopleService.getAllPeople());
        return "people/all";
    }
}
