package com.manisha.java.retailapp_project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer", schema = "public")
public class Customer
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String name;

   @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
   private Set<Order> orders;

   @Override
   public String toString() {
      return "Customer{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", orders=" + orders +
              '}';
   }
}
