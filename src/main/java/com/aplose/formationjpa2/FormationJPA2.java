package com.aplose.formationjpa2;

import com.aplose.formationjpa2.model.Book;
import com.aplose.formationjpa2.model.Address;
import com.aplose.formationjpa2.model.Artist;
import com.aplose.formationjpa2.model.Customer;
import com.aplose.formationjpa2.model.OrderLine;
import com.aplose.formationjpa2.model.PurchaseOrder;

import jakarta.persistence.EntityManager;
import com.aplose.formationjpa2.model.Book;

public class FormationJPA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtils.getInstance().getEntityManager();
		
		
		Book b = new Book();
        b.setTitle("Limitless");
        b.setDescription("Un bouquin de dev à lire absolument...");
        b.setPrice(25F);
        b.setIllustrations(Boolean.TRUE);
        b.setNbOfPages(250);
        Book b1 = new Book();
        b1.setTitle("Le petit prince");
        
        
//        CD cds = new CD();
//        
//        Artist johnny= new Artist();
//        johnny.setNickname("Johnny");
//        Artist billy= new Artist();
//        billy.setNickname("Billy");
//        cd.getArtists().add(johnny);
//        cd.getArtists().add(billy);
//        cd2.getArtists().add(johnny);
//        cd2.getArtists().add(billy);
        
        
        Address addr = new Address();
        addr.setStreet1("rue du genou");
        addr.setCountry("france");
        addr.setCity("Montpellier");
        
        Customer custom = new Customer();
        custom.setEmail("KINGo@jeken.fr");
        custom.setFirstname("Driss");
        custom.setLastName("LeROI");
        custom.setPhoneNumber("0965342398");
        custom.setAddress(addr);
		
		
		OrderLine orderLine = new OrderLine();
        orderLine.setItem("limmetless");
        orderLine.setUnitPrice(23F);
        orderLine.setQuantity(2F);
        
        OrderLine orderLine2 = new OrderLine();
        orderLine2.setItem("DRAGON");
        orderLine2.setUnitPrice(73F);
        orderLine2.setQuantity(8F);
        
        PurchaseOrder purchOrder = new PurchaseOrder();
        purchOrder.setRef("DRSNK");;
        purchOrder.getOrderList().add(orderLine);
        purchOrder.getOrderList().add(orderLine2);
        
        
        
        em.getTransaction().begin();
        em.persist(b);
        em.persist(b1);
        em.persist(custom);
        em.persist(addr);
        em.persist(orderLine);
        em.persist(orderLine2);
        em.persist(purchOrder);
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
