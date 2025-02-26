package app.seven.chatter.mapper

import app.seven.chatter.model.dto.CreateAccountDto
import app.seven.chatter.model.dto.UpdateAccountDto
import app.seven.chatter.repository.db.AccountEntity
import org.springframework.stereotype.Component

@Component
class AccountEntityMapper {

    fun from(createAccountDto: CreateAccountDto) = AccountEntity(
        phone = createAccountDto.phone,
        firstName = createAccountDto.firstName,
        lastName = createAccountDto.lastName,
        deviceId = createAccountDto.deviceId,
        dob = createAccountDto.dob,
        status = null,
        profilePicture = null,
    )

    fun from(updateAccountDto: UpdateAccountDto, accountEntity: AccountEntity): AccountEntity {
        var account = accountEntity.copy()

        if (updateAccountDto.firstName != null) {
            account = account.copy(firstName = updateAccountDto.firstName)
        }

        if (updateAccountDto.lastName != null) {
            account = account.copy(lastName = updateAccountDto.lastName)
        }

        if (updateAccountDto.deviceId != null) {
            account = account.copy(deviceId = updateAccountDto.deviceId)
        }

        if (updateAccountDto.dob != null) {
            account = account.copy(dob = updateAccountDto.dob)
        }

        if (updateAccountDto.status != null) {
            account = account.copy(status = updateAccountDto.status)
        }

        if (updateAccountDto.profilePicture != null) {
            account = account.copy(profilePicture = updateAccountDto.profilePicture)
        }

        return account
    }
}
