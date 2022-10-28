package com.aljabermedical.models;

import javax.persistence.*;


@Entity
@Table(name = "passenger_medical_details")

public class PassengerMedicalDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {return id;}
    public void setId(Long id) {
        this.id = id;
    }
}
