package com.ethantech.ecomerce.Home

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.ethantech.ecomerce.FragmentAK.*
import com.ethantech.ecomerce.R
import com.google.android.material.navigation.NavigationView

class Homepage : AppCompatActivity() {
    lateinit var toggle : ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        loadFragment(HomeFg(),true)

        var dl = findViewById<DrawerLayout>(R.id.navi_drawer_layout);
        var nv = findViewById<NavigationView>(R.id.navi_view)
        toggle = ActionBarDrawerToggle(this,dl,R.string.open,R.string.close);

        dl.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        nv.setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener { item ->
            val id = item.itemId
            when (id) {
                R.id.buy -> {
                    loadFragment(HomeFg(), true)
                    dl.closeDrawers()
                }
                R.id.sell -> {
                    loadFragment(ProductDetail(), true)
                    dl.closeDrawers()
                }
                R.id.cart -> {
                    loadFragment(CartFg(), true)
                    dl.closeDrawers()
                }
                R.id.orderlist -> {
                    loadFragment(OrderListFg(), true)
                    dl.closeDrawers()
                }
                R.id.history -> {
                    loadFragment(HistoryFg(), true)
                    dl.closeDrawers()
                }
                R.id.profile -> {
                    loadFragment(ProfileFg(), true)
                    dl.closeDrawers()
                }
                R.id.aboutapp -> {
                    loadFragment(AboutFg(), true)
                    dl.closeDrawers()
                }
                R.id.logout -> {
                    loadFragment(HomeFg(), true)
                    dl.closeDrawers()
                }
                else -> return@OnNavigationItemSelectedListener false
            }
            true
        })

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (toggle.onOptionsItemSelected(item)) true else super.onOptionsItemSelected(
            item!!
        )
    }

    fun loadFragment(fragment: Fragment, stack: Boolean) {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        if (stack) {
            transaction.addToBackStack(fragment.tag)
        }
        transaction.replace(R.id.to_replace, fragment)
        transaction.commit()
    }
}