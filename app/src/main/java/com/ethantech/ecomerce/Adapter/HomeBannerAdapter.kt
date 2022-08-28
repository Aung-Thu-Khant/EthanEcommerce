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

class HomeBannerAdapter  (private val homeBannerItems: List<BannerModelHome>) :
    RecyclerView.Adapter<HomeBannerAdapter.HomeBannerViewHolder>(){


    inner class HomeBannerViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val bannerImage = view.findViewById<ImageView>(R.id.bannerImage)
        fun bind(bannerHome: BannerModelHome){
            bannerImage.setImageResource(bannerHome.bannerImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeBannerViewHolder {
        return HomeBannerViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.home_banner_layout,
                parent,false
            )
        )
    }

    override fun onBindViewHolder(holder: HomeBannerViewHolder, position: Int) {
        holder.bind(homeBannerItems[position])    }

    override fun getItemCount(): Int {
        return homeBannerItems.size
    }


}