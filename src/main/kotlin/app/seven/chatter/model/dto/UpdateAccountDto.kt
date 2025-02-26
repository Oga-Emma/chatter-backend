package app.seven.chatter.model.dto

import java.time.LocalDate

data class UpdateAccountDto(
    val status: String?,
    val profilePicture: String?,
    val firstName: String?,
    val lastName: String?,
    val deviceId: String?,
    val dob: LocalDate?,
)
