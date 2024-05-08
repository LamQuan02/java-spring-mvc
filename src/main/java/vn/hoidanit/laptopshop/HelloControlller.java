package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlller {

    @RequestMapping("/")
    public String index() {
        return "Hello word from ask me";
    }

}
