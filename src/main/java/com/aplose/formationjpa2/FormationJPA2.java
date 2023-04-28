package com.aplose.formationjpa2;

import com.aplose.formationjpa2.model.Book;

import jakarta.persistence.EntityManager;
import com.aplose.formationjpa2.model.Book;

public class FormationJPA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtils.getInstance().getEntityManager();
		
		Book b = new Book();
		b.setTitle("limtless");
		b.setDescription("Un bouquin de dev a lire absolument");
		b.setPrice(25F);
		b.setIllustrations(Boolean.TRUE);
		b.setNbOfPages(250);
		
		
		
		em.getTransaction().begin();;
		em.persist(b); // insert sql (persist)
		em.getTransaction().commit();
		
		
		Book b2 = em.find(Book.class, 4); // select sql (find)
		if(b2 == null) {
			System.out.println("le bouqin numero 4 n'existe pas ");
		}
		b2 = em.find(Book.class, 1);
		if(b2 != null) {
			System.out.println("le bouqin numero 1 est : " + b2);
		}
		
		
		
		System.out.println("Parfait : " + em);
		em.close();
	}

}
