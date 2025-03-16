package com.sunmi.portfolio.presentation.service

import com.sunmi.portfolio.presentation.dto.IntroductionDTO
import com.sunmi.portfolio.presentation.dto.LinkDTO
import com.sunmi.portfolio.presentation.dto.ProjectDTO
import com.sunmi.portfolio.presentation.dto.ResumeDTO
import com.sunmi.portfolio.presentation.repository.PresentationRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PresentationService(
    private val presentationRepository: PresentationRepository
) {

    @Transactional(readOnly = true)  // 조회성 사용 목적인 경우는 readOnly 넣어주는 것이 좋음
    fun getIntroductions(): List<IntroductionDTO> {
        val introductions = presentationRepository.getActiveIntroductions()
        return introductions.map { introduction -> IntroductionDTO(introduction) }
    }

    @Transactional(readOnly = true)
    fun getLinks(): List<LinkDTO> {
        val links = presentationRepository.getActiveLinks()
        return links.map { link -> LinkDTO(link) }
    }

    @Transactional(readOnly = true)
    fun getResume(): ResumeDTO {
        val experiences = presentationRepository.getActiveExperiences()
        val achievements = presentationRepository.getActiveAchievements()
        val skills = presentationRepository.getActiveSkills()

        return ResumeDTO(
            experiences = experiences,
            achievements = achievements,
            skills = skills
        )
    }

    @Transactional(readOnly = true)
    fun getProjects(): List<ProjectDTO> {
        val projects = presentationRepository.getActiveProjects()

        return projects.map { project -> ProjectDTO(project) }
    }

}