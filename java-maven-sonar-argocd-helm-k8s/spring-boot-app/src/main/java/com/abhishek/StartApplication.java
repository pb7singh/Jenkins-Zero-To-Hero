package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    // Duplicate Code Example
    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "I have successfully built a Spring Boot application using Maven");
        model.addAttribute("msg", "This application is deployed on Kubernetes using Argo CD");
        return "index";
    }

    // Another endpoint with duplicate code
    @GetMapping("/another")
    public String another(final Model model) {
        model.addAttribute("title", "I have successfully built a Spring Boot application using Maven");
        model.addAttribute("msg", "This application is deployed on Kubernetes using Argo CD");
        return "index";
    }

    // Hardcoded Sensitive Data (for security issues detection)
    public void someMethod() {
        String password = "admin123";  // Avoid hardcoding sensitive information
        System.out.println("Password: " + password);
    }

    // Another method to demonstrate a potential lack of test coverage
    public void untestedMethod() {
        System.out.println("This method is not tested!");
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
