package com.casey.earmark.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MenuItem
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import arrow.core.Option
import arrow.core.getOrElse
import arrow.core.toOption
import com.casey.earmark.R
import com.google.android.material.appbar.MaterialToolbar
import java.util.*

class AppToolbar : CoordinatorLayout {

    lateinit var materialToolbar: MaterialToolbar
    lateinit var submenuOptionOne: TextView
    lateinit var submenuOptionTwo: TextView
    lateinit var submenuOptionThree: TextView
    lateinit var submenuOptionFour: TextView
    lateinit var subMenuLayout: ConstraintLayout

    lateinit var monthMenuItem: MenuItem

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet?) {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.app_toolbar, this, true)

        materialToolbar = view.findViewById(R.id.topAppBar)
        subMenuLayout = view.findViewById(R.id.submenuLayout)
        submenuOptionOne = view.findViewById(R.id.submenuChange)
        submenuOptionTwo = view.findViewById(R.id.submenu_explanation)
        submenuOptionThree = view.findViewById(R.id.submenu_conclusion)
        submenuOptionFour = view.findViewById(R.id.submenu_add)

        materialToolbar.menu.getItem(0).title = Calendar.getInstance()
            .getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault())

        context.theme.obtainStyledAttributes(attrs, R.styleable.AppToolbar, 0, 0).apply {
            try {
                getText(R.styleable.AppToolbar_title)?.toString().toOption().apply {
                    setToolbarTitle(this)
                }
            } finally {
                recycle()
            }
        }
    }

    private fun setToolbarTitle(title: Option<String>) {
        materialToolbar.title = title.getOrElse { "Earmark" }
    }

    fun setListeners(listener: (MenuItem) -> Boolean) {
        materialToolbar.setOnMenuItemClickListener(listener)
    }
}
