package com.sab.noumanagerv2.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String label;
    private Double value;
    @ManyToOne
    @JoinColumn(name = "ID_CAT")
    private CatOperation catOperation;
    private Boolean isDepense;
    @ManyToOne
    @JoinColumn(name = "ID_USER")
    private AppUser user;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;

    public Boolean getIsDepense() {
        return isDepense;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public Operation() {
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return Double return the value
     */
    public Double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * @return CatOperation return the catOperation
     */
    public CatOperation getCatOperation() {
        return catOperation;
    }

    /**
     * @param catOperation the catOperation to set
     */
    public void setCatOperation(CatOperation catOperation) {
        this.catOperation = catOperation;
    }

    /**
     * @return Boolean return the isDepense
     */
    public Boolean isIsDepense() {
        return isDepense;
    }

    /**
     * @param isDepense the isDepense to set
     */
    public void setIsDepense(Boolean isDepense) {
        this.isDepense = isDepense;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}