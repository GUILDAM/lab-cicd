package fiap.devops.cicd.labcicd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "It's working, now with WebHook!";
    }

}
