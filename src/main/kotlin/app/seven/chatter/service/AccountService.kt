package app.seven.chatter.service

import app.seven.chatter.mapper.AccountEntityMapper
import app.seven.chatter.mapper.AccountResponseMapper
import app.seven.chatter.model.AccountResponse
import app.seven.chatter.model.dto.CreateAccountDto
import app.seven.chatter.model.dto.UpdateAccountDto
import app.seven.chatter.model.exception.AccountNotFoundException
import app.seven.chatter.repository.AccountRepository
import app.seven.chatter.repository.db.AccountEntity
import app.seven.chatter.repository.db.map
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.getOrNull

@Service
class AccountService(
    private val accountRepository: AccountRepository,
    private val accountEntityMapper: AccountEntityMapper,
    private val accountResponseMapper: AccountResponseMapper,
) {

    fun getAccount(phone: String): AccountResponse {
        return this.findAccount(phone).map {
            accountResponseMapper.from(it)
        }
    }

    fun createAccount(createAccountDto: CreateAccountDto): AccountResponse {
        val account = accountEntityMapper.from(createAccountDto)
        return save(account)
    }

    fun updatedAccount(phone: String, updateAccountDto: UpdateAccountDto): AccountResponse {
        val acc = this.findAccount(phone)
        val account = accountEntityMapper.from(updateAccountDto, acc)

        return save(account)
    }

    private fun save(accountEntity: AccountEntity): AccountResponse {
        return accountRepository.save(accountEntity).map {
            accountResponseMapper.from(it)
        }
    }

    private fun findAccount(phone: String): AccountEntity {
        return accountRepository
            .findById(phone)
            .getOrNull() ?: throw AccountNotFoundException("No account with phone $phone found.")
    }
}
