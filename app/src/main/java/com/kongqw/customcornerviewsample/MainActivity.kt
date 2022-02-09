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


//        mViewBinding.webView.loadUrl("https://www.baidu.com")
//        mViewBinding.webView.loadUrl("http://www.baidu.com")
        mViewBinding.webView.loadUrl("https://www.iqiyi.com")
    }
}