package com.sunmi.portfolio.domain.repository

import com.sunmi.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository:JpaRepository<Achievement, Long> {

}