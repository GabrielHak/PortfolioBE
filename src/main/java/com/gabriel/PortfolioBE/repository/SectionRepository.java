package com.gabriel.PortfolioBE.repository;

import com.gabriel.PortfolioBE.models.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository  extends JpaRepository <Section, Long>{ }
