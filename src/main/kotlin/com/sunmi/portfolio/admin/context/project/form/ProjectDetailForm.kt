package com.sunmi.portfolio.admin.context.project.form

import com.sunmi.portfolio.domain.entity.ProjectDetail
import jakarta.validation.constraints.NotBlank

data class ProjectDetailForm(
    val id: Long,

    val content: String,

    @field:NotBlank(message = "필수값입니다.")
    val url: String?,

    val isActive: Boolean

) {

    fun toEntity(): ProjectDetail {
        return ProjectDetail(
            content = this.content,
            url = this.url,
            isActive = this.isActive
        )
    }

}