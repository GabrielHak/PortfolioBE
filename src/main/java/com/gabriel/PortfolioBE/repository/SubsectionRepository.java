package com.gabriel.PortfolioBE.repository;

import com.gabriel.PortfolioBE.models.Subsection;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SubsectionRepository extends JpaRepository <Subsection, Long> {
    @Query(value = "SELECT t FROM Subsection t WHERE t.sectionId = (SELECT p.id FROM Section p WHERE p.title LIKE %?1%)") 
    List<Subsection> searchBySection(String sec);
}
