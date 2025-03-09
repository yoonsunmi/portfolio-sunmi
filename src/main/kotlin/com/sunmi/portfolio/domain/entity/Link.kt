package com.sunmi.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "link_id")
    var id: Long? = null

}