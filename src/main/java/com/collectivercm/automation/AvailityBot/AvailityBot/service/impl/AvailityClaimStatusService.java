package com.collectivercm.automation.AvailityBot.AvailityBot.service.impl;

import com.collectivercm.automation.AvailityBot.AvailityBot.service.ClaimStatusService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Service;

import java.io.File;
import java.time.Duration;

@Service
public class AvailityClaimStatusService implements ClaimStatusService {

    @Override
    public void authenticate() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganga Jayakody\\Downloads\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\Ganga Jayakody\\Downloads\\extension_3_57_0_0.crx"));
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        driver.get("https://apps.availity.com/availity/web/public.elegant.login");
        driver.manage().window().maximize();
    }
}
