package com.aplose.formationjpa2.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
// import jakarta.persistence.Transient;
// import java.time.Instant;
import jakarta.persistence.MapKeyColumn;



@Entity
public class CD extends Item{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column(length = 200, nullable = false)
//    private String title;
//    private Float price;
//    private String description;
    private String isbn;
    @ElementCollection
    // @MapKeyColumn(name = "tracks")
    private Map<Integer, String> tracks = new HashMap<>();
    
    @ManyToMany (mappedBy = "cds")
    private List<Artist> artists = new ArrayList<>();    

    public Map<Integer, String> getTracks(){
        return tracks;
    }


//    public Long getId() {
//        return id;
//    }
//    
//    public void setId(Long id) {
//        this.id = id;
//    }
//    
//    public String getTitle() {
//        return title;
//    }
//    
//    public void setTitle(String title) {
//        this.title = title;
//    }
//    
//    public Float getPrice() {
//        return price;
//    }
//    
//    public void setPrice(Float price) {
//        this.price = price;
//    }
//    
//    public String getDescription() {
//        return description;
//    
//    }
//    
//    public void setDescription(String description) {
//        this.description = description;
//    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    @Override
	public String toString() {
		return "CD [isbn=" + isbn + ", tracks=" + tracks + ", artists=" + artists + "]";
	}
	public List<Artist> getArtists() {
		return artists;
	}
	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}
}
