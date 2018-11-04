package ro.razvan.server.collegeBalanceManager.data.outgoings

import org.jetbrains.exposed.dao.IntIdTable
import ro.razvan.server.collegeBalanceManager.data.payments.Payments
import ro.razvan.server.collegeBalanceManager.data.users.Users

object Outgoings : IntIdTable() {
    val userId = reference("UserId", Users)
    val paymentId = reference("PaymentId", Payments)
    val notes = text("notes").nullable()
}