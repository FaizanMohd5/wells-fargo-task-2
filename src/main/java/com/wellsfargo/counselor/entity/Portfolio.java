package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private String portfolioID;

    @ManyToOne
    private Client client; // Each portfolio belongs to one client

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private Date creationDate;

    // Default constructor
    protected Portfolio() {}

    // Constructor to initialize instance variables
    public Portfolio(Client client, String portfolioName, Date creationDate) {
        this.client = client;
        this.portfolioName = portfolioName;
        this.creationDate = creationDate;
    }

    // Getters and Setters
    public String getPortfolioID() {
        return portfolioID;
    }

    public void setPortfolioID(String portfolioID) {
        this.portfolioID = portfolioID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
