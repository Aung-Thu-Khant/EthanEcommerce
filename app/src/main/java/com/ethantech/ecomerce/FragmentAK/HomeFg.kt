package com.ethantech.ecomerce.FragmentAK

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.ethantech.ecomerce.Adapter.HomeBannerAdapter
import com.ethantech.ecomerce.Adapter.HomeBuyAdapter
import com.ethantech.ecomerce.Adapter.HomeCategoryAdapter
import com.ethantech.ecomerce.R
import com.ethantech.ecomerce.modelAk.CategoryHome
import com.ethantech.ecomerce.modelAk.HomeBuyModel
import com.ethantech.ecomerce.onBoarding.OnBoardingItem
import com.ethantech.ecomerce.onBoarding.OnBoardingItemsAdapter
import com.google.android.material.button.MaterialButton

class HomeFg : Fragment() {
    lateinit var homeCategoryAdapter: HomeCategoryAdapter
    lateinit var homeBuyAdapter: HomeBuyAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        var view =  inflater.inflate(R.layout.fragment_home_fg, container, false)
        homeCategoryAdapter = HomeCategoryAdapter(
            listOf(
                CategoryHome(
                    categoryImage = R.drawable.ic_add,
                    categoryTitle = "Mobile",
                ),
                CategoryHome(
                    categoryImage = R.drawable.ic_cate_home,
                    categoryTitle = "Computer",
                ),
                CategoryHome(
                    categoryImage = R.drawable.ic_add,
                    categoryTitle = "AutoMobile",
                ),
            )
        )
        var categoryVp = view.findViewById<RecyclerView>(R.id.categoryVp)
        categoryVp.layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        categoryVp.adapter = homeCategoryAdapter

        homeBuyAdapter = HomeBuyAdapter(
            listOf(
                HomeBuyModel(
                    cateImage = R.drawable.phone,
                    name = "IPad Pro 12 ",
                    price = "AED 7,800.00",
                    promotion = "Promotion",
                    seller = "Aung Thu Khant"
                ),
                HomeBuyModel(
                    cateImage = R.drawable.phone1,
                    name = "IPad Pro 12 ",
                    price = "AED 7,800.00",
                    promotion = "Promotion",
                    seller = "Aung Thu Khant"
                ),
                HomeBuyModel(
                    cateImage = R.drawable.phone2,
                    name = "IPad Pro 12 ",
                    price = "AED 7,800.00",
                    promotion = "Promotion",
                    seller = "Aung Thu Khant"
                ),
            )
        )

        var buyRv = view.findViewById<RecyclerView>(R.id.buyRv)
        buyRv.layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        buyRv.adapter = homeBuyAdapter

        return view;

    }

//    private fun setOnBoardingItems(){
//        homeCategoryAdapter = HomeCategoryAdapter(
//            listOf(
//                CategoryHome(
//                    categoryImage = R.drawable.ic_email,
//                    categoryTitle = "Email",
//                ),
//                CategoryHome(
//                    categoryImage = R.drawable.ic_password,
//                    categoryTitle = "Password",
//                ),
//                CategoryHome(
//                    categoryImage = R.drawable.ic_cate_home,
//                    categoryTitle = "Home",
//                ),
//            )
//        )
//        val categoryVp = view.findViewById<ViewPager2>(R.id.categoryVp)
//        categoryVp.adapter = homeCategoryAdapter
////        categoryVp?.registerOnPageChangeCallback(object :
////            ViewPager2.OnPageChangeCallback(){
////            override fun onPageSelected(position: Int) {
////                super.onPageSelected(position)
////                //setCurrentIndicator(position)
////            }
////        })
////        (onBoardingViewPager.getChildAt(0) as RecyclerView).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
////        findViewById<ImageView>(R.id.imagenext).setOnClickListener{
////            if(onBoardingViewPager.currentItem + 1 < onBoardingItemsAdapter.itemCount){
////                onBoardingViewPager.currentItem += 1
////            }else{
////                ToHome()
////            }
////        }
//
//    }
//    private fun setCurrentIndicator(position: Int){
//        val childCount = indicatorContainer.childCount
//        for(i in 0 until childCount){
//            val imageView = indicatorContainer.getChildAt(i) as ImageView
//            if (i == position){
//                imageView.setImageDrawable(
//                    ContextCompat.getDrawable(applicationContext,
//                    R.drawable.indicator_active_bg
//                ))
//            }else{
//                imageView.setImageDrawable(
//                    ContextCompat.getDrawable(applicationContext,
//                    R.drawable.indicator_inactive_bg
//                ))
//            }
//        }
//    }

}