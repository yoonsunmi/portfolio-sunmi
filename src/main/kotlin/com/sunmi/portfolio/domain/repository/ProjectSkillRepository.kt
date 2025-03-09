package com.sunmi.portfolio.domain.repository

import com.sunmi.portfolio.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectSkillRepository:JpaRepository<ProjectSkill, Long> {

}