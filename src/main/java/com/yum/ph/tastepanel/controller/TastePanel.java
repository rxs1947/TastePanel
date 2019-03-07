package com.yum.ph.tastepanel.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Test Service API")
public class TastePanel {

    @GetMapping("/ping")
    public String index() {
        return "TastePanel application is running.";
    }
}
