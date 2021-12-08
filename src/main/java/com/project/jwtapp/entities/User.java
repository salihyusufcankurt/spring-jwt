package com.project.jwtapp.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="table.name", schema="schema.name")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USERID")
    int id;

    @Column(name = "USERNAME")
    String username;

    @Column(name = "PASSWD")
    String password;

    @Column(name = "ADISOYADI")
    String nameSurname;

    @Column(name = "GSM")
    String gsm;

    @Column(name = "EPOSTA")
    String eMail;

    @Column(name = "AKTIFPASIF")
    int isActive;

}