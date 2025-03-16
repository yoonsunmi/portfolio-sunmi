package com.sunmi.portfolio.presentation.service

import com.sunmi.portfolio.domain.entity.Introduction
import com.sunmi.portfolio.domain.entity.Link
import com.sunmi.portfolio.presentation.repository.PresentationRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import kotlin.test.Test

@ExtendWith(MockitoExtension::class)  // Mockito 라이브러리 사용 시 꼭 달아줘야 할 어노테이션
class PresentationServiceTest {

    @InjectMocks
    lateinit var presentationService: PresentationService  // 실제 테스트 할 대상

    @Mock
    lateinit var presentationRepository: PresentationRepository

    val DATA_SIZE = 9

    @Test
    fun testGetIntroductions() {
        // given
        val introductions = mutableListOf<Introduction>()

        for (i in 1..DATA_SIZE) {  // 1, 3, 5, 7, 9 -> false / 2, 4, 6, 8 -> true
            val introduction = Introduction(content = "${i}", isActive = i % 2 == 0)
            introductions.add(introduction)
        }

        val activeIntroductions = introductions.filter { introduction ->
            introduction.isActive
        } // 4

        Mockito.`when`(presentationRepository.getActiveIntroductions())
            .thenReturn(activeIntroductions)

        // when
        val introductionDTOs = presentationService.getIntroductions()

        // then
        assertThat(introductionDTOs).hasSize(DATA_SIZE / 2)

        for (introductionDTO in introductionDTOs) {
            assertThat(introductionDTO.content.toInt()).isEven()  // 짝수인지 검증
        }
    }

    @Test
    fun testGetLinks() {
        // given
        val links = mutableListOf<Link>()

        for (i in 1..DATA_SIZE) {
            val link = Link(name = "${i}", content = "${i}", isActive = i % 2 != 0)
            links.add(link)
        }

        val activeLinks = links.filter { link ->
            link.isActive
        }

        Mockito.`when`(presentationRepository.getActiveLinks())
            .thenReturn(activeLinks)

        // when
        val linkDTOs = presentationService.getLinks()

        // then
        var expectedSize = DATA_SIZE / 2

        if (DATA_SIZE % 2 != 0) {
            expectedSize += 1
        }

        assertThat(linkDTOs).hasSize(expectedSize)

        for (linkDTO in linkDTOs) {
            assertThat(linkDTO.content.toInt()).isOdd()
        }

    }

}