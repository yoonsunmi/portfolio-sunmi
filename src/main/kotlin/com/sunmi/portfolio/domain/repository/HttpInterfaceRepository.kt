package com.sunmi.portfolio.domain.repository

import com.sunmi.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository:JpaRepository<HttpInterface, Long> {

}