package app.seven.chatter.model.dto

import java.time.LocalDate

data class CreateAccountDto(
    val phone: String,
    val deviceId: String,
    val firstName: String,
    val lastName: String,
    val dob: LocalDate,
)
