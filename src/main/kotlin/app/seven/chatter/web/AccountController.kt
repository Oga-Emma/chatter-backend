package app.seven.chatter.web

import app.seven.chatter.model.AccountResponse
import app.seven.chatter.model.dto.CreateAccountDto
import app.seven.chatter.service.AccountService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController(value = "/accounts")
class AccountController(
    private val accountService: AccountService,
) {

    @PostMapping
    fun createAccount(@RequestBody createAccountDto: CreateAccountDto): ResponseEntity<AccountResponse> {
        return ResponseEntity(
            accountService.createAccount(createAccountDto), HttpStatus.CREATED
        )
    }

    @GetMapping
    fun getAccount(): ResponseEntity<AccountResponse> {

        val phoneNumber = ""

        return ResponseEntity(
            accountService.getAccount(phone = phoneNumber), HttpStatus.OK
        )
    }
}
