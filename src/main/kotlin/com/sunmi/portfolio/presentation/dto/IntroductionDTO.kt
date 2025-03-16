package com.sunmi.portfolio.presentation.dto

import com.sunmi.portfolio.domain.entity.Introduction

data class IntroductionDTO(
    val content: String
) {
    constructor(introduction: Introduction) : this(
        content = introduction.content
    )

}