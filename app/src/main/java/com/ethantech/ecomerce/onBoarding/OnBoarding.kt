package com.ethantech.ecomerce.onBoarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.ethantech.ecomerce.LoginRegister.Login
import com.ethantech.ecomerce.R
import com.google.android.material.button.MaterialButton
import maes.tech.intentanim.CustomIntent

class OnBoarding : AppCompatActivity() {
    lateinit var onBoardingItemsAdapter: OnBoardingItemsAdapter
    lateinit var indicatorContainer: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnBoardingItems()
        setupIndicators()
        setCurrentIndicator(0)
    }

    private fun setOnBoardingItems(){
        onBoardingItemsAdapter = OnBoardingItemsAdapter(
            listOf(
                OnBoardingItem(
                    onBoardingImage = R.drawable.ex,
                    title = " Ethan Tech 1",
                    description = "Hey Ethan Tech Company Hey Ethan Tech Company Hey Ethan Tech Company Hey Ethan Tech Company"
                ),
                OnBoardingItem(
                    onBoardingImage = R.drawable.ex,
                    title = " Ethan Tech 2",
                    description = "Software Engineering Software Engineering Software Engineering  Software Engineering Software Engineering"
                ),
                OnBoardingItem(
                    onBoardingImage = R.drawable.ex,
                    title = " Ethan Tech 3",
                    description = "Aung Thu Khant Aung Thu Khant Aung Thu Khant Aung Thu Khant"
                ),
            )
        )
        val onBoardingViewPager = findViewById<ViewPager2>(R.id.onBoardingVp)
        onBoardingViewPager.adapter = onBoardingItemsAdapter
        onBoardingViewPager.registerOnPageChangeCallback(object :
        ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })
        (onBoardingViewPager.getChildAt(0) as RecyclerView).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
        findViewById<ImageView>(R.id.imagenext).setOnClickListener{
            if(onBoardingViewPager.currentItem + 1 < onBoardingItemsAdapter.itemCount){
                onBoardingViewPager.currentItem += 1
            }else{
                ToHome()
            }
        }
        findViewById<TextView>(R.id.txtSkip).setOnClickListener{
            ToHome()
        }
        findViewById<MaterialButton>(R.id.materialButton).setOnClickListener {
            ToHome()
        }
    }

    private fun setupIndicators(){
        indicatorContainer = findViewById(R.id.indicatorContainer)
        val indicators = arrayOfNulls<ImageView>(onBoardingItemsAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams =
            LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            layoutParams.setMargins(8,0,8,0)
        for(i in indicators.indices){
            indicators[i] = ImageView(applicationContext)
            indicators[i]?.let {
                it.setImageDrawable(
                    ContextCompat.getDrawable(applicationContext, R.drawable.indicator_inactive_bg)
                )
                it.layoutParams = layoutParams
                indicatorContainer.addView(it)
            }
        }
    }

    private fun setCurrentIndicator(position: Int){
        val childCount = indicatorContainer.childCount
        for(i in 0 until childCount){
            val imageView = indicatorContainer.getChildAt(i) as ImageView
            if (i == position){
                imageView.setImageDrawable(ContextCompat.getDrawable(applicationContext,
                    R.drawable.indicator_active_bg
                ))
            }else{
                imageView.setImageDrawable(ContextCompat.getDrawable(applicationContext,
                    R.drawable.indicator_inactive_bg
                ))
            }
        }
    }

    private fun ToHome(){
        startActivity(Intent(this, Login::class.java))
        finish()
        //CustomIntent.customType(this, "fadein-to-fadeout");
    }

}