package com.gabriel.PortfolioBE.controller;

import com.gabriel.PortfolioBE.models.Section;
import com.gabriel.PortfolioBE.models.Subsection;
import com.gabriel.PortfolioBE.service.ISectionService;
import com.gabriel.PortfolioBE.service.ISubsectionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
    private ISectionService iss;
    private ISubsectionService isubser;

    @Autowired
    public Controller(ISectionService iss, ISubsectionService isubser) {
        this.iss = iss;
        this.isubser = isubser;
    }
    
    @PostMapping("/newSection")
    public void newSection(@RequestBody Section sec){
        iss.newSection(sec);
    }
    
    @GetMapping("/viewSections")
    @ResponseBody
    public List<Section> viewSections(){
        return iss.viewSections();
    }
    
    @DeleteMapping("/deleteSection/{id}")
    public void deleteSection(@PathVariable Long id){
        iss.deleteSection(id);
    }
    
    @GetMapping("/searchSectionByTitle/{title}")
    public List<Section> searchSectionByTitle(@PathVariable String title){
        return iss.searchSectionByTitle(title);
    }
    
    @PostMapping("/newSubsection")
    public void newSubsection(@RequestBody Subsection sub){
        isubser.newSubsection(sub);
   }
    
    @GetMapping("/viewSubsections")
    @ResponseBody
    public List<Subsection> viewSubsections(){
        return isubser.viewSubsections();
    }
    
    @DeleteMapping("/deleteSubsection/{id}")
    public void deleteSubsection(@PathVariable Long id){
        isubser.deleteSubsection(id);
    }
    
    @GetMapping("/searchSubsectionBySection/{sec}")
    public List<Subsection> searchSubsectionBySection(@PathVariable String sec){
        return isubser.searchSubsectionBySection(sec);
   }
}
