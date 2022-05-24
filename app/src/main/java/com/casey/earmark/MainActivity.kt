package com.casey.earmark

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.casey.earmark.view.AddDebtFragment
import com.casey.earmark.view.BudgetFragment
import com.casey.earmark.view.DebtFragment
import com.casey.earmark.view.SavingsFragment
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(BudgetFragment())
        /*materialToolbar = findViewById(R.id.topAppBar)
        materialToolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menuMonth -> {
                    it.title = "AUGUST"
                }
                R.id.menuMoreOptions -> {
                    if (submenuLayout.isVisible) {
                        submenuLayout.visibility = View.GONE
                    } else {
                        submenuLayout.visibility = View.VISIBLE
                    }
                }
                R.id.menuAdd -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container, AddDebtFragment()).commit()
                }
            }
            true
        }*/

        bottomNav = findViewById(R.id.bottomNavBar)
        bottomNav.apply {
            selectedItemId = R.id.budget
            setOnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.budget -> {
                        loadFragment(BudgetFragment())
                    }
                    R.id.debt -> {
                        loadFragment(DebtFragment())
                    }
                    R.id.savings -> {
                        loadFragment(SavingsFragment())
                    }
                }
                true
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
    }
}
