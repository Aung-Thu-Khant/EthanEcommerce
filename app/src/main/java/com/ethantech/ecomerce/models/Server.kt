package com.ethantech.ecomerce.models

import android.media.Image
import java.util.*
import kotlin.collections.ArrayList

class Server {
    val AppWriteProjectId = "62d10dce892f6ef4dce7"
    val AppWriteAPIEndpoint = "http://157.245.159.39/v1"
    val databaseId = "62d54affde748747f6e3"

    val productCollectionId = "62d54b0ac5b17e734051"
    val orderCollectionId = "62d54b173cb1a958dfe9"
    val categoryCollectionId = "62d54b36729bece53a17"
    val cartCollectionId = "62d54fedd93a781be902"

    val bucketId = "62e8e09f4b04baea5b17"

    fun getClient() {}

    fun createUser(name: String, email: String, password: String) {}

    fun getUser() {}

    fun login(email: String, password: String) {}

    fun logout() {}
}
//-----------------------------


//Product Read and Write
fun Server.createProduct(
    description: String,
    currency: String,
    sellingPrice: Float,
    categoryId: String,
    productDetail: String,
    photoUrls: ArrayList<String>,
    quantity: Int,
    userId: String,
    sellerName: String,
    sellerPhone: String,
    leads: ArrayList<String>
) {}

fun Server.updateProduct(productId: String, key: String, value: Any) {}

fun Server.getProduct(productId: String): Product? { return null }

fun Server.getProductList(): ArrayList<Product> { return arrayListOf() }
//-----------------------------


//Order Read and Write
fun Server.createOrder(
    items: ArrayList<String>,
    buyerId: String,
    sellerId: String,
    deliveryCost: Float,
    contactPersonName: String,
    deliveryAddress: String,
    contactPersonPhone: String,
    deliveryDate: Date?,
    subTotal: Float,
    total: Float,
    isCOD: Boolean,
    buyerNote: String
) {}

fun Server.convertStringFromDate(date: Date?): String { return "" }

fun Server.updateOrder(orderId: String, key: String, value: Any) {}

fun Server.getOrder(orderId: String): Order? { return null }

fun Server.getOrderList(isOrderHistory: Boolean): ArrayList<Order> { return arrayListOf() }
//-----------------------------


//Category Read and Write
fun Server.createCategory(category: ProductCategory) {}

fun Server.updateCategory(categoryId: String, key: String, value: Any) {}

fun Server.getCategory(categoryId: String): ProductCategory? { return null }

fun Server.getCategoryList(): ArrayList<ProductCategory> { return arrayListOf() }
//-----------------------------


//Cart Read and Write
fun Server.createCart(
    total: Float,
    items: ArrayList<String>,
    userId: String
) {}

fun addToCart(cardId: String, key: String, value: Any) {}
//-----------------------------


//Image Read and Write
fun Server.updateImage(fileId: String) {}

fun Server.saveImage(image: Image) {}

fun Server.getImage(imageId: String): Image? { return null }

fun Server.deleteImage(fileId: String) {}
//-----------------------------

