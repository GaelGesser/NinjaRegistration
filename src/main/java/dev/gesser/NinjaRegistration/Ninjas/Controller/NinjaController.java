package dev.gesser.NinjaRegistration.Ninjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/ninjas")
    public String Welcome() {
        return "This is my first message";
    }

}
