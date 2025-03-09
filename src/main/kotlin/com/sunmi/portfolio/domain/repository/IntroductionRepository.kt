package com.sunmi.portfolio.domain.repository

import com.sunmi.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository:JpaRepository<Introduction, Long> {

}