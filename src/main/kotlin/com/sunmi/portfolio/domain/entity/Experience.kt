package com.sunmi.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id")
    var id: Long? = null

}