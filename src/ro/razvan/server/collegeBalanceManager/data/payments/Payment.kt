package ro.razvan.server.collegeBalanceManager.data.payments

import ro.razvan.server.collegeBalanceManager.data.PaymentType

data class Payment(
    val id: Int,
    val amount: Number,
    val currency: String, //todo implement Currency class
    val paymentType: PaymentType
)