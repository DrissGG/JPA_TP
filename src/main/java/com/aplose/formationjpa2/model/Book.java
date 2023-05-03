package com.aplose.formationjpa2.model;


import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book extends Item{
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	@Column(length = 200, nullable = false) 
//	private String title;
//	private Float price;
//	private String description;
	private String isbn;
	private Integer nbOfPages;
	private Boolean illustrations;
	private Instant instant = Instant.now();
	
	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public Float getPrice() {
//		return price;
//	}
//	public void setPrice(Float price) {
//		this.price = price;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getNbOfPages() {
		return nbOfPages;
	}
	public void setNbOfPages(Integer nbOfPages) {
		this.nbOfPages = nbOfPages;
	}
	public Boolean getIllustrations() {
		return illustrations;
	}
	public void setIllustrations(Boolean illustrations) {
		this.illustrations = illustrations;
	}
	public Instant getInstant() {
		return instant;
	}
	public void setInstant(Instant instant) {
		this.instant = instant;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", nbOfPages=" + nbOfPages + ", illustrations=" + illustrations + ", instant="
				+ instant + "]";
	}
	
}
