package com.ethantech.ecomerce.models

import java.util.*
import kotlin.collections.ArrayList

data class Order(
    var id: String,
    var items: ArrayList<String>,
    var buyerId: String,
    var sellerId: String,
    var deliveryCost: Float,
    var contactPersonName: String,
    var deliveryAddress: String,
    var contactPersonPhone: String,
    var deliveryDate: Date?,
    var subTotal: Float,
    var total: Float,
    var isCOD: Boolean,
    var buyerNote: String
) {
    constructor() : this (
        id = "",
        items = arrayListOf(),
        buyerId = "",
        sellerId = "",
        deliveryCost = 0F,
        contactPersonName = "",
        deliveryAddress = "",
        contactPersonPhone = "",
        deliveryDate = null,
        subTotal = 0F,
        total = 0F,
        isCOD = false,
        buyerNote = ""
    )

    fun convert() {}

    private fun convertDateFromString(dateString: String): Date? {


        return null
    }
}
