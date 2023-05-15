package com.gabriel.PortfolioBE.repository;

import com.gabriel.PortfolioBE.models.Subsection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubsectionRepository extends JpaRepository <Subsection, Long> {}
