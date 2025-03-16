package com.sunmi.portfolio.domain.repository

import com.sunmi.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface ExperienceRepository:JpaRepository<Experience, Long> {

    @Query("select e from Experience e left join fetch e.details where e.isActive = :isActive")  // 쿼리 어노테이션 내 작성 쿼리로 n+1 문제 해결
    fun findAllByIsActive(isActive: Boolean): List<Experience>

    @Query("select e from Experience e join fetch e.details where e.id = :id")
    override fun findById(id: Long): Optional<Experience>

}