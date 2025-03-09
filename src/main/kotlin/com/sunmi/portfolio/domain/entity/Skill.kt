package com.sunmi.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    var id: Long? = null

}