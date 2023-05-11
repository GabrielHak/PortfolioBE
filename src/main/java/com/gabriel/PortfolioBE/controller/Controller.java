package com.gabriel.PortfolioBE.controller;

import com.gabriel.PortfolioBE.models.Section;
import com.gabriel.PortfolioBE.service.ISectionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private ISectionService iss;
    
    @PostMapping("/newSection")
    public void newSection(@RequestBody Section sec){
        iss.newSection(sec);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/viewSections")
    @ResponseBody
    public List<Section> viewSections(){
        return iss.viewSections();
    }
    
    @DeleteMapping("/deleteSection/{id}")
    public void borrarPersona(@PathVariable Long id){
        iss.deleteSection(id);
    }
}
