package com.gaspno.jokeschucknorris.controllers;

import com.gaspno.jokeschucknorris.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;


    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value={"/",""})
    public String ShowJoke(Model model){

        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }
}
