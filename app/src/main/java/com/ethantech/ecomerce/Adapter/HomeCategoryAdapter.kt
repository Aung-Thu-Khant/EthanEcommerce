package com.ethantech.ecomerce.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ethantech.ecomerce.R
import com.ethantech.ecomerce.modelAk.CategoryHome
import com.ethantech.ecomerce.onBoarding.OnBoardingItem
import com.ethantech.ecomerce.onBoarding.OnBoardingItemsAdapter

class HomeCategoryAdapter (private val homeCategoryItems: List<CategoryHome>) :
    RecyclerView.Adapter<HomeCategoryAdapter.HomeCategoryViewHolder>(){

    inner class HomeCategoryViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val categoryImage = view.findViewById<ImageView>(R.id.categoryImageView)
        private val categoryTitle = view.findViewById<TextView>(R.id.categoryTitle)

        fun bind(categoryHome: CategoryHome){
            categoryImage.setImageResource(categoryHome.categoryImage)
            categoryTitle.text = categoryHome.categoryTitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeCategoryViewHolder {
        return HomeCategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.cate_layout_home,
                parent,false
            )
        )
    }

    override fun onBindViewHolder(holder: HomeCategoryViewHolder, position: Int) {
        holder.bind(homeCategoryItems[position])    }

    override fun getItemCount(): Int {
        return homeCategoryItems.size
    }


}