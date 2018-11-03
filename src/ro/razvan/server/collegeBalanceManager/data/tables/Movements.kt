package ro.razvan.server.collegeBalanceManager.data.tables

import org.jetbrains.exposed.dao.IntIdTable

object Movements : IntIdTable() {
    val userIdFrom = reference("UserIdFrom", Users)
    val userIdTo = reference("UserIdTo", Users)
    val paymentId = reference("PaymentId", Payments)
    val notes = text("Notes").nullable()
}