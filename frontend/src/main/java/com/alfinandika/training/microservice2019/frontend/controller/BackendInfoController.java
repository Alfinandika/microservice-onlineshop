package com.alfinandika.training.microservice2019.frontend.controller;

import com.alfinandika.training.microservice2019.frontend.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BackendInfoController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/backend")
    public ModelMap backendInfo(){
        return new ModelMap().addAttribute("backendInfo", catalogService.backendInfo());
    }

}
