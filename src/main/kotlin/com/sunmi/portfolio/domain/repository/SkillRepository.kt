package com.sunmi.portfolio.domain.repository

import com.sunmi.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository:JpaRepository<Skill, Long> {

}