package com.collectivercm.automation.AvailityBot.AvailityBot.api;

import com.collectivercm.automation.AvailityBot.AvailityBot.service.impl.AvailityClaimStatusService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
public class ClaimStatusController {

    @Autowired
    private AvailityClaimStatusService availityClaimStatusService;

    @GetMapping(value = "/")
    public void getPage(){
        try {
            availityClaimStatusService.authenticate();
        }catch (Throwable e){
            throw new Error(e);
        }
//        return "welcome";
    }
}
