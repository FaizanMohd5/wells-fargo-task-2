package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private String clientID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contactInformation;

    @ManyToOne
    private Advisor associatedAdvisor; // Many clients can be associated with one advisor

    // Default constructor
    protected Client() {}

    // Constructor to initialize instance variables
    public Client(String name, String contactInformation, Advisor associatedAdvisor) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.associatedAdvisor = associatedAdvisor;
    }

    // Getters and Setters
    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public Advisor getAssociatedAdvisor() {
        return associatedAdvisor;
    }

    public void setAssociatedAdvisor(Advisor associatedAdvisor) {
        this.associatedAdvisor = associatedAdvisor;
    }
}
