package com.example.demo;

import com.example.demo.JDBCWriter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@org.springframework.stereotype.Controller
public class Controller {
    com.example.demo.JDBCWriter jdbcWriter = new JDBCWriter();

    @GetMapping
    public String welcome(Model model){
        model.addAttribute("Gonnect", jdbcWriter.setConnection());
        return ("welcome");
    }

    @GetMapping ("/home")
    public String home(){
        return ("home");
    }

}
