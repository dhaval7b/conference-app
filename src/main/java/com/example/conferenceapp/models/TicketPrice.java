package com.example.conferenceapp.models;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity(name="ticket_prices")
public class TicketPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ticket_price_id;

    private String ticket_price_code;
    private String pricing_category_code;
    private Long base_price;

}
