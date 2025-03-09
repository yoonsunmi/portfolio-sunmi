package com.sunmi.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class HttpInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "httpInterface_id")
    var id: Long? = null

}