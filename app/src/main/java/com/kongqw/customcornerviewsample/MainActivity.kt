package com.kongqw.customcornerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kongqw.customcornerviewsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mViewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)


        mViewBinding.webView1.loadUrl("https://github.com/kongqw")
        mViewBinding.webView2.loadUrl("https://github.com/kongqw")
        mViewBinding.webView3.loadUrl("https://github.com/kongqw")
        mViewBinding.webView4.loadUrl("https://github.com/kongqw")
        mViewBinding.webView5.loadUrl("https://github.com/kongqw")
    }
}