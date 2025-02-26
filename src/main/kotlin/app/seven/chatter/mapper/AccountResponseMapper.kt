package app.seven.chatter.mapper

import app.seven.chatter.model.AccountResponse
import app.seven.chatter.repository.db.AccountEntity
import org.springframework.stereotype.Component

@Component
class AccountResponseMapper {

    fun from(accountEntity: AccountEntity): AccountResponse {
        return AccountResponse(
            phone = accountEntity.phone,
            firstName = accountEntity.firstName,
            lastName = accountEntity.lastName,
            dob = accountEntity.dob,
            status = accountEntity.status,
            profilePicture = accountEntity.profilePicture,
        )
    }
}