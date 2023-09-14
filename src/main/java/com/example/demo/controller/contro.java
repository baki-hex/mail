package com.example.demo.controller;

//import org.apache.commons.validator.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.tnmblr;
import com.example.demo.repss.Reps;
import com.example.demo.service.Serv;

import org.apache.commons.validator.routines.EmailValidator;

@RestController
public class contro {
    @Autowired
    Reps rep;

    @Autowired
    Serv srv;
   
    
@PostMapping(path="/get/{recepient}")
    public @ResponseBody String getpart(@PathVariable("recepient") String to,@RequestParam String txt){
       
if(!EmailValidator.getInstance().isValid(to)){
    return "malicious request"; 
} 
        tnmblr tm = new tnmblr();
        tm.setRecvmail(to);
       if(rep.existsByrecvmail(to)){
srv.sett(to,txt);
       }else{
         srv.sett(to,txt);
        rep.save(tm);
       }
        return "suzzessfully saved";
    }


}
