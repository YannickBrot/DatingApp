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

    @GetMapping ("/bruger")
    public String bruger(){ return ("bruger"); }

    //bruger

    @GetMapping ("/findBrugere")
    public String findBrugere(){ return ("findBrugere"); }

    @GetMapping ("/kandidatListe")
    public String kandidatListe(){ return ("kandidatListe"); }

    @GetMapping ("/beskeder")
    public String beskeder(){ return ("beskeder"); }

    @GetMapping ("/profil")
    public String profil(){ return ("profil"); }
}

