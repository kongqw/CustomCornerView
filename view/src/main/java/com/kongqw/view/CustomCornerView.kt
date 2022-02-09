package com.kongqw.view

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import android.view.ViewOutlineProvider
import androidx.constraintlayout.widget.ConstraintLayout

class CustomCornerView(context: Context, attrs: AttributeSet?) : ConstraintLayout(context, attrs) {


    private var mCornerRadius: Int = 0

    private var mCornerDirection: Int = 0

    init {

        initAttribute(context, attrs)

        outlineProvider = object : ViewOutlineProvider() {
            override fun getOutline(view: View?, outline: Outline?) {

                val rect = Rect()

                val width = view?.width ?: 0
                val height = view?.height ?: 0

                when (mCornerDirection) {
                    // default 全角
                    0 -> rect.set(0, 0, width, height)
                    // top
                    1 -> rect.set(0, 0, width, height + mCornerRadius)
                    // left
                    2 -> rect.set(0, 0, width + mCornerRadius, height)
                    // right
                    3 -> rect.set(0 - mCornerRadius, 0, width, height)
                    // bottom
                    4 -> rect.set(0, 0 - mCornerRadius, width, height)
                }

                outline?.setRoundRect(rect, mCornerRadius.toFloat())
            }
        }

        clipToOutline = true
    }


    /**
     * 获取自定义属性
     */
    private fun initAttribute(context: Context?, attrs: AttributeSet?) {
        context?.obtainStyledAttributes(attrs, R.styleable.CustomCornerView)?.apply {

            // 圆角
            mCornerRadius = getDimensionPixelSize(R.styleable.CustomCornerView_cornerRadius, 0)

            mCornerDirection = getInt(R.styleable.CustomCornerView_cornerDirection, 0)

            recycle()
        }
    }
}