package com.sena.app.Entity;

import jakarta.persistence.*;;

@Entity
@Table(name = "module")
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name =  "name", nullable = false, length = 100)
    private String name;

    
    @Column(name =  "name", nullable = false, length = 100)
    private String description;

}
