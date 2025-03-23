package com.sunmi.portfolio.admin.data

abstract class FormElementDTO(
    val name: String,
    val size: Int,
    val type: String
)

// form 에 들어갈 내용을 서버에서 관리하기 위한 용도
class TextFormElementDTO(
    name: String,
    size: Int
) : FormElementDTO(name = name, size = size, type = "text")

class DateFormElementDTO(
    name: String,
    size: Int
) : FormElementDTO(name = name, size = size, type = "date")

class SelectFormElementDTO(
    name: String,
    size: Int,
    options: List<Any>
) : FormElementDTO(name = name, size = size, type = "select") {
    val options: List<Any> = options
}

