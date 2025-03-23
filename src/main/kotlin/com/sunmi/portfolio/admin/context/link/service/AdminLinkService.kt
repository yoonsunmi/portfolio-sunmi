package com.sunmi.portfolio.admin.context.link.service

import com.sunmi.portfolio.admin.data.TableDTO
import com.sunmi.portfolio.domain.entity.Link
import com.sunmi.portfolio.domain.repository.LinkRepository
import org.springframework.stereotype.Service

@Service
class AdminLinkService(
    private val linkRepository: LinkRepository
) {

    fun getLinkTable(): TableDTO {
        val classInfo = Link::class
        val entities = linkRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }

}