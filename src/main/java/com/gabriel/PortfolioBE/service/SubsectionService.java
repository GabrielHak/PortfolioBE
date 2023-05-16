package com.gabriel.PortfolioBE.service;

import com.gabriel.PortfolioBE.models.Subsection;
import com.gabriel.PortfolioBE.repository.SubsectionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubsectionService implements ISubsectionService{

    @Autowired
    SubsectionRepository subRepo;
    
    @Override
    public List<Subsection> viewSubsections() {
        return subRepo.findAll();
    }

    @Override
    public void newSubsection(Subsection sub) {
        subRepo.save(sub);
    }

    @Override
    public void deleteSubsection(Long id) {
        subRepo.deleteById(id);
    }

    @Override
    public Subsection searchSubsection(Long id) {
        return subRepo.findById(id).orElse(null);
    }

    @Override
    public List<Subsection> searchSubsectionBySection(String sec) {
        return subRepo.searchBySection(sec);
    }
    
}
