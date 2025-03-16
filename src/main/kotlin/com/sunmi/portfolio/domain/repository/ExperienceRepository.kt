package com.sunmi.portfolio.domain.repository

import com.sunmi.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ExperienceRepository:JpaRepository<Experience, Long> {

    // 일대 다 관계라서 이대로 쓰면 성능에 좋지 않음 !
    fun findAllByIsActive(isActive: Boolean): List<Experience>

    override fun findById(id: Long): Optional<Experience>

}