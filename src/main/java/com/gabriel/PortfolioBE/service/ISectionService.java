package com.gabriel.PortfolioBE.service;

import com.gabriel.PortfolioBE.models.Section;
import java.util.List;

public interface ISectionService {
    public List<Section> viewSections();
    public void newSection(Section sec);
    public void deleteSection(Long id);
    public Section searchSection(Long id);
}
