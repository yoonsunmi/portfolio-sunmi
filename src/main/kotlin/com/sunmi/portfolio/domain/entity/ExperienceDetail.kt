package com.sunmi.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class ExperienceDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_detail_id")
    var id: Long? = null

}