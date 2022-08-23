package com.ethantech.ecomerce.onBoarding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ethantech.ecomerce.R

class OnBoardingItemsAdapter(private val onboardingItmes: List<OnBoardingItem>) :
RecyclerView.Adapter<OnBoardingItemsAdapter.OnBoardingItemViewHolder>(){

    inner class OnBoardingItemViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val imageOnBoarding = view.findViewById<ImageView>(R.id.imageOnBoarding)
        private val txtTitle = view.findViewById<TextView>(R.id.txtTitle)
        private val txtDes = view.findViewById<TextView>(R.id.txtDes)

        fun bind(onBoardingItem: OnBoardingItem){
            imageOnBoarding.setImageResource(onBoardingItem.onBoardingImage)
            txtTitle.text = onBoardingItem.title
            txtDes.text = onBoardingItem.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingItemViewHolder {
        return OnBoardingItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.onboarding_item_container,
                parent,false
            )
        )
    }

    override fun onBindViewHolder(holder: OnBoardingItemViewHolder, position: Int) {
        holder.bind(onboardingItmes[position])
    }

    override fun getItemCount(): Int {
        return onboardingItmes.size
    }

}