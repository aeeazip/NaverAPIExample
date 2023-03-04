package com.mobile.naverapiexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val thread = Thread {
            var naverPlaceSearch = NaverPlaceSearchAPI()
            naverPlaceSearch.main()
        }.start()
    }
}