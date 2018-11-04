package ro.razvan.server.collegeBalanceManager.data.outgoings

import ro.razvan.server.collegeBalanceManager.data.payments.Payment
import ro.razvan.server.collegeBalanceManager.data.users.User

data class Outgoing(
    val id: Int,
    val user: User,
    val payment: Payment,
    val notes: String?
)