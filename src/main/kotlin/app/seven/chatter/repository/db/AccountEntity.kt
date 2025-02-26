package app.seven.chatter.repository.db

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
data class AccountEntity(
    @Id val phone: String,
    val status: String? = null,
    val profilePicture: String? = null,
    val firstName: String,
    val lastName: String,
    val deviceId: String,
    val dob: LocalDate,
)

fun <T> AccountEntity.map(function: (AccountEntity) -> T): T {
    return function(this)
}
