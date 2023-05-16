package sg.nus.iss.visa.ssf.vttpworkshop12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/api")
public class RandomNumberGenController {

    @GetMapping("/home")
    public String langingPage(){
        return "home";
    }
    
}
