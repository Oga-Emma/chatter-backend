package app.seven.chatter.model.exception

data class AccountNotFoundException(override val message: String): Exception(message)
