package ro.razvan.server.collegeBalanceManager.data.movements

import ro.razvan.server.collegeBalanceManager.data.payments.Payment
import ro.razvan.server.collegeBalanceManager.data.users.User

data class Movement(
    val userFrom: User,
    val userTo: User,
    val payment: Payment,
    val notes: String?
)