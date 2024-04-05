package com.example.labgtics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {
    @RequestMapping(value="/principal" , method= RequestMethod.GET)
    public String paginaPrincipal(){
        return "Home";
    }
}
