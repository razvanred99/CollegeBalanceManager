package ro.razvan.server.collegeBalanceManager.data.tables

import org.jetbrains.exposed.dao.IntIdTable
import ro.razvan.server.collegeBalanceManager.data.PaymentType

object Payments : IntIdTable() {
    val amount = decimal("Amount", 13, 2)
    val currency = varchar("Currency", 3)
    val paymentType = enumeration("PaymentType", PaymentType::class)
}