package com.sunmi.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Introduction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "introduction_id")
    var id: Long? = null

}