package com.example.conferenceapp.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "attendees")
public class Attendee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long attendee_id;

    public String first_name;
    public String last_name;
    public String title;
    public  String company;
    public String email;
    public String phone_number;

}
