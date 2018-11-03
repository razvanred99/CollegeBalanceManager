package ro.razvan.server.collegeBalanceManager.data.tables

import org.jetbrains.exposed.dao.IntIdTable

object Outgoings : IntIdTable() {
    val userId = reference("UserId", Users)
    val paymentId = reference("PaymentId", Payments)
    val notes = text("notes").nullable()
}