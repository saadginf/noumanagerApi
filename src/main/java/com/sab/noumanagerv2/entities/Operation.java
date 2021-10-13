package com.sab.noumanagerv2.entities;

public class Operation {
    private Long id;
    private String label;
    private Double value;
    private CatOperation catOperation;
    private Boolean isDepense;

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

}