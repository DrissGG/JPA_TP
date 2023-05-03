package com.aplose.formationjpa2.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ref;
    private LocalDateTime creationDate;
    @OneToMany
    @JoinColumn(name = "purchaseOrder_id")
    private List<OrderLine> orderList = new ArrayList<>();
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
    
    public String getRef() {
        return ref;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }
    public List<OrderLine> getOrderList() {
        return orderList;
    }
    public void setOrderList(List<OrderLine> orderList) {
        this.orderList = orderList;
    }
    
    @Override
    public String toString() {
        return "PurchaseOrder [id=" + id + ", ref=" + ref + ", creationDate=" + creationDate + ", orderList="
                + orderList + "]";
    }
    
}