package com.gabriel.PortfolioBE.service;

import com.gabriel.PortfolioBE.models.Section;
import java.util.List;
import java.util.Optional;

public interface ISectionService {
    public List<Section> viewSections();
    public void newSection(Section sec);
    public void deleteSection(Long id);
    public Section searchSection(Long id);
    public List<Section> searchSectionByTitle(String name);
}
