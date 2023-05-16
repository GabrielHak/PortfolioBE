package com.gabriel.PortfolioBE.service;

import com.gabriel.PortfolioBE.models.Section;
import com.gabriel.PortfolioBE.repository.SectionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionService implements ISectionService{
    
    @Autowired
    SectionRepository secRepo;

    @Override
    public List<Section> viewSections() {
        return secRepo.findAll();
    }

    @Override
    public void newSection(Section sec) {
        secRepo.save(sec);
    }

    @Override
    public void deleteSection(Long id) {
        secRepo.deleteById(id);
    }

    @Override
    public Section searchSection(Long id) {
        return secRepo.findById(id).orElse(null);
    }
    
    @Override
    public List<Section> searchSectionByTitle(String name){
       return secRepo.searchByTitle(name);
    }
}
