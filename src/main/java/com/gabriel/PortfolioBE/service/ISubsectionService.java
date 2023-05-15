package com.gabriel.PortfolioBE.service;

import com.gabriel.PortfolioBE.models.Subsection;
import java.util.List;

public interface ISubsectionService {
    public List<Subsection> viewSubsections();
    public void newSubsection(Subsection sub);
    public void deleteSubsection(Long id);
    public Subsection searchSubsection(Long id);
}
