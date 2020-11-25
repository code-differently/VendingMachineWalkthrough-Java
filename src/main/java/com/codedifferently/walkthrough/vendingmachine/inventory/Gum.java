package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Gum extends Product{

    public Gum(String nameIn, Double priceIn){
        super(nameIn, priceIn);
        msg = "Chew Chew, Yum!";
    }

    public Gum(){
        this("Rhino Chew", 0.0);
    }

    @Override
    public String message() {
        return msg;
    }
}
