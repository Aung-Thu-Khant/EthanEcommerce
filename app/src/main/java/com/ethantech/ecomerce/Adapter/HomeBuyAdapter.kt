package com.ethantech.ecomerce.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ethantech.ecomerce.R
import com.ethantech.ecomerce.modelAk.BannerModelHome
import com.ethantech.ecomerce.modelAk.CategoryHome
import com.ethantech.ecomerce.modelAk.HomeBuyModel


class HomeBuyAdapter (private val homeBuyCategoryItems: List<HomeBuyModel>) :
    RecyclerView.Adapter<HomeBuyAdapter.HomeBuyViewHolder>(){

    inner class HomeBuyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val cateImage = view.findViewById<ImageView>(R.id.cateImage)
        private val name = view.findViewById<TextView>(R.id.name)
        private val price = view.findViewById<TextView>(R.id.price)
        private val promotion = view.findViewById<TextView>(R.id.promotion)
        private val seller = view.findViewById<TextView>(R.id.seller)

        fun bind(homeBuyModelHome: HomeBuyModel){
            cateImage.setImageResource(homeBuyModelHome.cateImage)
            name.text = homeBuyModelHome.name
            price.text = homeBuyModelHome.price
            promotion.text = homeBuyModelHome.promotion
            seller.text = homeBuyModelHome.seller
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeBuyViewHolder {
        return HomeBuyViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.home_rv_layout,
                parent,false
            )
        )
    }

    override fun onBindViewHolder(holder: HomeBuyViewHolder, position: Int) {
        holder.bind(homeBuyCategoryItems[position])
    }

    override fun getItemCount(): Int {
        return homeBuyCategoryItems.size
    }
}