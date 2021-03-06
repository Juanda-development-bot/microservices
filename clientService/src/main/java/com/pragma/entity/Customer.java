package com.pragma.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "tbl_client")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "El nombre no debe ser vacío")
    @Column(name = "NAME",nullable=false)
    private String name;
    @Column(name = "LASTNAME",nullable=false)
    private String lastname;
    @Column(name = "DOCUMENT_TYPE",nullable=false)
    private String documentType;
    @Column(name = "NUMBER_OF_DOCUMENT",nullable=false)
    private int numberOfDocument;
    @Column(name = "AGE",nullable=false)
    private int age;
    @Column(name = "CITY_OF_BIRTH",nullable=false)
    private String cityOfBirth;


}
