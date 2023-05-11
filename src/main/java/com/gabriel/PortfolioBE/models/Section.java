package com.gabriel.PortfolioBE.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Section {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String subtitle;
    private String paragraph;
    private String img;
    
    public Section(){}

    public Section(Long id, String title, String subtitle, String paragraph, String img) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.paragraph = paragraph;
        this.img = img;
    }
}
