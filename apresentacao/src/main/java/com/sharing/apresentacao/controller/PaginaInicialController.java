package com.sharing.apresentacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class PaginaInicialController {

    @GetMapping
    public String index() {
        return "index";
    }


}
