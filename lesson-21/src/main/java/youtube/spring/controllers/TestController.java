package youtube.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("people/test")
    public String test() {
        return "people/test";
    }
}
