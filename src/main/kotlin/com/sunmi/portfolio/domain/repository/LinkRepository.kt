package com.sunmi.portfolio.domain.repository

import com.sunmi.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository:JpaRepository<Link, Long> {

}