package dev.gesser.NinjaRegistration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/ninjas")
    public String Welcome() {
        return "This is my first message";
    }

}
