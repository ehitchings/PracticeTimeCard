package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by castro on 10/28/16.
 */

@Controller
public class ViewController {

@RequestMapping("/")
    public String index(Model model){
    model.addAttribute("Date",new Date());
    model.addAttribute("username","Castro");

    return "index";
}


}
