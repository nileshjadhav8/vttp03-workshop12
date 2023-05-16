package sg.nus.iss.visa.ssf.vttpworkshop12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RandomNumberGenController {

    @GetMapping("/home")
    public String langingPage(){
        return "home";
    }

    @GetMapping("/get")
    public String generateRanNumbers(Model model, HttpServletRequest request){
    
        //fetch input param
        int number = Integer.parseInt(request.getParameter("number"));

        System.out.println("input no is: " +number);

        //check condition if no is between 0-30
        if(number < 1 || number > 30){

            String errorMessage = "Invalid Number: " +number;
            model.addAttribute("errorMessage", errorMessage);
            return "home";
        }

        return "display";
    }
    

}
