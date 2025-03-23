package com.sunmi.portfolio.admin.context.achievement.controller

import com.sunmi.portfolio.admin.context.achievement.service.AdminAchievementService
import com.sunmi.portfolio.admin.data.DateFormElementDTO
import com.sunmi.portfolio.admin.data.FormElementDTO
import com.sunmi.portfolio.admin.data.SelectFormElementDTO
import com.sunmi.portfolio.admin.data.TextFormElementDTO
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/admin/achievement")
class AdminAchievementViewController(
    private val adminAchievementService: AdminAchievementService
) {

    @GetMapping
    fun achievement(model: Model): String {

        // FORM 요소 세팅
        val formElements = listOf<FormElementDTO>(
            TextFormElementDTO("title", 4),
            TextFormElementDTO("description", 8),
            DateFormElementDTO("achievedDate", 5),
            TextFormElementDTO("host", 5),
            SelectFormElementDTO("isActive", 2, listOf(true.toString(), false.toString()))
        )
        model.addAttribute("formElements", formElements)

        // 테이블 정보 세팅
        val table = adminAchievementService.getAchievementTable()

        model.addAttribute("table", table)
        model.addAttribute("detailTable", null)

        // 페이지 속성 세팅
        val pageAttributes = mutableMapOf<String, Any>(
            Pair("menuName", "Resume"),
            Pair("pageName", table.name),
            Pair("editable", true),
            Pair("deletable", false),
            Pair("hasDetails", false)
        )
        model.addAllAttributes(pageAttributes)

        return "admin/page-table"

    }

}