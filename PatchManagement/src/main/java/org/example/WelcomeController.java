package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {

    @GetMapping

    public String welcome() {
        return "Welcome to the Patch Management System The Patch Management Software uses a Local server to display the patches on the server running on port 8080!";
    }
}
