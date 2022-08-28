package com.ethantech.ecomerce.models

data class ProductCategory(
    var id: String,
    var name: String,
    var categoryImage: String
) {
    constructor() : this(
        id = "",
        name = "",
        categoryImage = ""
    )

    fun convert() {

    }
}
