package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
final class HelloController {

    @RequestMapping("/")
    final String index() {
        return "Greetings from Spring Boot!";
    }

}