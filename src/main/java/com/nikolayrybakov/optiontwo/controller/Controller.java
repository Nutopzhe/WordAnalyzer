package com.nikolayrybakov.optiontwo.controller;

import com.nikolayrybakov.optiontwo.Util;
import com.nikolayrybakov.optiontwo.model.Letter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wordanalyzer")
public class Controller {

    @GetMapping("/analyze")
    public Letter getLetter(@RequestParam("word") String word) {
        return Util.searchLetter(word);
    }
}
