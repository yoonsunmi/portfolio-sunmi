package com.sunmi.portfolio.domain.repository

import com.sunmi.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository:JpaRepository<Experience, Long> {

}