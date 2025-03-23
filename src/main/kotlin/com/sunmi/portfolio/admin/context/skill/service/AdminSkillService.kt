package com.sunmi.portfolio.admin.context.skill.service

import com.sunmi.portfolio.admin.data.TableDTO
import com.sunmi.portfolio.domain.entity.Skill
import com.sunmi.portfolio.domain.repository.SkillRepository
import org.springframework.stereotype.Service

@Service
class AdminSkillService(
    private val skillRepository: SkillRepository
) {

    fun getSkillTable(): TableDTO {
        val classInfo = Skill::class
        val entities = skillRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }

}