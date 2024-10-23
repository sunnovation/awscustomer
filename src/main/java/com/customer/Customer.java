package com.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private Long customerId;
    private String customerName;
    private String address;
    private String productName;
    private Double price;
}
