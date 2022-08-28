package com.ethantech.ecomerce.models

data class Cart(
    var id: String,
    var total: Float,
    var items: ArrayList<String>,
    var userId: String
) {
    constructor() : this(
        id = "",
        total = 0F,
        items = arrayListOf(),
        userId = ""
    )

    fun convert() {


    }
}
