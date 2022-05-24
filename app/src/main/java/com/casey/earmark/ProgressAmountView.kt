package com.casey.Earmark

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.casey.earmark.R
import com.google.android.material.progressindicator.LinearProgressIndicator

class ProgressAmountView : ConstraintLayout {

    lateinit var total: TextView
    lateinit var current: TextView
    lateinit var interest: TextView
    lateinit var progressBar: LinearProgressIndicator

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs)
    }

    fun init(context: Context, attrs: AttributeSet?) {

        val view = LayoutInflater.from(context)
            .inflate(R.layout.view_progress_amount, this, true)

        total = view.findViewById(R.id.debtTotalAmount)
        current = view.findViewById(R.id.debtCurrentAmount)
        interest = view.findViewById(R.id.debtInterestAmount)
        progressBar = view.findViewById(R.id.progress_bar)

        context.theme.obtainStyledAttributes(attrs, R.styleable.ProgressAmountView, 0, 0).apply {
            try {
                getText(R.styleable.ProgressAmountView_totalText)?.toString().apply {
                    setTotalAmount(this ?: "0")
                }
                getText(R.styleable.ProgressAmountView_currentText)?.toString().apply {
                    setCurrentAmount(this ?: "0")
                }
                getText(R.styleable.ProgressAmountView_interestText)?.toString().apply {
                    setInterestAmount(this ?: "0")
                }
            } finally {
                recycle()
            }
        }
    }

    fun setTotalAmount(total: String) {
        this.total.text = total
    }

    fun setCurrentAmount(current: String) {
        this.current.text = current
    }

    fun setInterestAmount(interest: String) {
        this.interest.text = interest
    }
}
