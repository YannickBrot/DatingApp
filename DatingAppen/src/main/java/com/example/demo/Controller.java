package com.example.demo;

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


    @GetMapping ("/administrator")
    public String administrator(){ return ("administrator"); }

    @GetMapping ("/user")
    public String user(){ return ("user"); }

    //bruger

    @GetMapping ("/findUsers")
    public String findUsers(){ return ("findUsers"); }

    @GetMapping ("/candidateList")
    public String candidateList(){ return ("candidateList"); }

    @GetMapping ("/messages")
    public String messages(){ return ("messages"); }

    @GetMapping ("/profile")
    public String profile(){ return ("profile"); }

    //footer

    @GetMapping ("/privacyPolicy")
    public String privacyPolicy(){ return ("privacyPolicy"); }


}

