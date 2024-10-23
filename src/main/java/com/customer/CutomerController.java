package com.customer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class CutomerController {

    @GetMapping("/health-check")
    public ResponseEntity<String> health(){
        return new ResponseEntity<>("Customer service is UP !", HttpStatus.OK);
    }

    @GetMapping("/add-customer")
    public ResponseEntity<HashMap<String,Object>> fetchCustomers(){

        HashMap<String,Object> response=new HashMap<>();
        response.put("code", 200);
        response.put("payload", customers());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private List<Customer> customers(){

        return List.of(
                new Customer(101l, "Pooja Saini", "Alwar", "Lotus White Glow", 536.45),
                new Customer(102l, "Vikram Soni", "Punjab", "Maruti Suzuki Baleno", 1544936.45),
                new Customer(103l, "Rajveer Gupta", "Alwar", "SARAS Dairy Ghee Tin", 3456.89),
                new Customer(104l, "Mahaveer Singh", "DUSA", "Titan Watch", 2336.90),
                new Customer(105l, "Amit Gupta", "Punjab", "Audi 300", 3645679.90),
                new Customer(106l, "Pooja Saxena", "Narnual", "Fair & Lovely Cream", 136.75),
                new Customer(107l, "Ramveer Suri", "Narnual", "Lexin Chair", 2536.85),
                new Customer(108l, "Pooja Mehra", "Narnual", "HP Laptop", 45567.85),
                new Customer(109l, "OM Prakash Verma", "Narnual", "HP Mouse", 536.45),
                new Customer(110l, "Rambir", "Khirthal", "Sofa Set", 67536.55),
                new Customer(111l, "Mohmad Yunus Khan", "Khirthal", "Dining Table", 8536.15),
                new Customer(112l, "Marsid Khan", "Nuhu", "HP GAS Cylinder", 876.45),
                new Customer(113l, "Akbar Khan", "Nuhu", "Cracker", 10536.95),
                new Customer(114l, "Ulka Matorkar", "Pune", "HP Charger", 1536.67),
                new Customer(115l, "Rashi Ali", "Alwar", "Cabel Wire", 12436.35),
                new Customer(116l, "Ritesh Barthonia", "Alwar", "HP Charger", 1536.67),
                new Customer(117l, "Savit Saini", "Alwar", "Lotus White Glow", 536.45),
                new Customer(118l, "Lalit Saini", "Narnaul", "Lotus White Glow", 536.45),
                new Customer(119l, "Dhavneet Saini", "Alwar", "Lotus White Glow", 536.45),
                new Customer(120l, "Pooja Saini", "Alwar", "Jokey underwear & under garments", 8536.45)

                );
    }
}
