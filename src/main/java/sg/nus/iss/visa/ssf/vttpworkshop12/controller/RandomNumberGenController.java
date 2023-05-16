package sg.nus.iss.visa.ssf.vttpworkshop12.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import sg.nus.iss.visa.ssf.vttpworkshop12.model.Image;
import sg.nus.iss.visa.ssf.vttpworkshop12.service.RandomNumService;

@Controller
public class RandomNumberGenController {

    //injecting service class depedency
    @Autowired
    RandomNumService service;


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

        //calling service method to generate random numbers
        List<Integer> randomNumbers = service.generateRanNumbers(number);


        //populate image objects and create list of Image objects
        List<Image> imageList = new ArrayList<Image>();

       

        for(int randomNumber : randomNumbers){
            imageList.add(new Image(Integer.toString(randomNumber), "/images/"+Integer.toString(randomNumber)+".png"));
        }
        System.out.println("image list :" + imageList);

        model.addAttribute(imageList);

        return "display";
    }
    

}
