package com.manisha.java.retailapp_project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_details", schema = "public")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;                 //Dependency - 'Has a Relationship' with Order

    @Override
    public String toString() {
        return "OrderDetails{" +
                //"id=" + id +
                //", quantity=" + quantity +
                ", price=" + price +
                ", order=" + order +
                '}';
    }
}
