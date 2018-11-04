package ro.razvan.server.collegeBalanceManager.data.movements

import org.jetbrains.exposed.dao.IntIdTable
import ro.razvan.server.collegeBalanceManager.data.payments.Payments
import ro.razvan.server.collegeBalanceManager.data.users.Users

object Movements : IntIdTable() {
    val userIdFrom = reference("UserIdFrom", Users)
    val userIdTo = reference("UserIdTo", Users)
    val paymentId = reference("PaymentId", Payments)
    val notes = text("Notes").nullable()
}