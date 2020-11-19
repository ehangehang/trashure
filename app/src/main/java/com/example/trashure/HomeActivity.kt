package com.example.trashure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.example.trashure.homefragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    private val homeFrameLayout: FrameLayout? = null

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.homeFrameLayout, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.homeNavBeranda -> {
                val fragment = BerandaFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.homeNavPenukaran -> {
                val fragment = PenukaranFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.homeNavScan -> {
                val fragment = ScanFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.homeNavHarga -> {
                val fragment = HargaFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.homeNavAkun -> {
                val fragment = AkunFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bottomNav: BottomNavigationView = findViewById(R.id.homeNav)
        bottomNav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }
}