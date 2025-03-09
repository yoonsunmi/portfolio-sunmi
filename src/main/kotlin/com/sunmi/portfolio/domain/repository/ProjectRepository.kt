package com.sunmi.portfolio.domain.repository

import com.sunmi.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository:JpaRepository<Project, Long> {

}