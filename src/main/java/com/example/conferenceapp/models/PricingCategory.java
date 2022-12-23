package com.example.conferenceapp.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "pricing_categories")
public class PricingCategory {
    @Id
    private char pricing_category_code;

    private String pricing_categor_name;
    private String pricing_start_date;
    private String pricing_end_date;

}
