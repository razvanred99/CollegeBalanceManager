package ro.razvan.server.collegeBalanceManager.data.users

import org.jetbrains.exposed.dao.IntIdTable

object Users : IntIdTable() {
    val username = varchar("Username", 64).uniqueIndex()
    val password = varchar("Password", 128)
    val firstName = varchar("FirstName", 64)
    val lastName = varchar("LastName", 64)
}