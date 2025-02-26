package app.seven.chatter.model

import java.time.LocalDate

data class AccountResponse(
    val phone: String,
    val firstName: String,
    val lastName: String,
    val dob: LocalDate,
    val status: String? = null,
    val profilePicture: String? = null,
)
