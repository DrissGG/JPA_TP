package com.aplose.formationjpa2.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.MapKeyColumn;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastname;
    private String nickname;
    @ElementCollection
    
//    @MapKeyColumn(name = "tracks_position")
    @ManyToMany
    private List<CD> cds = new ArrayList<>();
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public List<CD> getCds() {
        return cds;
    }
    public void setCds(List<CD> cds) {
        this.cds = cds;
    }
    @Override
    public String toString() {
        return "Artist [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", nickname=" + nickname
                + "]";
    }
    
    
    
    
}	
	
	
	

