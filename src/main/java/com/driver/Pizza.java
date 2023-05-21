package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private boolean extraCheeseAdded=false;
    private boolean extraToppingAdded=false;
    private boolean isBillGenerated=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
             this.price+=300;
             this.bill+="Base Price Of The Pizza : 300 \n";
        }
        else
        {
            this.price+=400;
            this.bill+="Base Price Of The Pizza : 400 \n";
        }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(extraCheeseAdded) return;
        // your code goes here
         this.price+=80;
         this.bill+="Extra Cheese Added : 80 \n";
         extraCheeseAdded=true;
    }

    public void addExtraToppings(){
        if(extraToppingAdded) return;
        // your code goes here
        if(isVeg)
        {
             this.price+=70;
             this.bill+="Extra Toppings Added : 70 \n";
        }
        else
        {
            this.price+=120;
            this.bill+="Extra Toppings Added : 120 \n";
        }
        extraToppingAdded=true;
    }

    public void addTakeaway(){
        // your code goes here
        this.price+=20;
        this.bill+="Paperbag Added : 20 \n";
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated) return;
        this.bill+="Total Price : "+this.getPrice()+" \n";
        isBillGenerated=true;
        return this.bill;
    }
}
