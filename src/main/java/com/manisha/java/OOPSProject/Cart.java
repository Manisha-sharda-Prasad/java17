package com.manisha.java.OOPSProject;

import com.manisha.java.util.Print;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
//@Entity
public class Cart {

    // @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    //Cart this --> current object of Cart;

    //this(),this(arg1,...)
    //super(), super(arg1,...)
    //  c1 --> call  --->c2  :: first line

    protected List<Jewellery> items;
    protected double bill;
    protected Discount discount;

    public void addItems(Jewellery j){
        this.items.add(j);
        calculateBill();
    }
    public void removeItems(Jewellery j){
        items.remove(j);
        calculateBill();
    }
    public int getItemCount(){
        return items.size();
    }

    public void calculateBill(){
        this.bill = 0;
        for ( Jewellery j: this.items){
            this.bill = this.bill + j.getPrice() ;
        }
        Print.print("Your Cart updated : ", items, bill);
    }

    public void printInvoice(){
        System.out.println("########################");
        Print.print(" Welcome to ManishaStore");
        for ( Jewellery j: this.items){
             Print.print(j.productCode + " "+ j.productName + ": " +j.getPrice());
        }

        Print.print(" Bill ", this.bill);
        //discount
        this.bill = discount.apply(this.bill);
        Print.print(" Bill After discount", this.bill);

        //tax
        this.bill = this.bill + (this.bill * 0.07);
        Print.print(" Bill After Tax", this.bill);

        Print.print("Total bill : " + this.bill);
        Print.print(" Thanks for Shopping");
        System.out.println("########################");
    }

}
