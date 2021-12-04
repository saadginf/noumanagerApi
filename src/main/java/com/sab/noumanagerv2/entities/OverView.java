package com.sab.noumanagerv2.entities;

import java.util.ArrayList;
import java.util.List;

public class OverView {
    private double toSpend;
    private double spent;
    private double income;
    List<Operation> operations = new ArrayList<>();
    public OverView() {
    }
    public double getToSpend() {
        return toSpend;
    }
    public void setToSpend(double toSpend) {
        this.toSpend = toSpend;
    }
    public double getSpent() {
        return spent;
    }
    public void setSpent(double spent) {
        this.spent = spent;
    }
    public double getIncome() {
        return income;
    }
    public void setIncome(double income) {
        this.income = income;
    }
    public List<Operation> getOperations() {
        return operations;
    }
    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
    


}
