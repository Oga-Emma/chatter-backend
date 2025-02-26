package app.seven.chatter.repository

import app.seven.chatter.repository.db.AccountEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository : JpaRepository<AccountEntity, String> {
}
