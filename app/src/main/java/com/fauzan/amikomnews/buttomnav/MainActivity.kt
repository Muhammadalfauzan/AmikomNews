package com.fauzan.amikomnews.buttomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fauzan.amikomnews.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fcMain, HomeFragment())
            .commit()
        buttomNav.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.nav_home ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fcMain, HomeFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true

                }
                R.id.nav_favorit ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fcMain, FavoritFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true

                }
                R.id.nav_profil -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fcMain, ProfileFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }
}