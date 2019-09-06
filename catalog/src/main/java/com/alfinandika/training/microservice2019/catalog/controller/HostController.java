package com.alfinandika.training.microservice2019.catalog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HostController {

    @GetMapping("/api/host/")
    public Map<String, Object> hostInfo(HttpServletRequest request){
        Map<String, Object> info = new HashMap<>();
        info.put("Host", request.getLocalName());
        info.put("address", request.getLocalAddr());
        info.put("Port", request.getLocalPort());

        return info;
    }
}
