package com.gabriel.PortfolioBE.repository;

import com.gabriel.PortfolioBE.models.Section;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository  extends JpaRepository <Section, Long>{
    
    @Query(value = "SELECT * FROM section WHERE title LIKE %?1%", nativeQuery=true)
    public List<Section> searchByTitle(String name);
}
