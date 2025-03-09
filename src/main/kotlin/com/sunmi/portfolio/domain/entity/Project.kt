package com.sunmi.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    var id: Long? = null

}