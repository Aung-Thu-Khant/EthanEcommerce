package com.ethantech.ecomerce.models

import android.media.Image

data class Product(
    var id: String,
    var description: String,
    var currency: String,
    var sellingPrice: Float,
    var userId: String,
    var sellerName: String,
    var sellerPhone: String,
    var photoUrls: ArrayList<String>,
    var productImages: ArrayList<Image>,
    var categoryId: String,
    var productDetail: String,
    var quantity: Int,
    var leads: ArrayList<String>

) {

    constructor() : this (
        id = "",
        description = "",
        currency = "",
        sellingPrice = 0F,
        userId = "",
        sellerName = "",
        sellerPhone = "",
        photoUrls = arrayListOf(),
        productImages = arrayListOf(),
        categoryId = "",
        productDetail = "",
        quantity = 0,
        leads = arrayListOf()
    )

    fun convert() {

    }

    fun downloadProductImage() {
        
    }
}
